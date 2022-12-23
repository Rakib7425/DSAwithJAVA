// Check_if_array_is_sorted_and_rotated_clockwise
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed

public class Check_if_array_is_sorted_and_rotated_clockwise {
     public static boolean sortedRotatedArrayInc(int arr[], int N) {
          int dipIndex = -1;
          for (int i = 0; i < N - 1; i++) {
               if (arr[i] > arr[i + 1]) {
                    dipIndex = i + 1;
                    break;
               }
          }
          if (dipIndex == -1) {
               return false;
          }
          for (int i = dipIndex; i < N - 1; i++) {
               if (arr[i] > arr[i + 1]) {
                    return false;
               }
          }
          if (arr[N - 1] < arr[0]) {
               return true;
          } else {
               return false;
          }

     }

     public static boolean sortedRotatedArrayDec(int arr[], int N) {
          int dipIndex = -1;
          for (int i = 0; i < N - 1; i++) {
               if (arr[i] < arr[i + 1]) {
                    dipIndex = i + 1;
                    break;
               }
          }
          if (dipIndex == -1) {
               return false;
          }
          for (int i = dipIndex; i < N - 1; i++) {
               if (arr[i] < arr[i + 1]) {
                    return false;
               }
          }
          if (arr[N - 1] > arr[0]) {
               return true;
          } else {
               return false;
          }

     }

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int T = sc.nextInt();

               while (T-- > 0) {
                    int n = sc.nextInt();
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                         arr[i] = sc.nextInt();
                    }
                    if (sortedRotatedArrayInc(arr, n) || sortedRotatedArrayDec(arr, n)) {
                         System.out.println("Yes");
                    } else {
                         System.out.println("No");
                    }

               }
          }
     }
}

/*
 * 
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