class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int currAmount = 1; currAmount <= amount; currAmount++){
            for(int coin : coins){
                if(coin <= currAmount){
                    dp[currAmount] = Math.min(dp[currAmount], dp[currAmount - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}