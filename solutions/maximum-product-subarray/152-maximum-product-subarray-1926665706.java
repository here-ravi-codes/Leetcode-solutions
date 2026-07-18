class Solution {
    public int maxProduct(int[] nums) {
        int maxPrd = 1; 
        int minPrd = 1;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int temp1 = maxPrd * nums[i];
            int temp2 = minPrd * nums[i];
            maxPrd = Math.max(temp1, Math.max(temp2, nums[i]));
            minPrd = Math.min(temp1, Math.min(temp2, nums[i]));
            res = Math.max(res, maxPrd);
        }
        return res;
    }
}