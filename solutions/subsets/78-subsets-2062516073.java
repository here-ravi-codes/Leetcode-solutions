class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> currentSubset = new ArrayList<>();
        int index = 0;
        dfs(nums, index, currentSubset);
        return result;
    }
    private void dfs(int[] nums, int index, List<Integer> currentSubset){
        //Base case
        if(index == nums.length){
            result.add(new ArrayList<>(currentSubset));
            return;
        }
        //Choice 1 : include current element
        currentSubset.add(nums[index]);
        dfs(nums, index + 1, currentSubset);
        //backtrack
        currentSubset.remove(currentSubset.size() - 1);
        //Choice 2 : exclude current element
        dfs(nums, index + 1, currentSubset);
    }
}