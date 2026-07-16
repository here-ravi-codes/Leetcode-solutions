class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>());
        return result;
    }
    private void dfs(int[] candidates, int remainingTarget, int startIndex, List<Integer> currentCombination){
        if(remainingTarget == 0){
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if(remainingTarget < 0){
            return;
        }
        for(int i = startIndex; i < candidates.length; i++){
            currentCombination.add(candidates[i]);
            dfs(candidates, remainingTarget - candidates[i], i, currentCombination);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}