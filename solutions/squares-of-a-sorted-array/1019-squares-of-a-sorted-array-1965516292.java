class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        while(i <= j){
            int l = nums[i] * nums[i];
            int r = nums[j] * nums[j];
            if(l < r){
                result[k] = r;
                j--;
            }
            else{
                result[k] = l;
                i++;
            }
            k--;
        }
        return result;
    }
}