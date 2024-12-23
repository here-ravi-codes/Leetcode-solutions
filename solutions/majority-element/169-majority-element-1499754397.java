class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > (n/2)){
                result = entry.getKey();
            }
        }
        return result;
    }
}