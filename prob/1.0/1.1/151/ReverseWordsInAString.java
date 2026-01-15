public class ReverseWordsInAString {

    // ==============================
    // YOUR VERSION (COMMENTED OUT)
    // ==============================
    // public String reverseWords(String s) {
    //     String New = "";
    //     // Remove extra spaces in middle
    //     s = s.replaceAll(" +", " ");
    //     // Remove leading and trailing spaces
    //     s = s.trim();
    //     // Split words by single space
    //     String[] a = s.split(" ");
    //     // Build reversed string
    //     for (int i = a.length - 1; i >= 0; i--) {
    //         New = New + a[i] + " ";
    //     }
    //     // Remove final trailing space
    //     New = New.trim();
    //     return New;
    // }

    // ==============================
    // REFINED VERSION (RUNNING CODE)
    // ==============================
    public String reverseWords(String s) {
        // Trim removes leading/trailing spaces
        // split("\\s+") splits on ANY number of whitespace characters
        String[] words = s.trim().split("\\s+");

        // StringBuilder is better for repeated string building
        StringBuilder sb = new StringBuilder();

        // Loop from end to beginning
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            // Add space only if not the last word
            if (i > 0) {
                sb.append(" ");
            }
        }

        // Return the final reversed string
        return sb.toString();
    }


    public static void main(String[] args) {
        ReverseWordsInAString r = new ReverseWordsInAString();

        String input = "  the   sky   is   blue  ";
        String output = r.reverseWords(input);

        System.out.println("INPUT : '" + input + "'");
        System.out.println("OUTPUT: '" + output + "'");
    }
}

/*
151. Reverse Words in a String
Solved
Medium
Topics
premium lock icon
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
*/