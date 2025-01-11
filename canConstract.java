/*
link ---> https://leetcode.com/problems/construct-k-palindrome-strings/?envType=daily-question&envId=2025-01-11
*/
class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= k;
    }
}
