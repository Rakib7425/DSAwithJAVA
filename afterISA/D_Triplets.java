import java.util.Arrays;
import java.util.Scanner;

public class D_Triplets {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int p = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               Arrays.sort(arr);
               int i = 0, j = 2;
               long count = 0;
               while (j < n) {
                    if (i == j - 1) {
                         j++;
                         continue;
                    } else if ((arr[j] - arr[i]) <= p) {
                         int diff = j - i;
                         count = count + (((diff) * (diff - 1)) / 2);
                         j++;
                    } else {
                         i++;
                    }
               }
               System.out.println(count);
          }
     }
}
/*
 * D Triplets
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array Arr[] of size N as input, your task is to count the number of
 * triplets Arr[i], Arr[j] and Arr[k] such that:-
 * i < j < k and the difference between every 2 elements of triplets is less
 * than or equal to P i. e |Arr[i] - Arr[j]| <= P, |Arr[i] - Arr[k]| <= P and
 * |Arr[j] - Arr[k]| <= P
 * Input
 * The first line of input contains two space- separated integers N and P.
 * next line contains N space separated integers depicting the values of the
 * Arr[].
 * 
 * Constraints:-
 * 3 <= N <= 105
 * 1 <= Arr[i], P <= 109
 * 0 <= i <= N-1
 * Output
 * Return the count of triplets that satisfies the above conditions.
 * Example
 * Sample Input:-
 * 5 4
 * 1 3 2 5 9
 * 
 * Sample Output:-
 * 4
 * 
 * Explanation:-
 * (1, 3, 2), (1, 3, 5), (1, 2, 5), (2, 3, 5) are the required triplets
 * 
 * Sample Input:-
 * 5 3
 * 1 8 4 2 9
 * 
 * Sample Output:-
 * 1
 */