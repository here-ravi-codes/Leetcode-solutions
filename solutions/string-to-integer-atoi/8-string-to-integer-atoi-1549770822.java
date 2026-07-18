class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int flag = 1;
        if (s.charAt(0) == '-') {
            flag = -1;
            s = s.substring(1);
        } else if (s.charAt(0) == '+') {
            s = s.substring(1);
        }

        return recursiveAtoi(s, 0, 0, flag);
    }

    private int recursiveAtoi(String s, int index, long result, int flag) {
        // Base case: if index reaches the end of the string
        if (index >= s.length()) {
            return (int) result * flag;
        }

        char ch = s.charAt(index);
        if (ch < '0' || ch > '9') {
            return (int) result * flag;
        }

        result = result * 10 + (ch - '0');

        // Check for integer overflow
        if (flag == -1 && -1 * result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (flag == 1 && result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        // Recursive call to process the next character
        return recursiveAtoi(s, index + 1, result, flag);
    }
}
