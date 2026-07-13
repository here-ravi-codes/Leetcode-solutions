class Solution {
    Integer[][] dp;
    public int findTargetSumWays(int[] nums, int target) {
        dp = new Integer[nums.length][2001];
        int index = 0;
        int currSum = 0;
        return dfs(nums, index, currSum, target);
    }
    private int dfs(int[] nums, int index, int currSum, int target){
        if(index == nums.length){
            if(currSum == target){
                return 1;
            }
            else return 0;
        }
        int offset = 1000;
        if(dp[index][currSum + offset] != null) return dp[index][currSum + offset];
        int ways =  dfs(nums, index + 1, currSum + nums[index], target) + dfs(nums, index + 1, currSum - nums[index], target);
        dp[index][currSum + offset] = ways;
        return ways;
    }
}