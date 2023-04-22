function callThisFnBack(num, callback) {
    // return the output using return keyword
    // do not console.log it

    return callback(num);
}

/**
 * 
 * JS callbacks
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Complete the function callThisFnBack
Such that it takes a number as the first argument and a function (callback function) as the second argument. You have to pass the first argument of the function callThisFnBack to the callback function and execute the callback function inside the callThisFnBack and return its result.
Input
The function will take two arguments, one which is a number and the second which will be a function.
Output
Returns the result of the second argument which is the callback function when its argument is the first argument of the function callThisFnBack.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
const result = callThisFnBack(5, (num)=>{
return num+6
})
console.log(result) // prints 11 because 5+6
const newFn = (number) => {
return number - 5
}
const newResult = callThisFnBack(5,newFn)
console.log(newResult) // prints 0 because 5-5=0
 */