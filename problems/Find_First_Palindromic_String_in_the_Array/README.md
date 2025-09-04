# Find First Palindromic String in the Array

LeetCode: Completed Problem: 2108. Find First Palindromic String in the Array.

## 1. Problem Description

Given an array of strings `words`, return the **first string in the array that is a palindrome**.
A **palindrome** reads the same forwards and backwards (e.g., "ada" or "racecar").

**Input:**

- `words`: array of strings
- Constraints:
  - 1 <= words.length <= 100
  - 1 <= words[i].length <= 100
  - words[i] consists only of lowercase English letters

**Output:**

- The first palindrome string found in `words`
- If no palindrome exists, return an empty string `""`

**Example:**

Input: ["abc","car","ada","racecar","cool"]
Output: "ada"

Input: ["abc","car","cool"]
Output: ""

---

## 2. Why This Problem Matters

This problem tests:

- **String manipulation skills** (reversing strings, character comparison)
- **Problem-solving and algorithmic thinking**
- **Ability to write concise, readable code**

For employers, it demonstrates you can work efficiently with arrays and strings and handle edge cases correctly.

---

## 3. Solution Approach

**Thought process:**

1. Loop through each word in the array.
2. Second loop get individual letters.
   - Format the loop To find the last letter Word.
   - Once finished, save it and then compare it to the word in the first loop.
   - If they match is a palindrome If not, move on to the next word.
3. Return the first word that is a palindrome.
4. Return an empty string if none are found.

**Second version**

- Use built in functions To perform Operations
- Notes:
  - split('').reverse().join('') reverses the string efficiently.
  - Using === ensures exact string comparison.
  - Single for-of loop is cleaner than nested loops.

---

## 4. Code Solutions

- Solution [JavaScript](Solution.js "./solution.js")
- Solution [Java](Solution.java "./solution.java")

---

## 5. Lessons Learned

- Learning the same lesson again: if you don’t practice coding for a long time, you start to forget it, but the moment you get back into it, it comes back quickly.  
- I purposely decided to do it the hard way with 2 loops to refresh my memory on JavaScript and its syntax.  
- I also used ChatGPT to generate a shorter, built-in method solution using `split()`, `reverse()`, and `join()`. I mainly wanted to compare my manual approach with a concise alternative that uses built-in methods. This helped me quickly understand both the “hard way” and the “simple way” of solving the problem. I could have just looked up the simple methods to solve the problem, but I purposely wanted to do it the hard way, as stated in the first lesson.

## 5. References / Resources

- MDN Docs: [String reversal using split/reverse/join](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse)

- LeetCode: [LeetCode: Find First Palindromic String in the Array](https://leetcode.com/problems/find-first-palindromic-string-in-the-array/)
Completed Problem: 2108. Find First Palindromic String in the Array
&nbsp;
&nbsp;
&nbsp;

