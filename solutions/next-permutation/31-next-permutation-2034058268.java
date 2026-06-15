class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -1;
        int n = nums.length;
        // find the breakpoint 
        for(int i = nums.length - 2;i >= 0;i--){
            if(nums[i] < nums[i + 1]){
                ind1 = i;
                break;
            }
        }
        // if there is no next permutation, just reverse to get the first permutataion
        if(ind1 == -1) reverse(nums, 0);
        // else find ind2 just greater than ind1 index value and swap ind1 and ind2 index value
        else{
            for(int i = n - 1; i >= 0; i--){
                if(nums[i] > nums[ind1]){
                    ind2 = i;
                    break;
                }
            }
            swap(nums, ind1, ind2);
            //then just reverse the remaining list from ind + 1 to the end
            reverse(nums, ind1 + 1);
        }
    }
    public void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}