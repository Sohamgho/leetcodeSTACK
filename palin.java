/*
link of question--->  https://leetcode.com/problems/unique-length-3-palindromic-subsequences/description/?envType=daily-question&envId=2025-01-04
*/
class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Map<Character, List<Integer>> c = new HashMap<>();
        Set<String> h = new HashSet<>();
        for (int i = 0; i < n; i++) {
            c.putIfAbsent(s.charAt(i), new ArrayList<>());
            c.get(s.charAt(i)).add(i);
        }
        for (Map.Entry<Character, List<Integer>> entry : c.entrySet()) {
            char c = entry.getKey();
            List<Integer> indices = entry.getValue();
            int size = indices.size();
            if (size > 1) {
                int start = indices.get(0);
                int end = indices.get(size - 1);
                for (int i = start + 1; i < end; i++) {
                    String palindrome = c + "" + s.charAt(i) + c;
                    h.add(palindrome);
                }
            }
        }
        return h.size();
    }
}
