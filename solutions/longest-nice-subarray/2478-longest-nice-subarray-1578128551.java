class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLen = 0, left = 0, bitMask = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Ensure no duplicate bits exist in the current subarray
            while ((bitMask & nums[right]) != 0) {
                bitMask ^= nums[left]; // Remove leftmost element from bitMask
                left++; // Shrink the window from the left
            }
            
            // Add the new element to bitMask
            bitMask |= nums[right];
            
            // Update the maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}