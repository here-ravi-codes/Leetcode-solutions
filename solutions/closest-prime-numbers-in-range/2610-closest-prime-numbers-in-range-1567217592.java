class Solution {
    public int[] closestPrimes(int left, int right) {
        int firstPrime = -1;
        int secondPrime = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};
        
        for(int i = left; i <= right; i++){
            if(isPrime(i)){
                if(firstPrime == -1){
                    firstPrime = i;
                }
                else {
                    int diff = i - firstPrime;
                    if(diff < minDiff){
                        minDiff = diff;
                        result[0] = firstPrime;
                        result[1] = i;
                    }
                    firstPrime = i;
                }
            }
        }
        return result;
    }
    
    private boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
