
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Inversion_count {

     public static long count = 0;

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
 * Inversion count
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Calculate inversion count of array of integers.
 * Inversion count of an array is quantisation of how much unsorted an array is.
 * A sorted array has inversion count 0, while an unsorted array has maximum
 * inversion count.
 * Formally speaking inversion count = number of pairs i, j such that i < j and
 * a[i] > a[j].
 * Input
 * The first line contain integers N.
 * The second line of the input contains N singly spaces integers.
 * 
 * 1 <= N <= 100000
 * 1 <= A[i] <= 1000000000
 * Output
 * Output one integer the inversion count.
 * Example
 * Sample Input
 * 5
 * 1 1 3 2 2
 * 
 * Sample Output
 * 2
 * 
 * Sample Input
 * 5
 * 5 4 3 2 1
 * 
 * Sample Output
 * 10
 */