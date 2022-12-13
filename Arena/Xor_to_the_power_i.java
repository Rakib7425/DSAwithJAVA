import java.util.Scanner;

/* 
* Xor to the power i
Time Limit: 2 sec
! Memory Limit: 128000 kB
? Problem Statement
? Given an array of N integers. Find the xor_value of the array.
? xor_value of an array is the xor of all the elements if the ith element is taken i number of times (1 based indexing).
! For example xor_value of array [2, 3, 1, 4] = 2 xor 3 xor 3 xor 1 xor 1 xor 1 xor 4 xor 4 xor 4 xor 4 = 3.
? Input
? First line of input contains N.
? Second line of input contains N space seperated integers, representing the elements of the array.

* Constraints
* 1 <= N <= 100000
* 1 <= Arr[i] <= 100000
* Output
* Print a single integer, the xor_value of the array.
* Example
* Sample input
* 4
* 2 3 1 4
* 
* Sample output
* 3
* 
* Sample Input
* 5
* 2 7 10 2 10
* 
* Sample Output
* 2
*/

// * Not Working 
public class Xor_to_the_power_i {

     public static int xorOfArray(int arr[], int n) {

          int xor_arr = 0;

          for (int i = 0; i < n; i++) {

               xor_arr = xor_arr ^ arr[i];
          }
          return xor_arr;
     }

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               System.out.println(xorOfArray(arr, n));
          }

     }
}
