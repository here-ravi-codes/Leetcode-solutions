class Solution {

    private void helper(List<String> result, int n, int oc, int cc, String s){
        if(oc == n && cc == n){
            result.add(s);
            return;
        }
        if(oc < n){
            helper(result, n, oc + 1, cc, s + "(");
        }
        if(cc < oc){
            helper(result, n, oc, cc + 1, s + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int oc = 0;
        int cc = 0;
        helper(result, n, oc, cc, "");
        return result;
    }
}