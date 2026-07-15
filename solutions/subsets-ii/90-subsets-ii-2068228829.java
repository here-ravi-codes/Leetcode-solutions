class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
       dfs(nums, 0, new ArrayList<Integer>());
       return result;
    }
    private void dfs(int[] nums, int startIndex, List<Integer> currentSubset){
        result.add(new ArrayList<>(currentSubset));
        for(int i = startIndex; i < nums.length; i++){
            if(i > startIndex && nums[i] == nums[i - 1]){
                continue;
            }
            currentSubset.add(nums[i]);
            dfs(nums, i + 1, currentSubset);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}