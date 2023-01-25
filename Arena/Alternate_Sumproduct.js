// arr is the array of numbers, n is number of elements
function altSumProduct(arr, n) {
  // write code here
  // console.log the output in a single line,like example
  let sum = 0;
  let product = 1;
  for (let i = 0; i < n; i++)
    i % 2 == 0 ? (product *= arr[i]) : (sum += arr[i]);
  console.log(sum, product);
}

/* 
*Explanation 

This code takes in an array and a number (n) as parameters. It creates two variables, sum and product, and sets them both to 0 and 1 respectively. It then uses a for loop to iterate through the array up to the number n. For each iteration, it checks if the index is even or odd. If the index is even, it multiplies the product variable by the value of the current element in the array. If it is odd, it adds the value of that element to the sum variable. Finally, it prints out both sum and product on one line in the console.
*/

/*
 ? In Java
public static void altSumProduct(int[] arr, int n) {
  int sum = 0;
  int product = 1;
  for (int i = 0; i < n; i++) {
    i % 2 == 0 ? (product *= arr[i]) : (sum += arr[i]);
  }
  System.out.println(sum + " " + product);
}

*/
