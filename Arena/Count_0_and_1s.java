import java.util.Scanner;

public class Count_0_and_1s {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {

               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               int a = 0, b = 0;
               for (int elem1 : arr) {
                    if (elem1 == 1) {
                         a++;
                    }
               }

               for (int elem0 : arr) {
                    if (elem0 == 0) {
                         b++;
                    }
               }

               System.out.print(a + " ");
               System.out.print(b + " ");
          }

     }
}


/*
? Explanation 

This code takes in an array of integers and counts the number of 0s and 1s in the array. It first creates a Scanner object to take in user input. It then creates an array with the size of the number entered by the user. The code then iterates through each element of the array, counting how many 1s and 0s there are, and prints out the total count for each at the end.
* 
*/


/*
 * Count of 0's and 1's
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a binary array of size N. Count number of 1's and 0's in the array.
 * Input
 * First line contains n.
 * Next line contains n space separated integers.
 * 
 * Constraints
 * 1 <= N <= 105
 * 0 <= arr[i] <= 1
 * Output
 * Print two integers, count of 1s and count of 0s.
 * Example
 * Input:
 * 5
 * 0 1 1 0 1
 * 
 * Output:
 * 3 2
 */
