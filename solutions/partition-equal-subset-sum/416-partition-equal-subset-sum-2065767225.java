class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // If total sum is odd, equal partition is impossible
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];
        // Base Case 1:
        // Sum = 0 can always be formed by taking no elements.
        for (int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        // Base Case 2:
        // Using only the first element.
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        // Fill DP table
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                // Skip current element
                boolean notTake = dp[i - 1][j];
                // Take current element
                boolean take = false;
                if (j >= nums[i]) {
                    take = dp[i - 1][j - nums[i]];
                }
                dp[i][j] = take || notTake;
            }
        }
        return dp[nums.length - 1][target];
    }
}