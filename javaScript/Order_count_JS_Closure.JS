let generateOrder = function () {
    let count = 0;

    function func() {
        ++count;
        return "Total orders = " + count;
    }

    return func;
}
// const initC = generateOrder();
// console.log(initC());

/**
 * 
 * 
 * Order count - JS Closure
easy
Problem Statement
You need to make an order counter to keep track of the total number of orders received.

Complete the function generateOrder() which returns a function func(). This function func should maintain a count (initially 0). Every time func is called, count must be incremented by 1 and the string "Total orders = " + count must be returned.

Note: The function generateOrder() will be called internally. You do not need to call it yourself.
Input
The generateOrder() takes no argument. It is called internally.
Output
The generateOrder() function returns a function that returns the string "Total orders = " + count, where count is the number of times the function is called.

Example
const initC = generateOrder(starting);
console.log(initC()) //prints "Total orders = 1"
console.log(initC()) //prints "Total orders = 2"
console.log(initC()) //prints "Total orders = 3"
*/