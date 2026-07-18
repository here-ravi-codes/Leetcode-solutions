class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        int index = 0;
        int currSum = 0;
        dp = new Boolean[nums.length][target + 1];
        return dfs(nums, index, currSum, target);
    }
    private boolean dfs(int[] nums, int index, int currSum, int target){
        if(currSum == target) return true;
        if(currSum > target) return false;
        if(index == nums.length) return false;
        if(dp[index][currSum] != null) return dp[index][currSum];
        boolean ans = dfs(nums, index + 1, currSum + nums[index], target) || dfs(nums, index + 1, currSum, target);
        dp[index][currSum] = ans;
        return ans;
    }
} 