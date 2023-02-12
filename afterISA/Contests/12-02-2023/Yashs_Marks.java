// package Contests.12-02-2023;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Yashs_Marks {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                int n = sc.nextInt();
                System.out.println((x / 10) * n);
            }
        }
    }
}

/*
 * Yash's Marks (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Yash has a class test. There's a question that is worth X points. Yash finds
 * that the question has 10 test cases for it. It is given that, every test case
 * carries the same number of points. N of the test cases are passed by Yash.
 * Find the marks he will get.
 * Input
 * The first line will contain T, the number of test cases. Then the test cases
 * follow. Each test case contains of a single line of input, two integers X and
 * N, the total points for the problem, and the number of test cases which pass
 * for Yash's solution.
 * 
 * Constraints
 * 1 ≤ T ≤ 100
 * 10 ≤ X ≤ 200
 * 0 ≤ N ≤ 10
 * X is a multiple of 10.
 * Output
 * For each test case, output the points scored by Yash.
 * Example
 * Sample Input :
 * 4
 * 10 3
 * 100 10
 * 130 4
 * 70 0
 * 
 * Sample Output :
 * 3
 * 100
 * 52
 * 0
 */