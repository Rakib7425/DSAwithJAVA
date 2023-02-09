
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class K_Pairs {

    public static long findPairs(long arr[], int n, long k) {
        Arrays.sort(arr);
        int l = 0;
        int r = n - 1;
        long cnt = 0;
        while (l < r) {
            if (arr[l] * arr[r] > k) {
                cnt += (r - l);
                r--;
            } else {
                l++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findPairs(arr, n, k));
        }
    }
}

/*
 * K-Pairs (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array A of size N and an integer K, find and print the number of
 * pairs of indices i, j (1 <= i < j <= N) such that Ai * Aj > K.
 * Input
 * First line of the input contains two integers N and K.
 * The second line of the input contains N space seperated integers.
 * 
 * Constraints:
 * 1 <= N <= 105
 * 1 <= K <= 1012
 * 1 <= Ai <= 106
 * Output
 * Print the number of pairs of indices i, j (1 <= i < j <= N) such that Ai * Aj
 * > K.
 * Example
 * Sample Input:
 * 7 20
 * 5 7 2 3 2 9 1
 * 
 * Sample Output:
 * 5
 * 
 * Explanation:
 * The following pairs of indices satisfy the condition (1-based indexing)
 * (1, 2) -> 5 * 7 = 35
 * (1, 6) -> 5 * 9 = 45
 * (2, 4) -> 7 * 3 = 21
 * (2, 6) -> 7 * 9 = 63
 * (4, 6) -> 3 * 9 = 27
 * All these products are greater than K (= 20).
 */