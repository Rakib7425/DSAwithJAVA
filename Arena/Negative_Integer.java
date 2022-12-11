/*
Negative integer
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers, check if it contains any negative integer.
Input
First line of input contains a single integer N. The next line contains the N space separated integers.

Constraints:-
1 < = N < = 1000
-10000 < = Arr[i] < = 10000
Output
Print "Yes" if the array contains any negative integer else print "No".
Example
Sample Input:-
4
1 2 3 -3

Sample Output:-
Yes

Sample Input:-
3
1 2 3

Sample Output:-
No


*/

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Negative_Integer {
     public static void main(String[] args) {
          // Your code here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();

               int arr[] = new int[n];
               boolean found = false;

               for (int j = 0; j < n; j++) {
                    arr[j] = sc.nextInt();
               }

               for (int elem : arr) {
                    if (elem < 0) {
                         found = true;
                         break;
                    }

               }

               if (found) {
                    System.out.print("Yes");
               } else {
                    System.out.print("No");
               }
          }

     }
}