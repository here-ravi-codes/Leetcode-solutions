class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(digits, map, 0, new StringBuilder());
        return result;
    }
    private void dfs(String digits, String[] map, int index, StringBuilder currentString){
        if(currentString.length() == digits.length()){
            result.add(currentString.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for(char ch : letters.toCharArray()){
            currentString.append(ch);
            dfs(digits, map, index + 1, currentString);
            currentString.deleteCharAt(currentString.length() - 1);
        }
    }
}