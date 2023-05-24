// Complete the reverseString function 
function reverseString(str) {
    //Write Code Here
    // Step 1. Use the split() method to return a new array
    let splitString = str.split(""); // var splitString = "hello".split("");
    // ["h", "e", "l", "l", "o"]

    // Step 2. Use the reverse() method to reverse the new created array
    let reverseArray = splitString.reverse(); // var reverseArray = ["h", "e", "l", "l", "o"].reverse();
    // ["o", "l", "l", "e", "h"]

    // Step 3. Use the join() method to join all elements of the array into a string
    let joinArray = reverseArray.join(""); // var joinArray = ["o", "l", "l", "e", "h"].join("");
    // "olleh"

    //Step 4. Return the reversed string
    return joinArray; // "olleh"
}


/**
 * 
 * Js Reverse String
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a function reverseString, which takes in a string as a parameter. Your task is to complete the function such that it returns the reverse of the string.(hello changes to olleh)

// Complete the reverseString function

function reverseString(n) {
//Write Code Here
}
Input
A string n
Output
Returns the reverse of n
Example
const n = 'hello'

reverseString(n) //displays 'olleh' in console
 */