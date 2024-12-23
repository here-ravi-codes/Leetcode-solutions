class Solution {
    public int reverse(int x) {
        int x1 = Math.abs(x);
        int sum = 0; 
        while(x1 > 0){
            int digit = x1%10;
            if(sum > Integer.MAX_VALUE / 10 || sum < Integer.MIN_VALUE / 10) return 0;
            sum = sum*10 + digit;
            x1/=10;
        }
        if(x < 0) return -sum;
        else return sum;
    }
}