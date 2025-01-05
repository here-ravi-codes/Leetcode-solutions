class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int one = nums[i];
            int another = target - one;
            if(map.containsKey(another)){
                return new int[]{map.get(another), i};
            }
            map.put(one, i);
        }
        return new int[]{-1, -1};
    }
}