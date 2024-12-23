class Solution {
    public int findTargetSumWays(int[] nums, int target) {
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
        return dfs(nums, index + 1, currSum + nums[index], target) + dfs(nums, index + 1, currSum - nums[index], target);
    }
}