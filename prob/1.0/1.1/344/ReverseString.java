import java.util.Arrays;

public class ReverseString {

    // The reverseString method is part of the public class
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();

        // Test example 1
        char[] arr1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Before: " + Arrays.toString(arr1));
        rs.reverseString(arr1);
        System.out.println("After:  " + Arrays.toString(arr1));

        // Test example 2
        char[] arr2 = {'w','o','r','l','d'};
        System.out.println("\nBefore: " + Arrays.toString(arr2));
        rs.reverseString(arr2);
        System.out.println("After:  " + Arrays.toString(arr2));

        // Test example 3 (even length)
        char[] arr3 = {'a','b','c','d'};
        System.out.println("\nBefore: " + Arrays.toString(arr3));
        rs.reverseString(arr3);
        System.out.println("After:  " + Arrays.toString(arr3));
    }
}

// -------------------
// Your older version (saved for reference)
// -------------------

// class Solution {
//     public void reverseString(char[] s) {
//         System.out.println("start " + Arrays.toString(s));
//         char left = 'z';
//         char right = 'z';
//         int j = s.length - 1;

//         for (int i = 0; i <= j; i++) {
//             left = s[i];
//             right = s[j];

//             s[i] = right;
//             s[j] = left;
//             j = j - 1;
//         }
//     }
// }
