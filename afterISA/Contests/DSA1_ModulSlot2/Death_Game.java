package DSA1_ModulSlot2;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Death_Game {

  public static int minimumPlayersToShoot(int[] heights, int K) {
    int minPlayers = 0;

    for (int height : heights) {
      if (height > K) {
        minPlayers++;
      }
    }

    return minPlayers;
  }

  public static void main(String[] args) {
    // Your code here
    try (Scanner sc = new Scanner(System.in)) {
      // Read the number of test cases
      int T = sc.nextInt();

      for (int t = 0; t < T; t++) {
        // Read the number of players and the height of Ram and Rahul
        int N = sc.nextInt();
        int K = sc.nextInt();

        // Read the heights of the players
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
          heights[i] = sc.nextInt();
        }

        // Calculate the minimum number of players to shoot
        int minPlayers = minimumPlayersToShoot(heights, K);

        // Print the result
        System.out.println(minPlayers);
      }
    }
  }
}
/**
 * Death Game (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a straight line with N players standing between Ram and Rahul, each with a certain height Hi, and assuming Rahul hides behind Ram to avoid getting shot, the task is to find the minimum number of players who need to get shot so that Rahul becomes visible in Ram line of sight. The height of Ram and Rahul is the same, K.
Write a code that prints the minimum number of players that need to be shot.
Input
The first line of the input contains a single integer T, denoting the number of test cases. The description of T test cases follows
The first line of each test case contains two space- separated integers N and K, denoting the total number of players between Ram and Rahul and the height of both of them respectively.
The second line of each test case contains N space- separated integers, denoting the heights of the players between Ram and Rahul.

Constraints
1 ≤ T ≤ 105
1 ≤ N ≤ 105
1 ≤ K ≤ 106
1 ≤ Hi ≤ 106
The sum of N across all the test cases doesn't exceed 5x105
Output
For each test case, output in a single line the minimum number of players who need to get shot so that Rahul is visible in Ram's line of sight.
Example
Sample Input
2
4 10
2 13 4 16
4 6
1 2 3 4
Sample Output
2
0
Explanation
Test case 1: Rahul and Ram have a height of 10. For Ram to be visible to Rahul, the second person (with height 13) and the fourth person (with height 16) need to get shot. Hence, the minimum number of players who need to get shot is 2.
Test case 2: Nobody needs to get shot because everyone is shorter than Ram and Rahul.
 */
