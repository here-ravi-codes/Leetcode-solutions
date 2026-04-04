class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //iterate the array and store it in a hashmap, if already exists, store that element in an another array as answer
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                ans.add(nums[i]);
            }else{
                map.put(nums[i], 1);
            }
        }
        return ans;
    }
}