
// import java.io.*;
import java.util.*;

/**
 * Minimum_length_unsorted_array
 */
public class Minimum_length_unsorted_array {
   /* 
     static void printUnsortedFirstMethod(int arr[], int n) {
          int s = 0, e = n - 1, i, max, min;

          // step 1(a) of above algo
          for (s = 0; s < n - 1; s++) {
               if (arr[s] > arr[s + 1])
                    break;
          }
          if (s == n - 1) {
               System.out.println("The complete array is sorted");
               return;
          }

          // step 1(b) of above algo
          for (e = n - 1; e > 0; e--) {
               if (arr[e] < arr[e - 1])
                    break;
          }

          // step 2(a) of above algo
          max = arr[s];
          min = arr[s];
          for (i = s + 1; i <= e; i++) {
               if (arr[i] > max)
                    max = arr[i];
               if (arr[i] < min)
                    min = arr[i];
          }

          // step 2(b) of above algo
          for (i = 0; i < s; i++) {
               if (arr[i] > min) {
                    s = i;
                    break;
               }
          }

          // step 2(c) of above algo
          for (i = n - 1; i >= e + 1; i--) {
               if (arr[i] < max) {
                    e = i;
                    break;
               }
          }
          // step 3 of above algo
          System.out.println(s + " " + e);
          return;
     }

     */
     public static void printUnsortedMethod2(int[] arr, int n) {

          int len = n;
          int s = 0;
          int e = 0;
          int max = 0;
          int min = 0;
          ArrayList<Integer> temp = new ArrayList<Integer>();
          // scan through array and find if any element is greater than
          // the next, store the index of that element in s
          // same from the right side, if any element is less than
          // the next, store the index in e
          for (int i = 0; i < len - 1; i++) {
               if (arr[i] > arr[i + 1]) {
                    s = i;
                    break;
               }

          }

          for (int i = len - 1; i > 0; i--) {
               if (arr[i] < arr[i - 1]) {
                    e = i;
                    break;
               }
               // System.out.println(e);

          }

          // System.out.println(s);
          // System.out.println(e);
          // System.out.println();
          // size of subarray

          // store all element within s and e into temp
          for (int i = s; i <= e; i++) {
               temp.add(arr[i]);

          }

          // sort temp and store in min element in min and max in max
          Collections.sort(temp);
          // System.out.println(temp[0]);
          min = temp.get(0);
          max = temp.get(temp.size() - 1);

          // check if any element from arr[0..e-1] are greater than min
          // if true, change s to point to the index of the element
          for (int i = 0; i < s; i++) {
               if (arr[i] > min) {
                    s = i;
               }
          }

          // check if any element from arr[e..len-1] are smaller than max
          // if true, change e to point to the index of the element
          for (int i = e; i < len; i++) {
               if (arr[i] < max) {
                    e = i;
               }
          }

          System.out.println(s + " " + e);

     }

     public static void main(String args[]) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               // int arr_size = arr.length;

               // printUnsortedFirstMethod(arr, n); // First Method
               printUnsortedMethod2(arr, n); // Second Method
          }
     }
}

/*
 * 
 * Minimum length unsorted array
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an unsorted array arr[0. n-1] of size N, find the minimum length
 * subarray arr[s. e](where s and e are start and end index) such that sorting
 * this subarray makes the whole array sorted.
 * 
 * Try to solve the question in O(n).
 * Input
 * The first line of input contains an integer N next line contains N
 * space-separated integers depicting the values of the array.
 * 
 * Constraints:-
 * 1 < = N < = 1000000
 * 0 < = Arr[i] < = 1000000
 * Output
 * Print the start and end indices(0 indexing) of the minimum subarray that
 * needs to be sorted.
 * Example
 * Sample Input:-
 * 5
 * 1 3 2 4 5
 * 
 * Sample Output:-
 * 1 2
 * 
 * Explanation: Elements present in subarray at indices 1, 2 after sorting makes
 * the whole array sorted.
 * 
 * Sample Input:-
 * 6
 * 2 1 5 4 9 10
 * 
 * Sample Output:-
 * 0 3
 */