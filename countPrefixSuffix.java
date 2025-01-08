/*
link ----> https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/?envType=daily-question&envId=2025-01-08
*/

class Solution {
    boolean isPrefixAndSuffix(String w, String w2) {
        int n = w.length();
        int m = w2.length();
        if (n > m) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (w.charAt(i) != w2.charAt(i)) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (w.charAt(n - 1 - i) != w2.charAt(m - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}
