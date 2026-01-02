// Easy_2108;

// Manual loops solution
var firstPalindrome = function(words) {
    let result = ""; // to build the reversed word

    for (let i = 0; i < words.length; i++) {
        const wordElement = words[i]; // current word

        // reverse the word character by character
        for (let e = wordElement.length; e > 0; e--) {
            const letterElement = wordElement[e - 1]; // take letters from the end
            result += letterElement; // append to reversed word
        }

        if (result === wordElement) return result; // check if palindrome
        else result = ""; // reset for next word
    }

    return ""; // no palindrome found
};

// Example usage
let words = ["abc","car","ada","racecar","cool"];
console.log(firstPalindrome(words)); // "ada"

// Concise built-in solution using split, reverse, join
var firstPalindrome2 = function(words) {
    for (let word of words) {
        // Split the string into an array of characters
        // Example: "ada" -> ["a", "d", "a"]
        let chars = word.split('');

        // Reverse the array of characters
        // Example: ["a", "d", "a"] -> ["a", "d", "a"]
        // For "car": ["c","a","r"] -> ["r","a","c"]
        chars.reverse();

        // Join the reversed array back into a string
        // Example: ["a", "d", "a"] -> "ada"
        let reversed = chars.join('');

        // Compare original word to reversed word
        if (word === reversed) {
            return word; // First palindrome found
        }
    }
    return ""; // No palindrome found
};

// Example usage
let words2 = ["abc", "car", "ada", "racecar", "cool"];
console.log(firstPalindrome2(words2)); // Output: "ada"




