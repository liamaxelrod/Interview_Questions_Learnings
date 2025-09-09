let s = "(i)(e)(nb)(q)(dkb)(o)(ywoa)x";
let knowledge = [["dkb","bxik"], ["i","aaa"], ["iz","aaa"]];

var evaluate = function(s, knowledge) {
    // Convert the 2D knowledge array into a Map for fast key-value lookup
    const TheKnowledge = new Map(knowledge);

    let gate_1 = false;  // Flag to track if we are inside parentheses
    let test = "";        // To accumulate the current key inside parentheses
    let Result = "";      // Final evaluated string to return

    // Loop through each character in the string
    for (let i = 0; i < s.length; i++) {
        const letter = s[i];

        if (letter === "(") {
            gate_1 = true;  // We have entered a bracketed key
            test = "";      // Reset test to start accumulating a new key
        } else if (letter === ")") {
            gate_1 = false; // We have reached the end of the bracketed key

            // Check if the accumulated key exists in the map
            if (TheKnowledge.has(test)) {
                Result += TheKnowledge.get(test); // Replace with its value
            } else {
                Result += "?"; // Key not found, replace with '?'
            }
        } else if (gate_1) {
            // If we are inside parentheses, keep adding characters to the key
            test += letter;
        } else {
            // Regular character outside parentheses, add it to the result as-is
            Result += letter;
        }
    }

    return Result; // Return the fully evaluated string
};

// Run the function and print the result
console.log(evaluate(s, knowledge));
