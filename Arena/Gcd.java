
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    // ? Method_One
    // static int gcd(int a, int b) {
    // if (b == 0){
    // return a;
    // }
    // if(a == 0 ){
    // return b;
    // }

    // return gcd(b, a % b);
    // }

    // ? Method_Two
    // static int gcd2(int a, int b){

    // if (a == 0)
    // return b;

    // if (a == b)
    // return a;

    // if (a > b)
    // return gcd2(a - b, b);
    // return gcd2(a, b - a);
    // }

    // ? Method_Three
    static long gcd3(long a, long b) {

        if (a == 0)
            return b;

        if (a == b)
            return a;

        if (a > b)
            return gcd3(a - b, b);
        return gcd3(a, b - a);
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            // int x = sc.nextInt(); // ** For FIRST and SECOND Method only
            // int y = sc.nextInt();

            // ? Method_Four
            // while (x != y) {
            // if (x > y) {
            // x = x - y;
            // } else {
            // y = y - x;
            // }
            // }
            // System.out.println(y); // ** Method_Four Only

            // System.out.println(gcd(x,y)); // ** For FIRST and SECOND Method only
            // System.out.println(gcd2(x,y));

            long n = sc.nextLong();
            long m = sc.nextLong();
            System.out.println(gcd3(n, m));

        }

    }
}

/*
 * 
 * GCD
 * asked in interviews by 4 companies
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given 2 non-negative integers m and n, find gcd(m, n)
 * GCD of 2 integers m and n is defined as the greatest integer g such that g is
 * a divisor of both m and n. Both m and n fit in a 32 bit signed integer.
 * 
 * NOTE: DO NOT USE LIBRARY FUNCTIONS
 * Input
 * Input contains two space separated integers, m and n
 * 
 * Constraints:-
 * 1 < = m, n < = 10^18
 * Output
 * Output the single integer denoting the gcd of the above integers.
 * Example
 * Sample Input:
 * 6 9
 * 
 * Sample Output:
 * 3
 * 
 * Sample Input:-
 * 5 6
 * 
 * Sample Output:-
 * 1
 */