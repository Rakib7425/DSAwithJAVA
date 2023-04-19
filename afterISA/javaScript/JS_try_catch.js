function handleCallback(callback) {
    // write your code here
    try {
      if (typeof callback !== 'function') {
        throw new Error('Callback is not a function');
      }
      callback();
    } catch (error) {
      console.log('error thrown');
    }
    // callback(); // `callback` may or may not be a function
    // if `callback` is a function, it will not throw an error
    // if `callback` is not a function, `callback()` would throw an error which should be caught in catch block
   
  }

/*   JS try...catch
easy
Problem Statement
Complete the function handleCallback which has a single argument callback, which may or may not be a function.

Create a try, and catch block. Call the callback function inside the try block. In case callback is not a function, an error will be thrown which should be caught in the catch block. The catch block should print "error thrown" to the console.


Note: To check the expected output, we have already created a anyCallback function which prints "No error thrown" to the console. Just add anyCallback function without the parenthesis, to the input field to check the result.
Input
The handleCallback function takes in one argument, which may or may not be a function.
Output
The handleCallback function prints a string "error thrown" in the console, if the argument is not a function, otherwise nothing should be returned or printed.
ai_logoNEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Example 1: Giving no function as an argument to the function
handleCallback() // prints "error thrown"

Example 2: Giving anyCallback function as an argument to the function
handleCallback(anyCallback) // prints "No error thrown"

*/