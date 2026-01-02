# Longest Valid Parentheses

LeetCode: 32: Longest Valid Parentheses (Hard)

## 1. Problem Description

Given a string containing only '(' and ')', return the length of the longest well-formed (valid) parentheses substring.

### Examples

1. **Input:**`<span>(()</span>`
   **Output:**`<span>2</span>`
   **Explanation:** The longest valid substring is `<span>()</span>`.
2. **Input:**`<span>)()())</span>`
   **Output:**`<span>4</span>`
   **Explanation:** The longest valid substring is `<span>()()</span>`.
3. **Input:**`<span>)())(((()(())(()()</span>`
   **Output:**`<span>6</span>`
   **Explanation:** The longest valid substring is `<span>(()())</span>`.

### Constraints

* `<span>0 <= s.length <= 3 * 10^4</span>`
* `<span>s[i]</span>` is `<span>'('</span>` or `<span>')'</span>`

---

## 2. Why This Problem Matters

* Tests understanding of string manipulation and parsing.
* Requires handling of edge cases like leading or trailing unmatched parentheses.
* Encourages thinking about scanning in multiple directions to capture all possible valid substrings.
* Builds skill in using counters and state tracking instead of traditional stack approaches.

---

## 3. Solution Approach

* Keep two counters: `left` for `'('` and `right>` for `')'`.
* Scan the string from left to right:
  * Increment counters depending on the character.
  * If `left == right`, a balanced substring is found. Update the max length.
  * If `right > left`, the substring is invalid; reset both counters.
* Reset counters and scan the string from right to left:
  * Increment counters as before, but swap the roles of `left` and `right` in the invalid check.
  * This ensures substrings missed due to leading `('` are counted.
* The longest valid substring is the maximum length found in both scans.

---

## 4. Code Solutions

### Java

```java
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
```


---

## 5. Lessons Learned

* Lesson 1: If you find yourself stuck in your code or logic, it’s important to take a step back and recognize that there may be a flaw in your underlying approach. For example, assuming you must always determine whether a `(` has a corresponding `)`—or whether it’s just an extra `(` in the string—can be a faulty piece of reasoning. This kind of misconception can significantly hinder progress when trying to solve the problem.
* Lesson 2: I realized I needed to stop thinking in the traditional sense of “matching parentheses” and instead approach the problem in terms of  **tracking state counts** . By counting open and closed parentheses as a running state, rather than trying to pair them individually, I could more effectively determine valid substrings.

---

## 6. References / Resources

* Problem link: [https://leetcode.com/problems/longest-valid-parentheses/description/]()
