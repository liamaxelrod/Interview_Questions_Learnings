# Reverse Words in a String

LeetCode 151: Reverse Words in a String (Medium)

## 1. Problem Description

Given a string `s`, the task is to reverse the order of its words. A word is any sequence of non-space characters. Words in the original string can be separated by one or more spaces, and the string may include leading or trailing spaces.

The output must:

* Contain the words in reversed order.
* Use **exactly one space** between words.
* Contain  **no leading or trailing spaces** .

### Examples

1. **Input:** `"the sky is blue"`

   **Output:** `"blue is sky the"`

   **Explanation:** Simply reverse the order of words.
2. **Input:** `"  hello world  "`

   **Output:** `"world hello"`

   **Explanation:** Remove leading/trailing spaces and reverse the words.
3. **Input:** `"a good   example"`

   **Output:** `"example good a"`

   **Explanation:** Reduce multiple internal spaces to one and reverse the word order.

### Constraints

* 1 <= s.length <= 10⁴
* `s` contains letters, digits, and spaces.
* The string contains at least one word.

---

## 2. Why This Problem Matters

This problem tests essential string-processing abilities required in technical interviews:

* Working with **string manipulation** and whitespace handling.
* Understanding how to **normalize input** (cleaning up extra spaces).
* Using **arrays** or similar structures to reorganize data.
* Practicing careful handling of  **edge cases** .
* Demonstrating the ability to produce  **clean, consistent output formatting** .

These skills appear in many real-world tasks involving text parsing, user input cleanup, and data transformation.

---

## 3. Solution Approach (Language-Agnostic)

1. **Normalize spacing:**
   * Remove leading/trailing spaces.
   * Replace multiple spaces between words with a single space.
2. **Split the string into words:**
   * Use a method that breaks the string into an array/list of words based on spaces.
3. **Reverse the words:**
   * Either reverse the array in place or iterate from the end to the beginning.
4. **Rebuild the final string:**
   * Join the reversed words together using a single space.
5. **Return the result.**

This logic works in nearly any programming language that supports splitting and joining strings.

---

## 4. Code Solutions

### Java

```java
public class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll(" +", " ");
        s = s.trim();
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }

        return result.toString();
    }
}
```

---

## 5. Lessons Learned

* Remembered and reinforced the use of string‑processing methods like `replaceAll()`, `trim()`, and `split()` in Java—and recognized that similar methods exist in most programming languages and behave similarly. to making parsing simpler.
* Splitting and joining strings is a powerful pattern for transformation tasks.
* Re-learned the importance of using `StringBuilder` when constructing strings in a loop. This helped reinforce that repeatedly using `+` to build strings creates many temporary string objects, which wastes memory and slows down performance. Understanding this makes me more aware of writing efficient code, especially when handling large strings or repetitive operations.

---

## 6. References / Resources

* Problem link: [https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/](https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/)
