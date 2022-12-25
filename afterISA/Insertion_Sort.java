
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Insertion_Sort {

     static void insertionSort(int arr[], int n) {
          // int n = arr.length;
          for (int i = 1; i < n; ++i) {
               int key = arr[i];
               int j = i - 1;

               while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
               }
               arr[j + 1] = key;
          }

          for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
          }
     }

     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {

               int T = sc.nextInt();

               while (T-- > 0) {

                    int n = sc.nextInt();
                    int arr[] = new int[n];

                    for (int index = 0; index < n; index++) {
                         arr[index] = sc.nextInt();
                    }

                    insertionSort(arr, n);
                    System.out.println();

               }
          }
     }
}

/*
 * Implementing Insertion sort
 * easy
 * asked in interviews by 3 companies
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array A[] of size N, containing positive integers. You need to sort
 * the elements of array using Insertion sort algorithm.
 * Input
 * First line of the input denotes number of test cases T. First line of the
 * testcase is the size of array N and second line consists of array elements
 * separated by space.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^3
 * 1 <= A[i] <= 10^3
 * Output
 * For each testcase print the sorted array in a new line.
 * Example
 * Input:
 * 2
 * 5
 * 4 1 3 9 7
 * 10
 * 10 9 8 7 6 5 4 3 2 1
 * 
 * Output:
 * 1 3 4 7 9
 * 1 2 3 4 5 6 7 8 9 10
 * 
 * Explanation:
 * Testcase 1: The array after perfoming insertion sort: 1 3 4 7 9.
 * Testcase 2: The array after performing insertion sort: 1 2 3 4 5 6 7 8 9 10.
 */