// package Contests.11-02-2023;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Height_Problem {

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                boolean found = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] < arr[i]) {
                        System.out.print(arr[j] + " ");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.print(-1 + " ");
                }
            }
        }
    }
}

/*
 * Height Problem
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * N people are standing in line numbered 1 to N from left to right. Each person
 * wants to know the height of the person to left of him having height less than
 * him. If there are multiple such people he wants to know the height of the
 * person closest to him.
 * If there is no such person report -1.
 * Input
 * The first line of input contains N, the size of the array.
 * The second line of input contains N space-separated integers.
 * 
 * Constraints
 * 2 ≤ N ≤ 100000
 * 0 ≤ Arr[i] ≤ 1000000000 (Height can be zero wierd people :p )
 * Output
 * The output should contain N space separated integers, the ith integer should
 * be the height reported to ith person (-1 if no person to the left is found
 * whose height is less).
 * Example
 * Sample Input 1
 * 5
 * 1 2 3 4 5
 * 
 * Sample Output 1
 * -1 1 2 3 4
 * 
 * Sample Input 2
 * 2
 * 1 1
 * 
 * Sample Output 2
 * -1 -1
 */