import java.util.Scanner;

public class Killing_Monstars {
     /**
      * @Author Rakib RsM
      */
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               long[] a = new long[n + 1];

               for (int i = 0; i <= n; i++) {
                    a[i] = sc.nextLong();
               }

               long h = 0;
               long b;
               long d = 0;
               for (int i = 0; i <= n; i++) {
                    if (i != n) {
                         b = sc.nextLong();
                    } else {
                         b = 0;
                    }
                    if (h <= a[i]) {
                         d += h;
                         a[i] -= h;
                    } else {
                         d += a[i];
                         a[i] = 0;
                    }
                    if (b <= a[i]) {
                         d += b;
                         h = 0;
                    } else {
                         d += a[i];
                         h = b - a[i];
                    }
               }
               System.out.println(d);
          }
     }
}

/*
 * Killing Monsters
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * N+1 towns are going to be attacked by monsters. The i-th town will be
 * attacked by Ai monsters. Saloni has got N of her friends for rescue. The i-th
 * friend has the capability to kill at most Bi monsters. The only constraint is
 * that the i-th friend can kill monsters from town i and i+1 only.
 * Find the maximum number of monsters the friends can kill.
 * Input
 * The first line of input contains an integer N.
 * The next line contains N+1 integers Ai.
 * The next line contains N integers Bi.
 * 
 * Constraints
 * 1 <= N <= 100000
 * 1 <= Ai, Bi <= 1000000000
 * Output
 * Output a single integer, the maximum number of monsters that can be killed.
 * Example
 * Sample Input
 * 2
 * 3 5 2
 * 4 5
 * 
 * Sample Output
 * 9
 * 
 * Explanation
 * The first friend will kill 2 monsters from town 1 and 2 monsters from town 2.
 * The second friend will kill 3 monsters from town 2 and 2 monsters from town
 * 3.
 * 
 * Sample Input:
 * 2
 * 100 1 1
 * 1 100
 * 
 * Sample Output:
 * 3
 */