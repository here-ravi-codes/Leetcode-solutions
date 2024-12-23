class Solution {
    public int fib(int n) {
        // if(n == 0) return 0;
        // if(n == 1) return 1;
        // return fib(n - 1) + fib(n - 2);

        if(n <= 1) return n;
        int first = 0; 
        int second = 1;
        for(int i = 2; i <= n; i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}