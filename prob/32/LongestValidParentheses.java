public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int maxLen = 0;           // Stores the length of the longest valid substring found so far
        int left = 0, right = 0;  // Counters for '(' and ')' encountered in the current scan

        // ---------------------------
        // Left to right scan
        // ---------------------------
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;           // Count an opening bracket
            } else {
                right++;          // Count a closing bracket
            }

            if (left == right) {
                // A balanced substring is found
                // Its length is 2 * right (or 2 * left, same thing)
                maxLen = Math.max(maxLen, 2 * right);
            } else if (right > left) {
                // Too many closing brackets → impossible to continue this substring
                // Reset counters to start fresh from next character
                left = right = 0;
            }
        }

        // Reset counters before scanning in the other direction
        left = right = 0;

        // ---------------------------
        // Right to left scan
        // ---------------------------
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;           // Count an opening bracket
            } else {
                right++;          // Count a closing bracket
            }

            if (left == right) {
                // Found a balanced substring
                maxLen = Math.max(maxLen, 2 * left);
            } else if (left > right) {
                // Too many opening brackets → substring cannot continue
                // Reset counters to start fresh from previous character
                left = right = 0;
            }
        }

        return maxLen;  // Return the length of the longest valid parentheses substring
    }

    public static void main(String[] args) {
        String test1 = "(()";                       // Example: simple case
        String test2 = ")()())";                    // Example: extra closing bracket
        String test3 = ")())(((()(())(()()";        // Complex example

        System.out.println(longestValidParentheses(test1)); // Output: 2
        System.out.println(longestValidParentheses(test2)); // Output: 4
        System.out.println(longestValidParentheses(test3)); // Output: 6
    }
}

