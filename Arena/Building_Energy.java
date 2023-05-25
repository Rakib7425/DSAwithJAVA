// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Building_Energy {

  public static void main(String[] args) {
    // Your code here
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] heights = new int[n];
      for (int i = 0; i < n; i++) {
        heights[i] = sc.nextInt();
      }

      long energy = 0;

      for (int i = 0; i < n - 1; i++) {
        int curr = heights[i];
        int next = heights[i + 1];

        if (next > curr) {
          energy += 2 * (next - curr);
        } else {
          energy += (curr - next);
        }
      }

      System.out.println(energy);
    }
  }
}
/**
 * 
 * Building Energy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are N buildings numbered from 1 to N in a straight line, the ith building having height hi. You start from building 1 and move towards building N. If the height of the next building is greater than the current, you expend twice the difference in the heights of the building's energy units. If the height of the next building is lesser than the current, you expend the difference in the heights of the building's energy units.
Find the total amount of energy you would have to expend up until you reach building N.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= hi <= 109
Output
Print the total amount of energy you would have to expend uptill you reach building N.
Example
Sample Input:
5
3 5 2 1 7

Sample Output:
20

Explanation
3 --> 5 = 2*2=4
5 --> 2 = 3*1=3
2 --> 1= 1*1=1
1 --> 7= 6*2=12
Total = 4+3+1+12=20
 */
