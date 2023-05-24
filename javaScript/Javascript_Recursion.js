const getValue = (num) => {
    // Base case: If the number is already a single digit, return it.
    if (num < 10) {
        return num;
    }
    // Recursive case: Calculate the sum of digits of the number
    // and call the getValue() function with the sum as argument.
    let digitSum = 0;
    for (let digit of String(num)) {
        digitSum += Number(digit);
    }
    return getValue(digitSum);
};

/***
 * Javascript Recursion
easy
Problem Statement
Complete the function getValue() which takes one argument which is a number.
The function is a recursive function means it calls itself if a certain condition is met.
The function can take any positive whole number and will return a single-digit positive whole number from their recursive sum.

For example, if the input number is 7893
then 7+8+9+3=27(27 is not single digit number so we will add its digits again)
then 2+7=9
The function will return 9 as output.
Input
The function will take a positive whole number as input.
Output
The output will be the repeated sum of digits until there is only a single digit in the number
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
const answer= getValue(456);
console.log(answer);
//prints 6 (4+5+6=15, then 1+5=6)
 */