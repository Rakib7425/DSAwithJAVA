// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Special_numbers {
    public static void main(String[] args) {
        // Your code here

        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();

            int count = 0;
            for (long i = 1; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    count++;
                    if (i * i != N) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}


/*
 * Special numbers
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a number N , you need to calculate number of distinct values of gcd(i,
 * N) where i is between 1<=i<=1e18.
 * Note:-You need to check for all the possible values of i.
 * Input
 * Input contains a single integer N.
 * 
 * Constraints:-
 * 1<=N<=10^10
 * Output
 * Print the number of distinct numbers of gcd(i, N) where i is between
 * 1<=i<=1e18.
 * Example
 * Input:
 * 16
 * 
 * Output:
 * 5
 * 
 * Explanation:-
 * all disticnt numbers are - 1,2,4,8,16
 * 
 * Input:
 * 3248
 * 
 * Output:
 * 20
 */