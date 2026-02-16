class Solution {
    public boolean isPalindrome(int x) {
        // if(x < 0) return false;
        // String ans = Integer.toString(x);
        // int n = ans.length();
        // int left = 0;
        // int right = n - 1;
        // while( left < right){
        //     if(ans.charAt(left++) != ans.charAt(right--)) return false;
        // }
        // return true;


        if(x < 0) return false;
        int original = x;
        int reverse = 0;
        while( x > 0){
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return original == reverse;
    }
}