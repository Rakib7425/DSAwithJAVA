// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Birthday_Cake_Candles {

  public static void main(String[] args) {
    // Your code here
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      int count = 1;
      for (int i = n - 1; i >= 1; i--) {
        if (arr[i] == arr[i - 1]) {
          count++;
        } else {
          break;
        }
      }
      System.out.println(count);
    }
  }
}
/**
 * 
 Birthday Cake Candles
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
Input
The first line contains a single integer, n, the size of candles[ ].
The second line contains n space- separated integers, where each integer i describes the height of candles[i].

Constraints
1 ≤ n ≤ 105
1 ≤ candles[i] ≤ 107
Output
-
Example
Sample Input
4
3 2 1 3
Sample Output
2
Explanation
Candle heights are [3, 2, 1, 3]. The tallest candles are 3 units, and there are 2 of them.
 */
