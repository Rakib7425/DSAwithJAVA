// package Contests.26-02-2023;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed

public class Simple_Paired_Sum {

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            // int t = sc.nextInt();

            // while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n / 2; i++) {
                System.out.print(arr[2 * i] + arr[2 * i + 1] + " ");
            }
            System.out.println();

            // }
        }
    }
}

/*
 * Simple Paired Sum
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array A of size N (N is always even), you need to find exactly (N/2)
 * numbers where each number represents the pair-wise sum of consecutive
 * elements of the array A.
 * 
 * In simple terms print (A[1]+A[2]), (A[3]+A[4]), ..., (A[N-1]+A[N]).
 * Input
 * The first line of the input contains the number of test cases T.
 * 
 * For each test case, the first line of the input contains an integer N(even
 * number) denoting the number of elements in the array. The next line contains
 * N (white-space separated) integers.
 * 
 * 
 * Constraints
 * 1 <= N <= 100
 * 1 <= A[I] <= 1000000000
 * Output
 * For each test case, output N/2 elements representing the pairwise sum of
 * adjacent elements in the array.
 * Example
 * Input:-1
 * 4
 * 1 2 6 4
 * 
 * output-1
 * 3 10
 * 
 * input-2
 * 10
 * 1 2 3 4 5 6 0 7 8 9
 * 
 * output-2
 * 3 7 11 7 17
 * 
 * Explanation(might now be the optimal solution):
 * Testcase 1:
 * Follow the below steps:-
 * Step 1: [1 2 6 4]
 * Step 2: (1 2) and (6 4)
 * Step 3: 3 10
 */