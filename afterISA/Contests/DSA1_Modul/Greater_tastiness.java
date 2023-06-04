package DSA1_Modul;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Greater_tastiness {

  public static void main(String[] args) {
    // Your code here
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int res = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] > k) {
          res += 1;
        }
      }
      System.out.print(res);
    }
  }
}
/*
 * 
 * Greater tastiness (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array "a" containing n chocolates, each having its own tastiness, and all chocolates are sorted in increasing order of their tastiness and you are given a number k, you have to tell how many chocolates have tastiness greater than k.

Note:
Do it in O(logn) time complexity.
Input
The first line contains two space-separated integers n and k denoting the number of elements in the array and a number respectively.
The second line contains n space-separated integers of the array "a".

Constraints:-
1 ≤ n ≤ 10000
1 ≤ a[i] ≤ 10000
Output
Print count of chocolates having tastiness greater than k.
Example
Sample Input 1:
4 2
1 2 3 4

Sample Output 1:
2

Explanation 1:
Only two chocolates having tastiness greater than 2.
*/
