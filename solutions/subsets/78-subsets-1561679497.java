class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, new ArrayList<>(), 0, result);
        return result;
    }
    
    private void generateSubsets(int[] nums, List<Integer> output, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(output));
            return;
        }
        
        // Exclude the current element
        List<Integer> op1 = new ArrayList<>(output);
        
        // Include the current element
        List<Integer> op2 = new ArrayList<>(output);
        op2.add(nums[index]);
        generateSubsets(nums, op1, index + 1, result);
        generateSubsets(nums, op2, index + 1, result);
    }
}
