
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Tribonacci_Number_Easy_version_Recursion {
     // don't change the name of this class
     // you can add inner classes if needed

     public static int fibo(int n) {

          if (n == 1 || n == 0) {
               return 0;
          }
          if (n == 2 || n == 3) {
               return n - 2;
          }

          n = fibo(n - 1) + fibo(n - 2) + fibo(n - 3);

          return n;
          // return fibo(n) = fibo(n-1) + fibo(n-2) + fibo(n-3);

     }

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int num = sc.nextInt();

               System.out.print(fibo(num));
               // fibo(num);
          }
     }

}

/*
 * 
 * 
 * class Main {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int t0 = 0, t1 = 1, t2 = 1, tn = 0;
        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        return tn;
    }
}


 */
/*
 * 
 * 
 * Tribonacci Number: Easy-version (Recursion)
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Fibonacci numbers are interesting but Tribonacci numbers are more
 * interesting.
 * A Tribonacci number T(n) is the sum of the preceding three elements in a
 * series. Consider its first three numbers to be 0, 0, and 1. i. e T(1) = 0,
 * T(2) = 0, T(3) = 1.
 * Given a number N, your task is to return the nth Tribonacci number.
 * Input
 * The input contains a single integer N.
 * 
 * Constraints:-
 * 1 <= N <= 20
 * Output
 * Return the Nth Tribonacci number.
 * Example
 * Sample Input:-
 * 4
 * 
 * Sample Output:-
 * 1
 * 
 * Sample Input:-
 * 7
 * 
 * Sample Output:-
 * 7
 */