
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework 

public class Max_subarray_sum_size_K {
     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int k = sc.nextInt();
               int arr[] = new int[n];
               int arrB[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               for (int i = 0; i < n - k + 1; i++) {
                    int sum = 0;
                    int a = i;
                    int j = k;
                    while (j >= 1) {
                         sum += arr[a++];
                         j--;
                    }
                    arrB[i] = sum;
               }
               int big = arrB[0];

               for (int a = 0; a < n - k + 1; a++) {
                    if (big < arrB[a]) {
                         big = arrB[a];
                    }
               }
               System.out.println(big);

          }

     }

}

/*
 * Max subarray sum (size K)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array of integers A and a number K, find maximum sum of a subarray
 * of size K.
 * Input
 * The first line of input contains two integers N and K, denoting the number of
 * elements in the array and the subarray size respectively.
 * The next line contains N integers denoting the elements of the array
 * respectively.
 * 
 * 1 <= K <= N <= 200000
 * -200000 <= A[i] <= 200000
 * Output
 * Print a single integer denoting the maximum sum of subarray of size K.
 * Example
 * Sample Input:
 * 4 2
 * -1 5 2 -3
 * 
 * Sample Output:
 * 7
 * 
 * Explanation:
 * Three subarrays of size 2, their sum are 4, 7, -1
 */