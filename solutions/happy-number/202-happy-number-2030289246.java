class Solution {
    public boolean isHappy(int n) {
        // Set<Integer> seen = new HashSet<>();
        // while(n != 1 && !seen.contains(n)){
        //     seen.add(n);
        //     n = findNext(n);
        // }
        // return n == 1;

        int slow = n;
        int fast = n;
        do{
            slow = findNext(slow);
            fast = findNext(findNext(fast));
        }while(slow != fast);
        return slow == 1;
    }
    private int findNext(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}