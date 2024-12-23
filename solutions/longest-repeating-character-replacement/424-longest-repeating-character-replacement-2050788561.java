class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            // Maximum frequency in the current window (or any previous larger window)
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
            // If more than k replacements are needed, shrink the window
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            // Update the answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}