class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() > (n/2)) ans = m.getKey();
        }
        return ans;
    }
}