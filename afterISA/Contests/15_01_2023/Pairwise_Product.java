
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Pairwise_Product {
    // static final int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int mod = 1_000_000_007;

            long N = sc.nextLong();
            long sum = ((long) N * ((long) N + 1)) / 2;
            long ans = 0;
            for (long i = 0; i < N; i++) {
                sum = sum - i;
                ans = (ans + (i * sum)) % mod;
            }
            System.out.println(ans % mod);
        }
    }
}

/*
 * Pairwise product (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer N, find the sum of i*j for each pair (i, j) such that 1 <= i
 * < j <= N.
 * 
 * Since the answer can be large, output it modulo 109+7.
 * Input
 * The first and the only line of the input contains an integer N.
 * 
 * Constraints
 * 2 <= N <= 200000
 * Output
 * Output a single integer, the answer to the above problem.
 * Example
 * Sample Input
 * 4
 * 
 * Sample Output
 * 35
 * 
 * Explanation:
 * 1*2 + 1*3 + 1*4 + 2*3 + 2*4 + 3*4 = 2 + 3 + 4 + 6 + 8 + 12 = 35
 * 
 * Sample Input
 * 87
 * 
 * Sample Output
 * 7215142
 */