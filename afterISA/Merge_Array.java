import java.util.Arrays;
import java.util.Scanner;

public class Merge_Array {

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int m = sc.nextInt();
               int a[] = new int[n];
               int b[] = new int[m];

               for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
               }

               for (int j = 0; j < m; j++) {
                    b[j] = sc.nextInt();
               }

               int res[] = new int[(n + m)];

               System.arraycopy(a, 0, res, 0, n);
               System.arraycopy(b, 0, res, n, m);

               Arrays.sort(res);

               for (int i = 0; i < res.length; i++) {
                    System.out.print(res[i] + " ");
               }
               // System.out.println(res);
          }
     }
}

/*
 * 
 * Merge array
 * medium
 * asked in interviews by 6 companies
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given two sorted array your task is to merge these two arrays into a single
 * array such that the merged array is also sorted
 * Input
 * First line contain two integers N and M the size of arrays
 * Second line contains N separated integers the elements of first array
 * Third line contains M separated integers elements of second array
 * 
 * Constraints:-
 * 1<=N,M<=104
 * 1<=arr1[], arr2[] <=105
 * Output
 * Output the merged array
 * Example
 * Sample Input:-
 * 3 4
 * 1 4 7
 * 1 3 3 9
 * 
 * Sample Output:-
 * 1 1 3 3 4 7 9
 */