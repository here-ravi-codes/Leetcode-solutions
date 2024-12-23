class Solution {
    public int totalHammingDistance(int[] nums) {
        // int n = nums.length;
        // int res = 0;
        // for(int i = 0; i < n - 1; i++){
        //     for(int j = i + 1; j < n; j++){
        //         res += Integer.bitCount(nums[i] ^ nums[j]);
        //     }
        // }
        // return res;

        int n = nums.length;
        int res = 0;
        for(int i = 0; i < 32; i++){
            int ones = 0;
            for(int num : nums){
                if(((num >> i) & 1) == 1) ones++;
            }
            int zeros = n - ones;
            int total = ones * zeros;
            res += total;
        }
        return res;
    }
}