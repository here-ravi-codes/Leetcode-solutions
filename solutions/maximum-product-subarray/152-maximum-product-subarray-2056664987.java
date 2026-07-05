class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int res = nums[0];
        for(int i = 1; i < n; i++){
            int tempMax = nums[i] * maxProd;
            int tempMin = nums[i] * minProd;
            maxProd = Math.max(nums[i], Math.max(tempMax, tempMin));
            minProd = Math.min(nums[i], Math.min(tempMax, tempMin));
            res = Math.max(res, maxProd);
        }
        return res;
    }
}