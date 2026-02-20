class Solution {
    public void moveZeroes(int[] nums) {
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == 0) break;
        }
        int j = i + 1;
        for(; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}