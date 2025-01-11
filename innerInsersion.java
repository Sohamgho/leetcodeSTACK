/*
link ----> https://leetcode.com/problems/intersection-of-two-arrays/?envType=problem-list-v2&envId=sorting
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums1){
            for(int j: nums2){
                if(i==j && h.contains(i)==false){
                    h.add(i);
                }
            }
        }
        int arr[] = new int[h.size()];
        int j=0;
        for(int i: h){
            arr[j]=i;
            j++;
        }
        return arr;
    }
}
