import java.util.Arrays;
import java.util.Scanner;

public class Check_if_N_And_2N_exist {

     static boolean binarySearch(int arr[], int l, int r, int x) {
          if (r >= l) {
               int mid = l + (r - l) / 2;

               if (arr[mid] == x)
                    return true;
               // return mid;

               if (arr[mid] > x)
                    return binarySearch(arr, l, mid - 1, x);

               return binarySearch(arr, mid + 1, r, x);
          }

          return false;
     }

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               Arrays.sort(arr);
               boolean possible = false;
               for (int i = 0; i <= n - 2; i++) {
                    // int l
                    if (binarySearch(arr, i + 1, n - 1, 2 * arr[i])) {
                         possible = true;
                         break;
                    }
               }
               if (possible) {
                    System.out.println("YES");
               } else {
                    System.out.println("NO");
               }
          }
     }
}




/*
 * Check if N and 2*N exist
 * easy
 * asked in interviews by 1 company
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array A of size N. Find whether there exist two index i and
 * j such that i != j and A[i] = 2 * A[j].
 * Input
 * First line contains an integer N.
 * Next line contains N space separated integers denoting elements of array.
 * 
 * Constraints
 * 1 <= N <= 10^5
 * 1 <= Ai <= 10^5
 * Output
 * Print "YES" if there exist two index i and j which fulfil the above
 * constraints. Otherwise print "NO".
 * Example
 * Sample Input 1:
 * 4
 * 10 2 5 3
 * 
 * Output
 * YES
 * 
 * Explanation:
 * Both 5 and 10 are present in the array.
 * 
 * Sample Input 2:
 * 4
 * 7 1 13 11
 * 
 * Output
 * NO
 * 
 * Explanation:
 * There does not exist and two indexes such that A[i] = 2 * A[j]
 */