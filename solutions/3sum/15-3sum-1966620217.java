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
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i < n; i++){
            Set<Integer> hset = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int third = -(nums[i] + nums[j]);
                if(hset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hset.add(nums[j]);
            }
        }
        return new ArrayList<>(st);
    }
}