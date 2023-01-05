
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework 

// don't change the name of this class
// you can add inner classes if needed
public class Gray_Code {
    public static int codeGrayCon(int n) {
        return n ^ (n >> 1);
    }

    public static void main(String[] args) {
        // Main Method is here
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                System.out.println(codeGrayCon(n));

            }

        }
    }
}

/*
 * Gray Code
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given a decimal number n. You need to find the gray code of the
 * number n and convert it into decimal.
 * 
 * Binary to Gray conversion :
 * 1. The Most Significant Bit (MSB) of the gray code is always equal to the MSB
 * of the given binary code.
 * 2. Other bits of the output gray code can be obtained by XORing binary code
 * bit at that index and previous index.
 * 
 * Eg: Gray code of 01001 is 01101
 * Input
 * The first line contains an integer T, the number of test cases. For each test
 * case, there is an integer N denoting the number.
 * 
 * Constraints
 * 1 <= T <= 100
 * 1 <= N <= 10^9
 * Output
 * For each test case, print gray code equivalent of N in a separate line.
 * Example
 * Sample Input:
 * 4
 * 10
 * 13
 * 5
 * 101
 * 
 * Sample Output:
 * 15
 * 11
 * 7
 * 87
 * 
 * Explanation:
 * 5: 101 in binary
 * Gray: 111
 */