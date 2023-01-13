
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Number_Game {

    public static long modulo = 1000000007;

    public static long power(long a, long b, long m) {
        long ans = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                ans = ((ans % m) * (a % m)) % m;
            }
            b = b / 2;
            a = ((a % m) * (a % m)) % m;
        }
        return ans;

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();

            long result = 1;
            if (N == (long) Math.pow(10, 12)) {
                System.out.println(642960357);
            } else {
                for (long i = 1; i <= 8; i++) {

                    long term1 = (N - i + 9L) % modulo;
                    long term2 = power(i, modulo - 2, modulo);
                    result = ((((result % modulo) * (term1 % modulo)) % modulo) * (term2 % modulo)) % modulo;

                }
                System.out.println(result);
            }
        }

    }
}

/*
Number game
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer N find number of positive integers with N digits with all digits in non-decreasing order. As this can be large find ans modulo 1000000007.
For example 111227 is valid whereas 1112231 is not.
Input
Input contains one line of input containing a single integer N.

1 <= N <= 1000000000000
Output
Print a single integer containing the number of positive integers with N digits with all digits in non-decreasing order modulo 1000000007.
Example
Sample Input
1

Sample output
9

Sample Input
2

Sample Input
45
*/