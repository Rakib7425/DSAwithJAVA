
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Ultron_Gridding_the_XoR {

    static long f(long r, long c, int i) {
        r += (1L << 62) - (1L << i) + 1;
        c += (1L << i);
        if ((r & c) != 0)
            return (1L << i);
        return 0;
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            long r1 = sc.nextLong();
            long r2 = sc.nextLong();
            long c1 = sc.nextLong();
            long c2 = sc.nextLong();
            r1--;
            c1--;
            long ans = 0;
            for (int i = 0; i < 60; i++) {
                ans ^= f(r2, c2, i);
                ans ^= f(r1, c2, i);
                ans ^= f(r2, c1, i);
                ans ^= f(r1, c1, i);
            }
            System.out.println(ans);
        }
    }
}


/*
 * Ultron : Gridding the XoR
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Recently Ultron invented a new structure that he has called Xor Grid. It is
 * an infinitely large grid G filled with numbers based on these three rules:
 * 1. G[1, c] = 1 for all c ≥ 1
 * 2. G[r, 1] = r for all r ≥ 1
 * 3. G[r, c] = G[r - 1, c] xor G[r, c - 1] for all r > 1 and c > 1
 * Now Ultron is wondering, what are the xor sums of all the numbers within some
 * specific rectangles of the Xor Grid?
 * 
 * Note :
 * 
 * Xor sum refers to successive xor operations on integers. For example, xor sum
 * of integers x1, x2, x3, ., xn will be (. ((x1 xor x2) xor x3).. xor xn).
 * Input
 * The input contains four integers r1, r2, c1 and c2, where (r1, c1), (r2, c2)
 * denotes the coordinates of top- left and bottom- right cells of the rectangle
 * 
 * Constraints :
 * 1 ≤ r1 ≤ r2 ≤ 10^18
 * 1 ≤ c1 ≤ c2 ≤ 10^18
 * Output
 * Output a single integer ― the xor sum of all the numbers within G[r1. r2, c1.
 * c2].
 * Example
 * Sample Input:-
 * 1 2 1 4
 * 
 * Sample Output:-
 * 0
 * 
 * Explanation:-
 * Matrix:-
 * 1 1 1 1 1 1. .. ..
 * 2 3 2 3 2 3. .. ..
 * 3 0 2 1 3 0. .. ..
 * Required sum = 1^1^1^1^2^3^2^3 = 0
 * 
 * Sample Input:-
 * 1 1 71 93
 * 
 * Sample Output:-
 * 1
 */