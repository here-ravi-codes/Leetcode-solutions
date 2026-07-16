class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        dfs(nums, visited, new ArrayList<>());
        return result;
    }
    private void dfs(int[] nums, boolean[] visited, List<Integer> currentCombination){
        if(currentCombination.size() == nums.length){
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == true){
                continue;
            }
            currentCombination.add(nums[i]);
            visited[i] = true;
            dfs(nums, visited, currentCombination);
            currentCombination.remove(currentCombination.size() - 1);
            visited[i] = false;
        }
    }
}