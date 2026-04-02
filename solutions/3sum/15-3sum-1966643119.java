class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //..........Brute.........

        // int n = nums.length;
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         for(int k = j + 1; k < n; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(temp);
        //                 st.add(temp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(st);

        //..........Better...........
        // int n = nums.length;
        // Set<List<Integer>> st = new HashSet<>();
        // for(int i = 0; i < n; i++){
        //     Set<Integer> hset = new HashSet<>();
        //     for(int j = i + 1; j < n; j++){
        //         int third = -(nums[i] + nums[j]);
        //         if(hset.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
        //             Collections.sort(temp);
        //             st.add(temp);
        //         }
        //         hset.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(st);

        //..........optimal............
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0) right--;
                else if(sum < 0) left++;
                else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[left], nums[right]);
                    ans.add(temp);
                    left++;
                    right--;
                    while((left < right) && (nums[left] == nums[left - 1])) left++;
                    while((left < right) && (nums[right] == nums[right + 1])) right--;
                }
            }
        }
        return ans;
    }
}