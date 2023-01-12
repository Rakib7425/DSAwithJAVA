
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Super_Exponentation {

  public static void main(String[] args) {
    // Your code here

    try (Scanner sc = new Scanner(System.in)) {
      int t = sc.nextInt(); // number of test cases
      int mod = 1000000007;
      int phi = mod - 1; // Euler's totient function of mod

      while (t-- > 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int pow = 1;
        a %= mod;
        while (c > 0) {
          if ((c & 1) == 1) {
            pow = (int) (((long) pow * b) % phi);
          }
          b = (int) (((long) b * b) % phi);
          c >>= 1;
        }

        int result = 1;
        while (pow > 0) {
          if ((pow & 1) == 1) {
            result = (int) (((long) result * a) % mod);
          }
          a = (int) (((long) a * a) % mod);
          pow >>= 1;
        }

        System.out.println(result);
      }
    }
  }
}
/*
 * Super-Exponentation
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Modulo exponentiation is super awesome. But can you still think of a solution
 * to the following problem?
 * Given three integers {a, b, c}, find the value of abc % 1000000007.
 * Here ab means a raised to the power b or pow(a, b). Expression evaluates to
 * pow(a, pow(b, c)) % 1000000007.
 * 
 * (Read Euler's Theorem before solving this problem)
 * Input
 * The first input line has an integer t: the number of test cases.
 * After this, there are n lines, each containing three integers a, b and c.
 * 
 * 
 * Constraints
 * 1≤ t ≤ 100
 * 0 ≤ a, b, c ≤ 1000000000
 * Output
 * For each test case, output the value corresponding to the expression.
 * Example
 * Sample Input
 * 3
 * 3 7 1
 * 15 2 2
 * 3 4 5
 * 
 * Sample Output
 * 2187
 * 50625
 * 763327764
 * 
 * Explaination:
 * In the first test, a = 3, b = 7, c = 1
 * bc = 71 = 7
 * abc = 37 = 2187
 */
