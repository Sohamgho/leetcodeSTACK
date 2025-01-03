class Solution {
    public int waysToSplitArray(int[] nums) {
    int count = 0;
    long totalSum = 0;
    long leftSum = 0;

    // Calculate the total sum of the array
    for (int num : nums) {
        totalSum += num;
    }

    // Iterate and calculate leftSum and rightSum dynamically
    for (int i = 0; i < nums.length - 1; i++) {
        leftSum += nums[i];
        long rightSum = totalSum - leftSum;
        
        if (leftSum >= rightSum) {
            count++;
        }
    }

    return count;
}

}