import java.util.Arrays;

class Solution {

  public int maximumTastiness(int[] price, int k) {
    //Write your code here
    Arrays.sort(price); // Sort the array of prices in ascending order
    int lo = 0, hi = 1000_000_000; // Initialize the lower and upper bounds of the binary search
    while (lo < hi) { // Loop until the bounds converge
      int mid = lo + (hi - lo) / 2; // Find the middle point
      if (check(mid, price, k)) lo = mid + 1; // If the middle point is a valid tastiness, move the lower bound to the right
      else hi = mid; // Otherwise, move the upper bound to the left
    }
    return lo - 1; // Return the maximum tastiness
  }

  boolean check(int x, int[] price, int k) {
    int last = price[0], count = 1, i = 1; // Initialize the last selected candy, the count of selected candies, and the index pointer
    while (count < k && i < price.length) { // Loop until we select k candies or reach the end of the array
      if (price[i] - last >= x) { // If the current candy has a difference of at least x with the last selected candy
        last = price[i]; // Select it and update the last selected candy
        count++; // Increment the count of selected candies
      }
      i++; // Move the index pointer to the next candy
    }
    return count == k; // Return true if we can select k candies with a difference of at least x, false otherwise
  }
}




/*Maximum Tastiness of Candy Basket (Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of positive integers price where price[i] denotes the price of the ith candy and a positive integer k.

The store sells baskets of k distinct candies. The tastiness of a candy basket is the smallest absolute difference of the prices of any two candies in the basket.

Return the maximum tastiness of a candy basket.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function maximumTastiness() that takes Integer array "price" and integer "k" as parameters.

Note- In sample first size of array and k is given and in next line array elements are given.

Constraints:
2 ≤ k ≤ price.length ≤ 105
1 ≤ price[i] ≤ 109
Output
Return the maximum tastiness of a candy basket.
Example
Sample 1:
Input:
6 3
13 5 1 8 21 2
Output:
8
Explanation: Choose the candies with the prices [13, 5, 21].
The tastiness of the candy basket is: min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8.
It can be proven that 8 is the maximum tastiness that can be achieved.

Sample 2:
Input:
3 2
1 3 1
Output:
2
Explanation: Choose the candies with the prices [1, 3].
The tastiness of the candy basket is: min(|1 - 3|) = min(2) = 2.
It can be proven that 2 is the maximum tastiness that can be achieved.

*/
