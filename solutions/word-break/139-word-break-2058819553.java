class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        Arrays.fill(dp, false);
        dp[0] = true;
        Set<String> words = new HashSet<>(wordDict);
        int maxLength = 0;
        for(String word : wordDict){
            maxLength = Math.max(maxLength, word.length());
        }
        for(int i = 1; i < dp.length; i++){
            for(int j = i - 1; j >= Math.max(0, i - maxLength); j--){
                if(dp[j] == true && words.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}