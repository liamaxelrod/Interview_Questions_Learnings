# [Problem Name]

LeetCode 1807: Evaluate the Bracket Pairs of a String (Medium)

## 1. Problem Description

You are given a string `s` containing bracket pairs `(key)`. Each `key` may map to a value provided in the 2D array `knowledge`, where `knowledge[i] = [keyi, valuei]`.

- Replace `(key)` with its corresponding value if it exists in `knowledge`.
- If not found, replace `(key)` with `"?"`.
- Each key is unique, appears at most once in `knowledge`, and there are no nested brackets.

Return the final evaluated string.

### Examples

1. **Input:** `s = "(name)is(age)yearsold"`, `knowledge = [["name","bob"],["age","two"]]`  
   **Output:** `"bobistwoyearsold"`

2. **Input:** `s = "hi(name)"`, `knowledge = [["a","b"]]`  
   **Output:** `"hi?"`

3. **Input:** `s = "(a)(a)(a)aaa"`, `knowledge = [["a","yes"]]`  
   **Output:** `"yesyesyesaaa"`

### Constraints
- `1 <= s.length <= 10^5`  
- `0 <= knowledge.length <= 10^5`  
- `knowledge[i].length == 2`  
- `1 <= keyi.length, valuei.length <= 10`  
- `s` consists of lowercase English letters and `()`  
- Every `(` has a matching `)`; no nested brackets  
- Keys and values consist of lowercase English letters  
- Keys in `knowledge` are unique  

---

## 2. Why This Problem Matters


Interviewers use this type of problem to evaluate whether a candidate can:

- **Work with mappings and lookups**: Quickly translate keys to values is a foundational programming skill used in databases, configuration files, caching, and more.  
- **Parse and manipulate strings**: Real-world data often arrives in structured formats (logs, templates, configs). Being able to correctly extract and replace parts of a string is essential.  
- **Handle incomplete or missing data gracefully**: Replacing unknown keys with `"?"` shows whether a candidate anticipates imperfect inputs and writes resilient code.  
- **Balance correctness and efficiency**: With large input sizes, brute-force approaches fail. Interviewers want to see if you can design a linear-time solution that scales.  

In short, this problem matters because it tests whether you can apply core data-structure knowledge and string-processing skills to build a solution that is both **robust and efficient** — a quality expected in real-world software engineering. 
 
---

## 3. Solution Approach

The key idea is to parse the string once and replace bracketed keys with their corresponding values.  
This can be done in a systematic way that applies to any programming language:

1. **Build a lookup structure**  
   - Convert the `knowledge` array into a fast lookup (e.g., dictionary, hash map).  
   - This allows quick retrieval of a value for each key.

2. **Scan through the string**  
   - Read the string character by character.  
   - When you see a normal letter, append it directly to the result.  
   - When you see `"("`, start recording characters until you reach the matching `")"`.

3. **Evaluate the bracket content**  
   - Extract the substring inside the brackets (the key).  
   - If the key exists in the lookup, append its value to the result.  
   - If not, append `"?"`.

4. **Continue until the end of the string**  
   - Repeat the process for all bracket pairs.  
   - Characters outside of brackets remain unchanged.

5. **Return the final result**  
   - The constructed string is the fully evaluated version of the input.

---

**Reflection on my coding approach:**  
When I solved this problem, I first built a map from the `knowledge` array and then wrote a loop to scan the string. I used flags (like `gate_1`) and temporary variables (like `test`) to track whether I was inside brackets and to accumulate characters. Once I closed a bracket, I checked the key against the map and replaced it accordingly. This step-by-step process mirrored the general approach described above, just implemented in code.

---

## 4. Code Solutions

- Solution [JavaScript](Solution.js "./solution.js")  

---

## 5. Lessons Learned

- Lesson 1: I discovered the trick of using a for loop inside another for loop where the inner loop can be broken early, but you save the “checkpoint” of where you left off. This way, when the outer loop continues, the inner loop can resume from that saved position. It’s not something that applied directly to this problem, but it’s a useful general programming pattern to keep in mind.
- Lesson 2: It was helpful to practice using raw loops and conditionals to better understand the mechanics of parsing strings. However, I also realized that there’s a limit to how far this approach can go. Built-in functions and data structures (like Map in JavaScript) exist for a reason: they make code shorter, clearer, and easier to understand. The balance is knowing what’s happening under the hood while also taking advantage of these abstractions.

---

## 6. References / Resources

- LeetCode: [Evaluate the Bracket Pairs of a String](https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/description/?envType=problem-list-v2&envId=v9ut1ir1)  
- Official documentation for relevant methods and objects in the coding language(s) used (e.g., Map/HashMap, substring, loops, string manipulation functions)  
- Use of AI tools
&nbsp;
&nbsp;
&nbsp;

