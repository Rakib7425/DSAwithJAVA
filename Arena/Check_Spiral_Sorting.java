// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Check_Spiral_Sorting {

  public static boolean isSpirallySorted(int[] nums, int n) {
    int mid = (n + 1) / 2;
    boolean isSpiral = true;
    int prev = nums[0];
    int last = nums[n - 1];
    for (int i = 0; i < mid; i++) {
      if (prev <= last) {
        prev = last;
        last = nums[i + 1];
      } else {
        isSpiral = false;
        break;
      }
    }
    return isSpiral;
  }

  public static void main(String[] args) {
    // Your code here
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      if (isSpirallySorted(arr, n)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
/***
 * Check Spiral Sorting
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is an integer array nums having n integers, given as input. Find out whether the given array is spirally sorted or not.

Note:
An array nums, having N elements is spirally sorted if nums[0] ≤ nums[N – 1] ≤ nums[1] ≤ nums[N – 2] …
Input
An integer n (size of array nums) is given as input. In the Second line, n space-separated integers are given as input.

Constraints
1 ≤ n ≤ 105
0 ≤ nums[i] ≤ 5*104
0 ≤ i ≤ n-1
Output
Print "YES" if Array is Spirally sorted else "NO"(without quotes).
Example
Sample Input 1:
7
1 10 14 20 18 12 5

Sample Output 1:
YES

Explanation:
arr[0] < arr[6]
arr[1] < arr[5]
arr[2] < arr[4]
Therefore, the required output is YES.

Sample Input 2:
4
1 2 4 3

Sample Output 2:
NO
 */
