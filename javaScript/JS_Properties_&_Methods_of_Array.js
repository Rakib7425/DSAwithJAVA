function arrayProperties(arr1, arr2) {
    // Step 1
    const arr3 = arr2.concat(arr1);

    // Step 2
    arr3.push(arr2);
    console.log(arr3);

    // Step 3
    arr3.pop();

    // Step 4
    console.log(arr3.reverse());

    // Step 5
    const lastIndex = arr3.lastIndexOf("orange");
    console.log(lastIndex);

    // Step 6
    const slicedArr = arr3.slice(0, 3);
    console.log(slicedArr.length);

    // Step 7
    const joinedArr = slicedArr.join(",");
    console.log(joinedArr);
}

/**
 * 
 * JS Properties & Methods of Array
easy
Problem Statement
We have provided you with the JS boilerplate, within which you will complete the arrayProperties function which takes two arguments arr1 and arr2, which are lists of fruits. Inside the function, you will be applying different methods on the array, and after some methods are applied, you will print the result on the console.
Note: Follow the order of steps, and accordingly apply the method to pass the tests.
Steps:

Create an array arr3, which would consist of the items from arr2 followed by the items from arr1 concatenated together.

Push arr2 array in the arr3 array and print the result to console.

Pop out the last item from the arr3.

print the reverse order of arr3 to console.

Find the last index of the "orange" item in arr3 array and print it to console.

Now, create a slice of arr3 which includes the first item till the third item and print the length of it to the console.

Last step, join the sliced array with items separated by a comma and print it to the console. The last step should print a string to the console.


To test with output generator
Paste in input like this
["pineapple","orange","banana"] ["apple","orange","mango"]
Input
The function takes two arrays, arr1, and arr2, as arguments.
Both arr1 and arr2, are arrays of fruits.
Output
Prints two arrays, two numbers, and a string, in the same order, to the console.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
arr1= ["apple","orange","mango"];
arr2 = ["pineapple","orange"];

arrayProperties(arr1, arr2);

// should console log
['pineapple','orange','apple','orange','mango',['pineapple','orange' ]]
[ 'mango', 'orange', 'apple', 'orange', 'pineapple' ]
3
3
mango,orange,apple
*/