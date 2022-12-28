// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Number_of_Merge {


     static int mergeCount = 0;

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
               mergeCount++;
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

               for (int i : arr) {
                    System.out.print(i + " ");
               }
               System.out.printf("\n" + mergeCount);

          }
     }
}


/*
 * Number of Merge
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an unsorted array of length n and must sort it using merge sort while also printing the amount of merges that occur throughout the sorting process.
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0<= n <=100000
Output
First- line should be the sorted array and the second should be the number of mergers that occurs when the array is sorted using merge sort.
Example
Sample Input:
5
5 1 2 7 3

Output:
1 2 3 5 7
4
 */