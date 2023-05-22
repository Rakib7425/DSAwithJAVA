const addAndSubtract = {
   num1: 6,
   num2: 3,
   add() {
      return this.num1 + this.num2;
   },
   subtract() {
      return this.num1 - this.num2;
   },
};

const calculator = Object.create(addAndSubtract);

calculator.product = function () {
   return this.num1 * this.num2;
};

calculator.divide = function () {
   return this.num1 / this.num2;
};

//  console.log(calculator.num1); // 6
//  console.log(calculator.subtract()); // 3
//  console.log(calculator.product()); // 18
//  console.log(calculator.divide()); // 2

/**
  * JS Prototype Inheritance
easy
Problem Statement
We have provided you with an addAndSubtract object that contains num1 and num2 properties and add() and subtract() methods which add and subtract num1 and num2 respectively.
Create a calculator object that contains two functions product() and divide(). It should contain functions named the product and divide which return the product and division results of num1 and num2 respectively that is num1* num2 and num1/num2 . But num1 and num2 are not defined in the calculator object.

Inherit the addAndSubtract object in the calculator object so that it can use num1 and num2 defined in the addAndSubtract object.
Note:- You won't be able to test it by generating output
Input
Takes no argument
Output
Return a number
Example
const addAndSubtract = {
num1: 6,
num2: 3,
add() {
return . . .;
},
subtract() {
return . . .;
},
}

const calculator = {
//... your code
}

console.log(calculator.num1); // 6
console.log(calculator.subtract()); // 3
console.log(calculator.product()); // 18

Note: Give 6 and 3 as num1 and num2 respectively in the input section separated by a comma and then run the code to check the correct output
  */
