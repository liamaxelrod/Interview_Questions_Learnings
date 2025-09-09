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

