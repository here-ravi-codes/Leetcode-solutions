class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        Set<String> words = new HashSet<>(wordDict);
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] == true && words.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}