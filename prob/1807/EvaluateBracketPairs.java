// LeetCode 1807 Medium

import java.util.*;

public class EvaluateBracketPairs {

    public static String evaluate(String s, String[][] knowledge) {
        // 1. Build the lookup map from the 2D array
        // Each key maps to its value. Java requires explicit insertion.
        Map<String, String> knowledgeMap = new HashMap<>();
        for (String[] pair : knowledge) {
            knowledgeMap.put(pair[0], pair[1]);
        }

        // 2. StringBuilder to efficiently construct the result
        // Strings in Java are immutable, so repeated concatenation would be inefficient
        StringBuilder result = new StringBuilder();

        // 3. Temporary StringBuilder to store characters inside brackets
        StringBuilder key = new StringBuilder();

        // 4. Flag to track if we are inside parentheses
        boolean insideBracket = false;

        // 5. Loop through each character of the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                // Start of a bracketed key
                insideBracket = true;

                // Clear previous key content
                key.setLength(0);
            } else if (c == ')') {
                // End of a bracketed key
                insideBracket = false;

                // Convert StringBuilder to String for map lookup
                String k = key.toString();

                // Append mapped value if it exists, else append "?"
                result.append(knowledgeMap.getOrDefault(k, "?"));
            } else if (insideBracket) {
                // If inside a bracket, accumulate characters into key
                key.append(c);
            } else {
                // Outside brackets, append characters directly to result
                result.append(c);
            }
        }

        // Return the fully evaluated string
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(i)(e)(nb)(q)(dkb)(o)(ywoa)x";
        String[][] knowledge = {{"dkb","bxik"}, {"i","aaa"}, {"iz","aaa"}};

        // Call the evaluate function and print the result
        String evaluated = evaluate(s, knowledge);
        System.out.println(evaluated);
        // Expected Output: "aaa? ? ? ?bxik?x" (depending on which keys exist in knowledge)
    }
}

/*
1807. Evaluate the Bracket Pairs of a String
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.

For example, in the string "(name)is(age)yearsold", there are two bracket pairs that contain the keys "name" and "age".
You know the values of a wide range of keys. This is represented by a 2D string array knowledge where each knowledge[i] = [keyi, valuei] indicates that key keyi has a value of valuei.

You are tasked to evaluate all of the bracket pairs. When you evaluate a bracket pair that contains some key keyi, you will:

Replace keyi and the bracket pair with the key's corresponding valuei.
If you do not know the value of the key, you will replace keyi and the bracket pair with a question mark "?" (without the quotation marks).
Each key will appear at most once in your knowledge. There will not be any nested brackets in s.

Return the resulting string after evaluating all of the bracket pairs.

 

Example 1:

Input: s = "(name)is(age)yearsold", knowledge = [["name","bob"],["age","two"]]
Output: "bobistwoyearsold"
Explanation:
The key "name" has a value of "bob", so replace "(name)" with "bob".
The key "age" has a value of "two", so replace "(age)" with "two".
Example 2:

Input: s = "hi(name)", knowledge = [["a","b"]]
Output: "hi?"
Explanation: As you do not know the value of the key "name", replace "(name)" with "?".
Example 3:

Input: s = "(a)(a)(a)aaa", knowledge = [["a","yes"]]
Output: "yesyesyesaaa"
Explanation: The same key can appear multiple times.
The key "a" has a value of "yes", so replace all occurrences of "(a)" with "yes".
Notice that the "a"s not in a bracket pair are not evaluated.
 

Constraints:

1 <= s.length <= 105
0 <= knowledge.length <= 105
knowledge[i].length == 2
1 <= keyi.length, valuei.length <= 10
s consists of lowercase English letters and round brackets '(' and ')'.
Every open bracket '(' in s will have a corresponding close bracket ')'.
The key in each bracket pair of s will be non-empty.
There will not be any nested bracket pairs in s.
keyi and valuei consist of lowercase English letters.
Each keyi in knowledge is unique.
*/