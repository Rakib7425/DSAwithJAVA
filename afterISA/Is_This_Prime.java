
// import java.io.*; // for handling input/output
import java.math.*;
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Is_This_Prime {

    // function to return the set of prime divisors of x
    public static Set<Integer> prime(int x) {
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if (isPrime(i)) {
                    primes.add(i);
                }
                if (isPrime(x / i)) {
                    primes.add(x / i);
                }
            }
        }
        return primes;
    }

    // helper function to check if a number is prime
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // function to return the maximum possible integer p**k where x is divisible by
    // p**k
    public static int f(int x, int p) {
        int k = 1;
        while (x % (int) Math.pow(p, k) == 0) {
            k++;
        }
        return (int) Math.pow(p, k - 1);
    }

    // function to return the product of f(y, p) for all p in prime(x)
    public static int g(int x, int y) {
        int result = 1;
        for (int p : prime(x)) {
            result *= f(y, p);
        }
        return result;
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            // take input from user
            int x = sc.nextInt();
            int n = sc.nextInt();

            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(g(x, i)));
            }

            System.out.println(result.mod(BigInteger.valueOf(1_000_000_007)));
        }
    }
}


/*
 * Is this prime?
 * hard
 * asked in interviews by 26 companies
 * Time Limit: 1 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Let's assume some functional definitions for this problem.
 * We take prime(x) as the set of all prime divisors of x. For example,
 * prime(140)={2,5,7}, prime(169)={13}.
 * 
 * Let f(x,p) be the maximum possible integer p**k where k is an integer such
 * that x is divisible by p**k.
 * (Here a**b means a raised to the power b or pow(a, b))
 * For example:
 * f(99,3)=9 (99 is divisible by 3**2=9 but not divisible by 3**3=27),
 * f(63,7)=7 (63 is divisible by 7**1=7 but not divisible by 7**2=49).
 * 
 * Let g(x,y) be the product of f(y,p) for all p in prime(x).
 * For example:
 * g(30,70)=f(70,2)*f(70,3)*f(70,5)=2*1*5=10,
 * g(525,63)=f(63,3)*f(63,5)*f(63,7)=9*1*7=63.
 * 
 * You are given two integers x and n. Calculate g(x,1)*g(x,2)*…*g(x,n) mod
 * (1000000007).
 * 
 * (Read modulo exponentiation before attempting this problem)
 * Input
 * The only line contains integers x and n — the numbers used in formula.
 * 
 * Constraints
 * 2 ≤ x ≤ 1000000000
 * 1 ≤ n ≤ 1000000000000000000
 * Output
 * Print the answer corresponding to the input.
 * Example
 * Sample Input 1
 * 10 2
 * 
 * Sample Output 1
 * 2
 * 
 * Sample Input 2
 * 20190929 1605
 * 
 * Sample Output 2
 * 363165664
 * 
 * Explanation
 * In the first example, g(10,1)=f(1,2)⋅f(1,5)=1, g(10,2)=f(2,2)⋅f(2,5)=2.
 * 
 */
