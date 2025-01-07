/*
link ----> https://leetcode.com/problems/power-of-two/?envType=problem-list-v2&envId=math
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}

/*

----solution 2------

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; 
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1; 
    }
}
*/
