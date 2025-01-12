/*
link ---> https://leetcode.com/problems/search-in-rotated-sorted-array/
*/
class Solution {
    public int search(int[] nums, int t) {
        int n = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
                n=i;
                break;
            }
        }
        return n;
    }
}
