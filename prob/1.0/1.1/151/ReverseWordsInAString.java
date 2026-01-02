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