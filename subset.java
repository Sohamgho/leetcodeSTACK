/*
link --> https://leetcode.com/problems/word-subsets/?envType=daily-question&envId=2025-01-10
*/
class Solution {
    private boolean isSubset(String a, String b) {
        int[] freqA = new int[26];
        int[] freqB = new int[26];
        for (char c : a.toCharArray()) {
            freqA[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            freqB[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freqA[i] < freqB[i]) {
                return false;
            }
        }
        return true;
    }
    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String b : words2) {
            int[] freqB = new int[26];
            for (char c : b.toCharArray()) {
                freqB[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freqB[i]);
            }
        }
        
        List<String> result = new ArrayList<>();
        for (String a : words1) {
            int[] freqA = new int[26];
            for (char c : a.toCharArray()) {
                freqA[c - 'a']++;
            }
            
            boolean isValid = true;
            for (int i = 0; i < 26; i++) {
                if (freqA[i] < maxFreq[i]) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                result.add(a);
            }
        }
        
        return result;
    }
}
