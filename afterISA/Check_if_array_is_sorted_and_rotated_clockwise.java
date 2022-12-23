import java.util.Scanner;

/**
 * Check_if_array_is_sorted_and_rotated_clockwise
 */
public class Check_if_array_is_sorted_and_rotated_clockwise {

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int T = sc.nextInt();

               while (T-- > 0) {
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                         arr[i] = sc.nextInt();
                    }

               }
          }
     }
}
/*
 * Check if array is sorted and rotated clockwise
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array arr[] of N distinct integers, check if this array is Sorted
 * and Rotated clockwise.
 * A sorted array is not considered as sorted and rotated, i.e., there should be
 * at least one rotation.
 * 
 * Note:-Array can be sorted both increasingly and decreasingly
 * Input
 * The first line of input contains number of testcases T. Each testcase
 * contains 2 lines, the first line contains N, the number of elements in array,
 * and second line contains N space separated elements of array.
 * 
 * Constraints:
 * 1 <= T <= 50
 * 3 <= N <= 10^3
 * 1 <= A[i] <= 10^4
 * 
 * 
 * 
 * Output
 * Print "Yes" if the given array is sorted and rotated, else Print "No",
 * without Inverted commas.
 * Example
 * Sample Input:
 * 2
 * 4
 * 3 4 1 2
 * 3
 * 1 3 2
 * 
 * Sample Output:
 * Yes
 * Yes
 * 
 * Explanation:
 * Testcase 1: The array is sorted (1, 2, 3, 4) and rotated twice (3, 4, 1, 2).
 * Testcase 2: The array is sorted (3, 2, 1) and rotated once (1, 3, 2).
 */

// Try
/*
 * import java.util.Scanner;
 * 
 * 
 * // Check_if_array_is_sorted_and_rotated_clockwise
 * 
 * public class Check_if_array_is_sorted_and_rotated_clockwise {
 * public static boolean isSorted(int[] a) {
 * // base case
 * if (a == null || a.length <= 1) {
 * return true;
 * }
 * 
 * for (int i = 0; i < a.length - 1; i++) {
 * if (a[i] > a[i + 1]) {
 * return false;
 * }
 * }
 * 
 * return true;
 * }
 * 
 * static int[] reverse(int a[], int n) {
 * int[] b = new int[n];
 * int j = n;
 * for (int i = 0; i < n; i++) {
 * b[j - 1] = a[i];
 * j = j - 1;
 * }
 * return a;
 * }
 * 
 * public static void main(String[] args) {
 * try (Scanner sc = new Scanner(System.in)) {
 * int T = sc.nextInt();
 * 
 * while (T-- > 0) {
 * int n = sc.nextInt();
 * int[] arr = new int[n];
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = sc.nextInt();
 * }
 * int arrRev[] = reverse(arr,n);
 * if (isSorted(arr) || arrRev != null) {
 * System.out.println("Yes");
 * } else {
 * System.out.println("No");
 * 
 * }
 * }
 * }
 * 
 * }
 * 
 * }
 */