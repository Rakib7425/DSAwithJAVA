
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Choose_points {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] points = new int[n];
            for (int i = 0; i < n; i++) {
                points[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n - 2; i++) {
                int j = i + 2;
                while (j < n && points[j] - points[i] <= d) {
                    count += (j - i - 1);
                    j++;
                }
            }
            System.out.println(count);
        }
    }
}

/*
 * Choose points
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given N points on a horizontal axis. Find the number of ways you can
 * choose 3 points such that maximum distance between those points is not
 * greater than d.
 * Input
 * The first line contains two integers: N and d. The next line contains N
 * space-separated integers x1, x2, ..., xN, — the x-coordinates of the points
 * that Petya has got.
 * 
 * Constraints:
 * 1 ≤ N ≤ 1e5
 * 1 ≤ d ≤ 1e9
 * 1 ≤ |x[i]| ≤ 1e9
 * 
 * It is guaranteed that the coordinates of the points in the input strictly
 * increase.
 * Output
 * Print the number of ways to choose 3 points.
 * Example
 * Sample Input:
 * 4 3
 * 1 2 3 4
 * 
 * Sample Output:
 * 4
 * 
 * Explanation:
 * 1 2 3
 * 1 2 4
 * 2 3 4
 * 1 3 4
 * are the required triplets
 * 
 * Sample Input:
 * 4 2
 * -3 -2 -1 0
 * 
 * Sample Output:
 * 2
 */