
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework 

// don't change the name of this class
// you can add inner classes if needed
class Find_Inverse {
    static int modularMultiplicativeInverse(int a, int m) {
        int t = 0, newt = 1;
        int r = m, newr = a;
        while (newr != 0) {
            int quotient = r / newr;
            int temp;
            temp = t;
            t = newt;
            newt = temp - quotient * newt;
            temp = r;
            r = newr;
            newr = temp - quotient * newr;
        }
        if (r > 1) {
            return -1;
        }
        if (t < 0) {
            t = t + m;
        }
        return t;

    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int m = sc.nextInt();
            int x = modularMultiplicativeInverse(a, m);
            if (x == -1) {
                System.out.println("No inverse");
            } else {
                System.out.println(x);
            }
        }
    }

}

/*
 * Find Inverse
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given two integers a and m find the Modular Multiplicative inverse of
 * 'a' under modulo 'm'.
 * Input
 * The first line of the argument contains two integers 'a' and 'm'.
 * 
 * Constraints
 * 1 <= a , m<= 1e5
 * Output
 * Print the Modular Multiplicative inverse of 'a' under modulo 'm'.
 * Example
 * Sample Input :
 * 3 11
 * 
 * Sample Output :
 * 4
 */