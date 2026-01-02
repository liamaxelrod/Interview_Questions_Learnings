// Easy_2108;

// This class contains the solution for "Find First Palindromic String in the Array"
public class Solution {

    // Method to find the first palindromic string in an array of strings
    public static String firstPalindrome(String[] words) {
        // Iterate through each string in the input array
        // Alternative: we could use a standard for loop like "for (int i = 0; i < words.length; i++) {}"
        for (String words_element : words) {
            
            // Reverse the current string using StringBuilder
            // StringBuilder() into array of characters
            // reverse() the array of characters
            // toString() to convert back to string
            String reversed = new StringBuilder(words_element).reverse().toString();
            
            // Check if the original string is equal to its reversed version
            if (words_element.equals(reversed)) {
                // If it is palindromic, return it immediately
                return words_element;
            }
        }
        // If no palindromic string is found, return an empty string
        return "";
    }

    // Main method for testing the solution
    public static void main(String[] args) {
        // Example input array
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        
        // Call the firstPalindrome method and store the result
        String result = firstPalindrome(words);
        
        // Print the result for verification
        System.out.println(result); // Expected output: "ada"
    }
}



