class Solution {

  public int arrangeCoins(int n) {
    // enter your code.
    long left = 1;
    long right = n;

    while (left <= right) {
      long mid = left + (right - left) / 2;
      long coinsNeeded = mid * (mid + 1) / 2;

      if (coinsNeeded <= n) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return (int) right;
  }
}
/***]
 *Arranging Coins
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function arrangeCoins() that takes Integers "n" as parameter.

Constraints:
1 ≤ n ≤ 231 - 1
Output
Return the number of complete rows of the staircase you will build.
Example
Sample 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Sample 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 */
