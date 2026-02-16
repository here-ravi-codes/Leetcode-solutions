class Solution {
    public int reverse(int x) {
        int sign = 1;
        if(x < 0){
            sign = -1;
            x *= -1;
        }
        int output = 0;
        while(x > 0){
            if( output > Integer.MAX_VALUE / 10) return 0;
            output = (output * 10) + (x % 10);
            x /= 10;
        }
        return output * sign;
    }
}