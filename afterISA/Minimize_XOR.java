
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
//@Rakib7425
public class Minimize_XOR {
    public static int minXor(int arr[], int n) {
        Arrays.sort(arr);
        int minXor = Integer.MAX_VALUE;
        int val = 0;
        for (int i = 0; i < n - 1; i++) {
            val = arr[i] ^ arr[i + 1];
            minXor = Math.min(minXor, val);
        }
        return minXor;
    }

    public static void main(String[] args) {
        // Main Method is here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(minXor(arr, n));
        }
    }
}

/*
 * 
 * Minimize XOR
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array A of N integers, find the pair of integers in the
 * array which have minimum XOR value. Report the minimum XOR value.
 * Input
 * First line denotes N, the size of the array.
 * Next line denotes N space-separated array elements.
 * 
 * Constraints:
 * 2 <= N <= 100000
 * 0 <= A[i] <= 10^7
 * Output
 * Print a single integer denoting minimum xor value
 * Example
 * Sample Input
 * 4
 * 0 2 5 7
 * 
 * Sample Output
 * 2
 * 
 * Explanation:
 * 0 xor 2 = 2
 * 
 * Sample Input
 * 4
 * 0 4 7 9
 * 
 * Sample Output
 * 3
 */