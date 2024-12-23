class Solution {
    public boolean isAnagram(String s, String t) {
        int i = 0;
        int j = t.length()-1;
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}