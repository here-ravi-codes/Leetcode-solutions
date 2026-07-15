class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        dfs(n , k, 1, new ArrayList<Integer>());
        return result;
    }
    private void dfs(int n, int k, int startIndex, List<Integer> currCombination){
        if(currCombination.size() == k){
            result.add(new ArrayList<>(currCombination));
            return;
        }
        for(int i = startIndex; i <= n; i++){
            currCombination.add(i);
            dfs(n, k, i + 1, currCombination);
            currCombination.remove(currCombination.size() - 1);
        }
    }
}