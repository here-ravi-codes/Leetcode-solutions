class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                res += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return res;
    }
}