import java.util.Scanner;

public class Max_Complement {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();

               int arr[] = new int[n];
               for (int p = 0; p < n; p++) {
                    arr[p] = sc.nextInt();
               }
               int B[] = new int[n / 2];
               int i, j;
               for (i = 0, j = arr.length - 1; i <= (n - 1) / 2; i++, j--) {
                    B[i] = arr[i] * arr[j];
               }
               int big = B[0];
               for (int k = 1; k <= (n - 1) / 2; k++) {
                    if (big < B[k]) {
                         big = B[k];
                    }
               }
               System.out.print(big);
          }

     }
}


/*
 * max. complement
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You have given an array A of even length. Print the maximum possible product
 * of any number and their complement.
 * The first element is the complement of the last element, the second element
 * is the complement of the second last, and so on.
 * Solve the given problem in O(n).
 * Input
 * First line contain a integer N.
 * Next line contain N space integer A[i].
 * 
 * Constraints
 * 1<=N<=10^5
 * 1<=A[i]<=10^9
 * Output
 * Print the maximum possible product.
 * Example
 * Sample Input 1:
 * 8
 * 1 3 4 2 3 4 8 6
 * 
 * Sample Output 1:
 * 24
 * 
 * Sample Input 2:
 * 6
 * 1 2 3 4 5 6
 * 
 * Sample Output 2:
 * 12
 */