
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework 

// don't change the name of this class
// you can add inner classes if needed
public class Hardworking_AL {
    public static int gma(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long a = 1;

        while (a * 2 <= n) {
            a = a * 2;
        }
        return 1 + gma(n - a);
    }

    public static void main(String[] args) {
        // Main Method is here
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            System.out.println(gma(n));

        }
    }
}


/*
 * Hardworking AL
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Al is given task to build a skyscraper of N floors. He can build 2**i (2 to
 * the power i, where i can be any non-negative integer) floors in one day.
 * Report the minimum number of days required to build the skyscraper.
 * Input
 * First and only line of input contains a single integer N.
 * 
 * Constraints :
 * 1 <= N <= 1000000000000
 * Output
 * Print a single integer, the minimum number of days required to build the
 * skyscraper.
 * Example
 * Sample Input:
 * 5
 * 
 * Sample Output:
 * 2
 * 
 * Sample Input:
 * 1
 * 
 * Sample Output:
 * 1
 */