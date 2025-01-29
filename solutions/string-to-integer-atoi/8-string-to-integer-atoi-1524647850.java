class Solution {
    public int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        int flag = 1;
        if(s == null){
            return 0;
        }
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        if(s.charAt(0) == '-'){
            flag = -1;
        }
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            s = s.substring(1);
        }
        long result = 0;
        for(char ch:s.toCharArray()){
            if(!(ch - '0' >= 0 && ch - '0' <= 9)){
                break;
            }
            else{
                result = result * 10 + (ch - '0');
                if(flag == -1 && -1*result < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                if(flag == 1 && result > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }
        }
        return (int)result*flag;
    }
}