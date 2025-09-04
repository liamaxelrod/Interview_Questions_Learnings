package problems.Find_First_Palindromic_String_in_the_Array;

// package problems.Find First Palindromic String in the Array;
public class Solution {

    public static String firstPalindrome(String[] words) {
        for (String words_element : words) {
            String reversed = new StringBuilder(words_element).reverse().toString();
            if (words_element.equals(reversed)) {
                return words_element;
            }
        }
        // Your code goes here
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        String result = firstPalindrome(words);
        System.out.println(result); // for testing
    }
}

