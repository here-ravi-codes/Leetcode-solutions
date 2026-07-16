class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum3(int k, int n) {
        result = new ArrayList<>();
        dfs(1, k, n, new ArrayList<>());
        return result;
    }
    private void dfs(int candidate, int size, int remainingTarget, List<Integer> currentCombination){
        if(remainingTarget == 0 && currentCombination.size() == size){
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if(remainingTarget < 0 || currentCombination.size() > size){
            return;
        }
        for(int i = candidate; i <= 9; i++){
            currentCombination.add(i);
            dfs(i + 1, size, remainingTarget - i, currentCombination);
            currentCombination.remove(currentCombination.size() - 1); 
        } 
    }
}