function getNumbersGreaterThan5(nums) {
    // write code here
    // return the output , do not use console.log here
    return nums.filter(num => num > 5);
}

/**
 * 
 * JS Array methods
easy
Problem Statement
You are given an array of numbers. Use appropriate array methods to find all numbers that are greater than 5. Complete the function getNumbersGreaterThan5 that accepts an array of integers nums and returns an array of numbers that are greater than 5.
Input
An array nums of numbers
Output
An array of the numbers greater than 5 that are present in nums
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
const inputArr = [1,2,3,9,10,7,5,4,3]

const ans = getNumbersGreaterThan5(inputArr)

console.log(ans) // prints [9, 10, 7]
 */