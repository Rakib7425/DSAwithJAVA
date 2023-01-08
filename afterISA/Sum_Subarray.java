
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Sum_Subarray {
     // helper function to calculate sum of elements in array
     public static int goodSubArray(int[] arr, int n, long k) {
          long sum = 0l;
          int start = 0;
          int end = 0;
          int minLength = n + 1;
          while (start < n && end < n && sum < k) {
               sum += arr[end++];
               while (sum >= k) {
                    if (end - start < minLength) {
                         minLength = (end - start);
                         // break;
                    } else {
                         sum = sum - arr[start++];
                    }
               }
          }
          return minLength;
     }

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               long k = sc.nextLong();
               int[] arr = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               int z = goodSubArray(arr, n, k);
               System.out.print(z);
          }
     }
}

/*
 * Sum Subarray
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given an array Arr of N integers. A subarray is good if the sum of
 * elements of that subarray is greater than or equal to K. Print the length of
 * good subarray of minimum length.
 * scut
 * First line of scut contains N and K.
 * Second line of scut contains N integers representing the elements of the
 * array Arr.
 * 
 * Constraints
 * 1 <= N <= 100000
 * 1 <= Arr[i] <= 100000
 * 1 <= K <= 1000000000000
 * Output
 * Print the length of good subarray of minimum length.
 * Example
 * Sample scut
 * 5 12
 * 2 3 2 5 5
 * 
 * Sample output
 * 3
 * 
 * Explanation :
 * Subarray from index 3 to 5 has sum 12 and is therefore good and its length(3)
 * is minimum among all possible good subarray.
 */