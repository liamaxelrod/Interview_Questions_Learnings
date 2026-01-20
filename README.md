# 1. Interview Questions Learnings

A repository for storing, solving, and reflecting on coding interview problems across multiple programming languages.

This repo serves two main purposes:

1. To **practice and master** common interview coding problems.
2. To **document learnings and reflections**, showing growth and understanding over time.

**Table of Contents**

1. [Project Title](#1-interview-questions-learnings)
2. [Project Description](#2-project-description)
3. [📌 Problem List](#-problem-list)
4. [📘 Problem Curriculum / Index](#-problem-curriculum--index)
5. [Live Demo and/or Screenshots](#3-live-demo-andor-screenshots-if-available)
6. [Project Structure](#4-project-structure-helps-people-understand-where-to-look)
7. [How to Run Locally](#5-how-to-run-locally)
8. [Lessons Learned](#6-lessons-learned-great-for-portfolio-projects---shows-growth-and-insight)
9. [Future Improvements](#7-future-improvements-optional)
10. [Acknowledgments / Credits](#8-acknowledgments--credits-if-applicable)
11. [License](#9-license-optional-but-professional)

---

## 2. Project Description

This project is my **personal archive of coding interview questions and solutions**, solved in different programming languages.

- Each problem includes **multiple language solutions** where possible (e.g., JavaScript, Java, HTML/CSS, etc.).
- Each folder contains a **README.md reflection** explaining what I learned from solving the problem, common pitfalls, and insights for the future.
- The goal is to not just collect solutions, but also to **showcase my understanding and learning process**.

---

## 📌 Problem List

This table serves as a **master index** for all solved and in-progress problems.

- **Section** refers to the numbered curriculum below (e.g. 1.1, 5.17).
- Problems are grouped by Hard Problems.

| Problem Name                        | Difficulty | Concept(s)                                                                              | Link                                                               |
| ----------------------------------- | ---------- | --------------------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| Reverse String (LC 344)             | Easy       | 1.1 Two-pointer traversal, string symmetry                                              | [LeetCode](https://leetcode.com/problems/reverse-string/)             |
| Palindrome Number (LC 9)            | Easy       | 1.5 Symmetry, two-pointer logic                                                         | [LeetCode](https://leetcode.com/problems/palindrome-number/)          |
| FizzBuzz (LC 412)                   | Easy       | 1.4 Control flow, branching                                                             | [LeetCode](https://leetcode.com/problems/fizz-buzz/)                  |
| Valid Parentheses (LC 20)           | Medium     | 1.15 Stack, balanced parentheses                                                        | [LeetCode](https://leetcode.com/problems/valid-parentheses/)          |
| Remove Invalid Parentheses (LC 301) | Hard       | 1.15, 1.5, 1.11, 1.4, 1.8 Stack, DFS/recursion, control flow, symmetry, order/frequency | [LeetCode](https://leetcode.com/problems/remove-invalid-parentheses/) |

| Problem Name                                 | Difficulty | Concept(s)                                                         | Link                                                                        |
| -------------------------------------------- | ---------- | ------------------------------------------------------------------ | --------------------------------------------------------------------------- |
| Two Sum (LC 1)                               | Easy       | 1.3 Hash lookup, aggregation                                       | [LeetCode](https://leetcode.com/problems/two-sum/)                             |
| Remove Duplicates from Sorted Array (LC 26)  | Easy       | 1.14 Traversal, deduplication                                      | [LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) |
| Two Sum II – Input Array Is Sorted (LC 167) | Medium     | 1.3, 1.7 Two-pointer traversal                                     | [LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)    |
| Maximum Subarray (LC 53)                     | Medium     | 1.10 Aggregation, subarray sum                                     | [LeetCode](https://leetcode.com/problems/maximum-subarray/)                    |
| Sliding Window Maximum (LC 239)              | Hard       | 1.3, 1.7, 1.9, 1.10 Arrays, deque/queue, two-pointers, aggregation | [LeetCode](https://leetcode.com/problems/sliding-window-maximum/)              |

| Problem Name                              | Difficulty | Concept(s)                                                                 | Link                                                                     |
| ----------------------------------------- | ---------- | -------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| FizzBuzz (LC 412)                         | Easy       | 1.4 Control flow, branching (Python repeat)                                | [LeetCode](https://leetcode.com/problems/fizz-buzz/)                        |
| Reverse Words in a String III (LC 557)    | Easy       | 1.12 String parsing, order logic                                           | [LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)    |
| Evaluate Reverse Polish Notation (LC 150) | Medium     | 1.15, 1.13 Stack, expression evaluation                                    | [LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/) |
| Flatten Nested List Iterator (LC 341)     | Medium     | 1.8, 1.15 DFS, recursion                                                   | [LeetCode](https://leetcode.com/problems/flatten-nested-list-iterator/)     |
| Expression Add Operators (LC 282)         | Hard       | 1.8, 1.15, 1.4, 1.13 DFS/backtracking, recursion, operator ordering, stack | [LeetCode](https://leetcode.com/problems/expression-add-operators/)         |

| Problem Name                                 | Difficulty | Concept(s)                                                   | Link                                                                          |
| -------------------------------------------- | ---------- | ------------------------------------------------------------ | ----------------------------------------------------------------------------- |
| Maximum Depth of Binary Tree (LC 104)        | Easy       | 1.8 DFS recursion, tree traversal                            | [LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/)          |
| Symmetric Tree (LC 101)                      | Easy       | 1.5, 1.8 DFS recursion, tree symmetry                        | [LeetCode](https://leetcode.com/problems/symmetric-tree/)                        |
| Invert Binary Tree (LC 226)                  | Medium     | 1.8, 1.16 DFS recursion, tree manipulation                   | [LeetCode](https://leetcode.com/problems/invert-binary-tree/)                    |
| Serialize & Deserialize Binary Tree (LC 297) | Hard       | 1.8, 1.20, 1.16 DFS, deep cloning, order tracking, recursion | [LeetCode](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) |

---

## 📘 Problem Curriculum / Index

This section defines the **structured learning path** used to organize problems when applicable.

> **Note: on Difficulty Levels**
>
> For each numbered topic, I practice one Easy, one Medium, and one Hard problem .
>
> The problem title names a representative example, while the parenthetical note indicates the core concept or pattern being reinforced across difficulties.

### 1.0 JavaScript / Coding Problems (Algorithmic & JS Logic)

1.1 Reverse a string (two pointers, traversal)
1.2 Reverse an array in-place (in-place mutation)
1.3 Two-sum problem (hash lookup)
1.4 FizzBuzz (control flow, condition ordering)
1.5 Palindrome check (symmetry, two pointers)
1.6 Find duplicates in an array (set / frequency tracking)
1.7 Merge two sorted arrays (two pointers, merging)
1.8 Flatten a nested array (recursion, DFS)
1.9 Sum / average of array elements (aggregation)
1.10 Maximum subarray sum (dynamic programming / Kadane)
1.11 Find first non-repeating character (frequency + order)
1.12 Reverse words in a sentence (string parsing)
1.13 Implement map, filter, reduce (functional iteration)
1.14 Remove duplicates from array (deduplication)
1.15 Check balanced parentheses (stack)
1.16 Implement a stack using arrays (data structure implementation)
1.17 Implement a queue using arrays (data structure implementation)
1.18 Find missing number in array (math / index mapping)
1.19 Count occurrences of each character (frequency counting)
1.20 Deep clone an object (copying vs references)

### 2.0 HTML & CSS / Front-End Concepts

2.1 Semantic HTML (meaningful structure)
2.2 Difference between id and class (selectors)
2.3 Flexbox: align-items vs justify-content (layout axes)
2.4 CSS Grid: 3-column layout (grid systems)
2.5 Responsive design using media queries (breakpoints)
2.6 CSS positioning (layout modes)
2.7 Z-index and stacking context (render order)
2.8 CSS specificity and inheritance (style resolution)
2.9 Inline vs block vs inline-block (display modes)
2.10 CSS transitions vs animations (motion techniques)

### 3.0 React / Framework Questions

3.1 Class vs functional components (component models)
3.2 Component lifecycle (render phases)
3.3 Hooks: useState, useEffect (state & effects)
3.4 Controlled vs uncontrolled components (form state)
3.5 React key prop (list reconciliation)
3.6 Context API vs Redux (state scope)
3.7 Memoization (performance optimization)
3.8 Lifting state up (data flow)
3.9 Event handling (synthetic events)
3.10 Conditional rendering (UI logic)

### 4.0 Front-End Browser / Web Concepts

4.1 Event bubbling and capturing (event propagation)
4.2 Debounce vs throttle (rate limiting)
4.3 var vs let vs const (scoping)
4.4 == vs === (coercion)
4.5 call, apply, bind (this binding)
4.6 Closures and scope chain (lexical scope)
4.7 Promises, async/await (async control flow)
4.8 LocalStorage vs SessionStorage vs Cookies (client storage)
4.9 Fetch API vs Axios (HTTP requests)
4.10 Browser rendering (render pipeline)

### 5.0 Backend / Full-Stack Coding & Algorithms

5.1 Reverse a linked list (pointer manipulation)
5.2 Detect a cycle in a linked list (fast/slow pointers)
5.3 Merge two sorted linked lists (pointer merging)
5.4 Nth node from end (two pointers)
5.5 Queue using stacks (data structure composition)
5.6 Stack using queues (data structure composition)
5.7 Binary tree traversal (DFS)
5.8 BFS (level-order traversal) (breadth-first search)
5.9 Lowest common ancestor (tree properties)
5.10 DFS in a graph (graph traversal)
5.11 BFS in a graph (graph traversal)
5.12 Detect graph cycles (visited states)
5.13 Topological sort (dependency ordering)
5.14 Implement a hash map (hashing)
5.15 LRU cache (eviction policy)
5.16 Two-sum / Three-sum (hashing + pointers)
5.17 Longest substring without repeating characters (sliding window)
5.18 Longest common subsequence (dynamic programming)
5.19 Maximum subarray sum (dynamic programming)
5.20 String pattern matching (KMP / Rabin-Karp)

---

## 3. Live Demo and/or Screenshots

A live demo has not been published yet.
Future plan: connect this repo to a simple static website (via GitHub Pages).

---

## 4. Project Structure

```
interview-questions-learnings/   
  problems/   
  arrays/   
    two_sum/   
      README.md # Problem explanation & reflection   
      solution.js # JavaScript solution   
      solution.java # Java solution   
      solution.html # HTML demo (if applicable)   
      solution.css # CSS demo (if applicable)   
      ...   
  dynamic_programming/   
    ...  
  graphs/   
    ...   
  ...   
  docs/   
    HOW_TO_RUN.md # Instructions for running code in each language   
    LANGUAGE_SETUP.md # Environment setup notes (Java, Node, etc.)   
LICENSE   
README.md   
```

---

## 5. How to Run Locally

1. Clone the repository.
2. Navigate into a problem folder.
3. Run based on language:
   - `.js` → `node solution.js`
   - `.java` → `javac Solution.java && java Solution`
   - `.html/.css` → open in browser
4. See `docs/HOW_TO_RUN.md`.

---

## 6. Lessons Learned

This repo isn’t just about solving problems — it’s about **growing as a problem solver**.

For each problem, I reflect on:

- What the problem taught me
- Mistakes and fixes
- Patterns recognized
- Language-specific insights

---

## 7. Future Improvements

- Add a static site (via GitHub Pages) to browse problems.
- Add Python and other languages as I learn them.
- Tag problems by category and difficulty.
- Include performance analysis (time/space complexity).

---

## 8. Links / Acknowledgments

### Resources Used

- [LeetCode](https://leetcode.com/)
- *(Additional resources will be added here as used.)*

### AI Tools

- **ChatGPT** were used in this project:
  - Creating the overall project structure.
  - Exploring the Solution when required.
  - Understanding coding techniques.
  - Assisting with language-specific syntax and best practices.

When approaching real interviews, I understand that I will **not** be able to use AI tools. My intention in use of AI like **ChatGPT** and **Copilot** is for learning and reflection — to understand the problem, explore solution strategies, and practice coding interview problems more effectively when I am stuck. The goal is to ensure that when faced with a real interview, I can solve these problems independently.

---

## 9. License

This project is licensed under the [MIT License](LICENSE).
The code structure is not working correctly.
