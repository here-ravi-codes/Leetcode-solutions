class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int ans = nums[0] ^ nums[1];
        for(int i = 2; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}