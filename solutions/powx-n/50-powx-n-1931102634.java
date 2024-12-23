class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        if(nn < 0){
            nn = -nn;
            double result = power(x, nn);
            return 1 / result;
        }
        else{
            return power(x, nn);
        }
    }

    public double power(double x, long n){
        if(n == 0) return 1.0;
        double ans = power(x, n / 2);
        if(n % 2 == 1){
            return ans * ans * x;
        }
        else{
            return ans * ans;
        }
    }
}