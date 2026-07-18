class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;
        int pos = 0; 
        int neg = 1;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                arr[pos] = nums[i];
                pos += 2;
            }
            else{
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;



        // int l = nums.length;
        // int[] positives = new int[l/2];
        // int p = 0;
        // int[] negatives = new int[l/2];
        // int n = 0;
        // for(int i = 0; i < l; i++){
        //     if(nums[i] > 0){
        //         positives[p++] = nums[i];
        //     }
        //     else if(nums[i] < 0){
        //         negatives[n++] = nums[i];
        //     }
        // }
        // p = 0;
        // n = 0;
        // for(int i = 0; i < l; i++){
        //     if(i % 2 == 0){
        //         nums[i] = positives[p++];
        //     }
        //     else{
        //         nums[i] = negatives[n++];
        //     }
        // }
        // return nums;
    }
}