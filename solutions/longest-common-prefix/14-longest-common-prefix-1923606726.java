class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Use the first string as a reference
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            
            // Check this character against all other strings
            for (int j = 1; j < strs.length; j++) {
                // Stop if we reach the end of a string or find a mismatch
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // If the loop finishes, the first string itself is the prefix
        return strs[0];
    }
}