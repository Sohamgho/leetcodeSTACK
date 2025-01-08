/*
link ----> https://leetcode.com/problems/divide-two-integers/
*/

class Solution {
    public int divide(int nume, int deno) {
        if (nume == Integer.MIN_VALUE && deno == -1) {
            return Integer.MAX_VALUE;
        }
        return nume/deno;
    }
}
