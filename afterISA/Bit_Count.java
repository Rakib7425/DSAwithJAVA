
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Bit_Count {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            long i = sc.nextLong();

            System.out.println(Long.bitCount(i));
        }
    }
}

/*
 * Bit count
 * easy
 * asked in interviews by 1 company
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Negi is fascinated with the binary representation of the number. Tell him the
 * number of set bits (ones) in the binary representation of an integer N.
 * Input
 * The first line of the input contains single integer N.
 * 
 * Constraints
 * 1 <= N <= 1000000000000
 * Output
 * The output should contain a single integer, the number of set bits (ones) in
 * the binary representation of an integer N.
 * Example
 * Sample Input
 * 7
 * 
 * Sample Output
 * 3
 * 
 * Sample Input
 * 16
 * 
 * Sample Output
 * 1
 */