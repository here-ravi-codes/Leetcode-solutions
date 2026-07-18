class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //iterate the array and store it in a hashmap, if already exists, store that element in an another array as answer
        //space O(n)
        // Map<Integer, Integer> map = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         ans.add(nums[i]);
        //     }else{
        //         map.put(nums[i], 1);
        //     }
        // }
        // return ans;


        //optimal
        //iterate the array, mark the nums[nums[i] - 1] as negative (to preserve the value we need to add negative sign)
        //otherwise we can add any special number 
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0) ans.add(index + 1);
            else nums[index] = -nums[index];
        }
        return ans;
    }
}