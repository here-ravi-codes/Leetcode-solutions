class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int indexSum = 0;
        // int arraySum = 0;
        // for(int i = 0; i < n; i++){
        //     indexSum += i;
        //     arraySum += nums[i];
        // }
        // indexSum += n;
        // return indexSum - arraySum;

        int n = nums.length;
        int res = 0 ^ nums[0];
        for(int i = 1; i < n; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res ^ n;
    }
}