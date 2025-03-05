class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> result = new ArrayList<>();
        solve(s, "", result);
        return result;
    }

    private void solve(String input, String output, ArrayList<String> result){
        if(input.isEmpty()){
            result.add(output);
            return;
        }
        char ch = input.charAt(0);
        String remainingInput = input.substring(1);
        if(Character.isDigit(ch)){
            solve(remainingInput, output + ch, result);
        }
        else{
            solve(remainingInput, output + Character.toLowerCase(ch), result);
            solve(remainingInput, output + Character.toUpperCase(ch), result);
        }
    }
}