class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : arr){
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '['))
                {
                    return false;
                } 
            }
        }
        return stack.isEmpty();
    }
}