class Solution {
    public String longestPalindrome(String S) {
        if (S == null || S.length() < 1) return "";
        int start = 0, maxLen = 0;
        for (int i = 0; i < S.length(); i++) {
            // Expand for odd length palindrome
            int len1 = expandAroundCenter(S, i, i);
            // Expand for even length palindrome
            int len2 = expandAroundCenter(S, i, i + 1);
            // Take the maximum length
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return S.substring(start, start + maxLen);
    }
    // Helper function to expand around center
    private int expandAroundCenter(String S, int left, int right) {
        while (left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of palindrome
    }
}