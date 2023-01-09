// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Calculate_Distence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read A, B, and C
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // Calculate the minimum time needed to visit all the points
            int minTime = Math.min(a + b, Math.min(b + c, a + c));

            // Print the minimum time
            System.out.println(minTime);
        }
    }
}


/*
 * Calculate Distance
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * There are 3 points, X, Y and Z on a road.
 * 
 * It takes A hours to travel from X to Y or from Y to X.
 * It takes B hours to travel from Y to Z or from Z to Y.
 * It takes C hours to travel from X to Z or from Z to X.
 * 
 * Newton is given the time required to travel between the points, i. e. A, B
 * and C. He wants you to help him to calculate the minimum time needed to visit
 * all the points once, starting from any point of your choice.
 * Input
 * The first and the only line of the input contains 3 integers, A, B and C.
 * 
 * Constraints:
 * 1 ≤ A, B, C ≤ 1000
 * Output
 * Output the answer
 * Example
 * Sample Input 1:
 * 1 3 4
 * 
 * Sample Output 1:
 * 4
 * 
 * Sample Explanation 1:
 * The minimum distance to travel all 3 points can be found is we start at A and
 * then go to B and then to C.
 * A - > B - > C = 1 + 3 = 4
 * 
 * 
 * Sample Input 2:
 * 3 2 3
 * 
 * Sample Output 2:
 * 5
 * 
 */