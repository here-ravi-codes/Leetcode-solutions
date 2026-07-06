class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        for(int num : nums){
            for(int currSum = target; currSum >= num; currSum--){
                dp[currSum] = dp[currSum] || dp[currSum - num];
            }
        }
        return dp[target];
    }
}