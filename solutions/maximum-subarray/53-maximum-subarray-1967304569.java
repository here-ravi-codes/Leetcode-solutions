class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int runningSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            runningSum += nums[i];
            runningSum = Math.max(nums[i], runningSum);
            maxSum = Math.max(maxSum, runningSum);
        }
        return maxSum;
    }
}