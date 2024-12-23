class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] == true){
                    for(String word : wordDict){
                        if(s.substring(j, i).equals(word)){
                            dp[i] = true;
                        }
                    }
                }
            }
        }
        return dp[n];
    }
}