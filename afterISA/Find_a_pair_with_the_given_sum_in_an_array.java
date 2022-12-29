
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Find_a_pair_with_the_given_sum_in_an_array {

     public static int count = 0;

     public static void mergeArr(int[] arr, int left, int mid, int right) {
          int n1 = mid - left + 1;
          int n2 = right - mid;
          int L[] = new int[n1];
          int R[] = new int[n2];
          for (int i = 0; i < n1; ++i) {
               L[i] = arr[left + i];

          }
          for (int j = 0; j < n2; ++j) {
               R[j] = arr[mid + 1 + j];
          }

          int i = 0, j = 0;
          int k = left;
 
          while (i < n1 && j < n2) {
               if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;

               } else {
                    count = count + (n1 - i);
                    arr[k] = R[j];
                    j++;

               }
               k++;
          }
          while (i < n1) {
               arr[k] = L[i];
               i++;
               k++;

          }
          while (j < n2) {
               arr[k] = R[j];
               j++;
               k++;

          }
     }

     public static void mergeSort(int[] arr, int left, int right) {
          if (left < right) {
               int mid = left + (right - left) / 2;
               mergeSort(arr, left, mid);
               mergeSort(arr, mid + 1, right);
               mergeArr(arr, left, mid, right);
          }
     }

     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               mergeSort(arr, 0, arr.length - 1);

               System.out.print(count);

          }
     }
}

/*
 * 
 * Find a pair with the given sum in an array
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an unsorted integer array having distinct integers, find a pair with
 * the given sum in it.
 * First element of pair > second element of pair
 * Input
 * First line of input contains a single integer N, next line contains N space
 * separated integers depicting the values of array and third line consist
 * target sum.
 * 
 * Constraints:
 * 2<=N<=5*(10^5)
 * 1<=A[i], target<=2*(10^9)
 * Target
 * Output
 * Print the pair of integers which sum is target.
 * Example
 * Sample Input1:-
 * 6
 * 8 7 4 5 3 1
 * 10
 * 
 * Sample Output:-
 * Pair found (7, 3)
 * 
 * 
 * Sample Input2:
 * 6
 * 5 2 6 8 1 9
 * 12
 * 
 * Sample Output:
 * Pair not found
 */