class Solution {

    public long power(long x, long n){
        long MOD = 1_000_000_007;
        if(n == 0) return 1;
        long ans = power(x, n / 2);
        if(n % 2 == 1){
            return (ans * ans * x) % MOD;
        }
        else{
            return (ans * ans) % MOD;
        }
    }

    public int countGoodNumbers(long n) {
        long MOD = 1_000_000_007;
        long oddPositions = n / 2;
        long evenPositions = (n + 1) / 2;
        return (int)((power(5, evenPositions) * power(4, oddPositions)) % MOD);
    }
}