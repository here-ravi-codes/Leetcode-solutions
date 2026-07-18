class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int top1 = stack.pop();
                int top2 = stack.pop();
                switch(token){
                    case "+":
                        stack.push(top2 + top1);
                        break;
                    case "-":
                        stack.push(top2 - top1);
                        break;
                    case "*":
                        stack.push(top2 * top1);
                        break;
                    case "/":
                        stack.push(top2 / top1);
                        break;
                }
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}