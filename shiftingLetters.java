/*
link of the question ---> https://leetcode.com/problems/shifting-letters-ii/?envType=daily-question&envId=2025-01-05
*/
class Solution {
    public String shiftingLetters(String s, int[][] sh) {
        int n = s.length();
        int[] shiftArr = new int[n + 1];
        for (int[] range : sh) {
            int start = range[0];
            int end = range[1];
            int direction = range[2];
            
            if (direction == 0) {
                shiftArr[start] -= 1;
                shiftArr[end + 1] += 1;
            } else {
                shiftArr[start] += 1;
                shiftArr[end + 1] -= 1;
            }
        }
        int shift = 0;
        for (int i = 0; i < n; i++) {
            shift += shiftArr[i];
            shiftArr[i] = shift; 
        }
        char[] str = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int netShift = shiftArr[i] % 26; 
            if (netShift < 0) { 
                netShift += 26;
            }
            str[i] = (char) ((str[i] - 'a' + netShift) % 26 + 'a');
        }
        
        return new String(str);
    }
}
