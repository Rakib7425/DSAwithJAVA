// Your code here
function calculate(num1, num2, operator) {
    let result;
    switch (operator) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            result = num1 / num2;
            break;
        default:
            console.log("Invalid operator");
    }
    console.log(result);
}


/*
JS Calculate
easy
Problem Statement
Create a function named "calculate" which takes in three arguments. The first and the second arguments are numbers and the third argument is a mathematical operator in the form of a string. The function performs mathematical calculations between the two numbers on the basis of the operator passed as the third argument and prints the result in the console.

Note- The "calculate" function should only support four operators "+" , "-" , "*" , "/" (without the quotes) where these operators have their usual meaning
Input
The "calculate" function takes in three arguments, the first and the second arguments are numbers and the third argument is a mathematical operator in the form of a string.

Output
You need to create a function named calculate which prints the result of the calculation between the first and the second argument on the basis of the operator which is the third argument.
*/