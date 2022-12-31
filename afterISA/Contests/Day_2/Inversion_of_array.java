
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Inversion_of_array {
     public static long count = 0;

     public static void Merge(int arr[], int left, int mid, int right) {
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

          int i = 0;
          int j = 0;
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

     public static void mergeSort(int arr[], int left, int right) {
          if (left < right) {
               int mid = left + (right - left) / 2;
               mergeSort(arr, left, mid);
               mergeSort(arr, mid + 1, right);
               Merge(arr, left, mid, right);

          }
     }

     public static void main(String[] args) {
          // Your code here

          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();

               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               mergeSort(arr, 0, n - 1);
          }

          System.out.print(count);
     }
}

/*
 * Inversion of array
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array of positive integers. The task is to find inversion count of
 * array.
 * 
 * Inversion Count : For an array, inversion count indicates how far (or close)
 * the array is from being sorted. If array is already sorted then inversion
 * count is 0. If array is sorted in reverse order that inversion count is the
 * maximum.
 * Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i <
 * j.
 * 
 * Asked in Adobe, Amazon, Microsoft.
 * Input
 * The first line of each test case is N, the size of the array. The second line
 * of each test case contains N elements.
 * 
 * Constraints:-
 * 1 ≤ N ≤ 10^5
 * 1 ≤ a[i] ≤ 10^5
 * Output
 * Print the inversion count of array.
 * Example
 * Sample Input:
 * 5
 * 2 4 1 3 5
 * 
 * Sample Output:
 * 3
 * 
 * Explanation:
 * Testcase 1: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1),
 * (4, 3).
 */