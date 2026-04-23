class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Map<Integer, Integer> prefix = new HashMap<>();
        Map<Integer, Integer> postfix = new HashMap<>();
        int prefixProd = 1;
        int postfixProd = 1;
        for(int i = 0; i < n; i++){
            prefixProd *= nums[i];
            prefix.put(i, prefixProd);
        }
        for(int j = n - 1; j >= 0; j--){
            postfixProd *= nums[j];
            postfix.put(j, postfixProd);
        }
        for(int i = 0; i < n; i++){
            if(i == 0){
                res[i] = postfix.get(1);
            }
            else if(i == n - 1){
                res[i] = prefix.get(n - 2);
            }
            else{
                res[i] = prefix.get(i - 1) * postfix.get(i + 1);
            }
        }
        return res;
    }
}