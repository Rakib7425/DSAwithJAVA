
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Minimum_Absolute_Difference {

    public static void main(String[] args) {
        // Main Method is here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arrA[] = new int[n];
            int arrB[] = new int[n];

            for (int indexA = 0; indexA < n; indexA++) {
                arrA[indexA] = sc.nextInt();
            }

            for (int indexB = 0; indexB < n; indexB++) {
                arrB[indexB] = sc.nextInt();
            }

            int i = 0;
            int j = 0;
            int minPosDiff = Integer.MAX_VALUE;
            while (i < n && j < n) {
                int diff = Math.abs(arrA[i] - arrB[j]);
                minPosDiff = Math.min(minPosDiff, diff);
                if (arrA[i] < arrB[j])
                    i++;
                else
                    j++;
            }
            System.out.print(minPosDiff);
        }
    }
}

// for (int i : arrA) {
// System.out.print(i+" ");
// }
// System.out.println();
// for (int j : arrB) {
// System.out.print(j+ " ");
// }

/*
 * ? Minimum Absolute Difference
 * easy
 * asked in interviews by 1 company
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * ! you have given two integer arrays A and B of length N sorted in
 * ! non-decreasing order. Calculate the minimum possible difference between
 * elements of A and B.
 * Solve this problem in O(N) complexity.
 * Input
 * first- line contains a single integer N
 * second and third lines contain N space- separated integer A[i] and B[i].
 * Output
 * Print the minimum absolute difference between two elements from A and B.
 * Example
 * Sample Input:
 * 6
 * 12 15 16 19 21 29
 * 1 2 3 58 61 65
 * 
 * Sample Output:
 * 9
 * 
 * Explanation : minimum absolute difference can be found between first element
 * of first array and third element of second array.
 */