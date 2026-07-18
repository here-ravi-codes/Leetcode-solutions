class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                count++;
            }
            if(count > maxCount){
                maxCount = count;
            }
            else if(ch == ')'){
                count--;
            }
        }
        return maxCount;
    }
}