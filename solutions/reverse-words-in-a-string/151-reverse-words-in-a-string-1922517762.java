class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder(s.length());
        sb.append(str[str.length - 1]);
        for(int i = str.length - 2; i >= 0; i--){
            sb.append(" ").append(str[i]);
        }
        return sb.toString();
    }
}