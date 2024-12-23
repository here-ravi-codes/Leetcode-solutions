class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        int[] map = new int[256];
        // Frequency of characters in t
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int left = 0;
        int right = 0;
        int count = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            // If this character is still needed
            if (map[r] > 0) {
                count--;
            }
            // Consume this character
            map[r]--;
            right++;
            // Valid window found
            while (count == 0) {
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }
                char l = s.charAt(left);
                map[l]++;
                // We now need this character again
                if (map[l] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}