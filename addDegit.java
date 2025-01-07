/*
link ---> https://leetcode.com/problems/add-digits/?envType=problem-list-v2&envId=math
*/
class Solution {
    int one(int num){
        int n = 0;
        while(num>0){
            n=n+(num%10);
            num=num/10;
        }
        return n;
    }
    public int addDigits(int num) {
        int n = num;
        while(n/10!=0){
            n = one(n);
        }
        return n;
    }
}
