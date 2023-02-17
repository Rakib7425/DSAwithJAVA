
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Maximum_Contiguous_Subarray_Sum {

    public static long maxSumCont(int arr[], int n) {
        long ans = Integer.MIN_VALUE;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum > ans) {
                ans = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println(maxSumCont(arr, n));
            }
        }
    }
}

/*
 * Maximum Contiguous Subarray Sum
 * easy
 * asked in interviews by 2 companies
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array, A of length N, find the contiguous subarray within A which
 * has the largest sum.
 * Input
 * First line of each test case contain the number of test cases.
 * The first line of each test case contains an integer n, the length of the
 * array A
 * and the next line contains n integers.
 * 
 * Constraints:
 * 1<=T<=100
 * 1 <= N <= 10^5
 * -10^6 <= A[i] <= 10^6
 * Output
 * Output an integer representing the maximum possible sum of the contiguous
 * subarray.
 * Example
 * Input:
 * 1
 * 5
 * 1 2 3 4 -10
 * 
 * Output:
 * 10
 * 
 * Explanation:-
 * 1+2+3+4=10
 */