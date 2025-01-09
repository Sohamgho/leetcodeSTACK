/*
link --> https://leetcode.com/problems/counting-words-with-a-given-prefix/?envType=daily-question&envId=2025-01-09
*/
class Solution {
    boolean isPrefix(String w, String w2) {
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
        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            if(isPrefix(pref,words[i])){
                count++;
            }
        }
        return count;
    }
}
