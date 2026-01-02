# [Reverse String]

LeetCode: [344]: Reverse String. (Easy)

## 1. Problem Description

You are given an array of characters `s` representing a string. The task is to **reverse the array in-place** and return nothing (modify the input array directly).

* **Input:** `char[] s` — an array of characters
* **Output:** The same array `s` after reversing its order of characters in-place
* **Rules:**
  * You **cannot use extra space** for another array (O(1) extra memory)
  * Do not return anything; modify the input array directly
  * Must work for arrays of both even and odd lengths

### Examples

1. **Input:** `['h','e','l','l','o']`

   **Output:** `['o','l','l','e','h']`

   **Explanation:** The characters are reversed in-place.
2. **Input:** `['H','a','n','n','a','h']`

   **Output:** `['h','a','n','n','a','H']`

   **Explanation:** Reversing preserves all characters and reverses the order.
3. **Input:** `['a','b','c','d']`

   **Output:** `['d','c','b','a']`

   **Explanation:** Works for even-length arrays as well.

### Constraints

* `1 <= s.length <= 10^5`
* `s[i]` is a printable ASCII character
* Must perform the reversal **in-place**
* Use **O(1) extra memory**

---

## 2. Why This Problem Matters

This problem tests:

* **Array manipulation and indexing** — understanding how to access and swap elements
* **Two-pointer technique** — efficiently swapping elements from both ends
* **In-place operations** — modifying a data structure without using extra memory
* **Edge case handling** — odd-length arrays, even-length arrays, arrays of length 1
* **Fundamental programming skills** — loops, variable swapping, and careful handling of indices

This problem is foundational in interviews because **array manipulation and in-place algorithms appear in many more complex problems** (like reversing linked lists, rotating arrays, or palindrome checks).

---

## 3. Solution Approach

**Language-agnostic logic:**

1. Initialize two pointers:
   * `left` starting at the first index (0)
   * `right` starting at the last index (length - 1)
2. While `left < right`:
   * Swap the elements at `left` and `right`
   * Move `left` one step to the right
   * Move `right` one step to the left
3. Stop when `left >= right` (all elements have been swapped)
4. No extra arrays or space should be used

**Notes on approach:**

* Works for both odd and even-length arrays
* Only modifies the original array (in-place)
* Runs in **O(n)** time and **O(1)** space

---

## 4. Code Solutions

* Solution [JavaScript](./solution.js)

```
function reverseString(s) {
    let left = 0;
    let right = s.length - 1;
    while (left < right) {
        [s[left], s[right]] = [s[right], s[left]];
        left++;
        right--;
    }
}
```

* Solution [Java](./solution.java)

```
import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
```

---

## 5. Lessons Learned

* Refreshed my memory on basic array and in-place manipulation concepts.

---

## 6. References / Resources

* Problem link: [https://leetcode.com/problems/reverse-string](https://leetcode.com/problems/reverse-string)
