class Solution {
    public int minimumRecolors(String s, int k) {
        int n = s.length();
        int w[] = new int[n];
        
        // Step 1: Build the prefix sum array for 'W'
        if(s.charAt(0) == 'W') w[0] = 1;
        else w[0] = 0;
        
        for(int i=1; i<n; i++){
            if(s.charAt(i) == 'W'){
                w[i] = w[i-1] + 1;
            }else{
                w[i] = w[i-1];
            }
        }
        
        // Step 2: Sliding window to get minimum recolors
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-k; i++){
            int j = i + k - 1;
            // Count whites in window i to j
            int wbet = w[j] - (i > 0 ? w[i-1] : 0);
            min = Math.min(min, wbet);
        }
        return min;
    }
}
