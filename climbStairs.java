/*
link ----> https://leetcode.com/problems/climbing-stairs/
*/
class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int first = 1;
        int second = 1;
        
        for (int i = 2; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        
        return second;
    }

}
