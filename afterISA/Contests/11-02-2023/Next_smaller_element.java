// package Contests.11-02-2023;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Next_smaller_element {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = n - 1; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() >= A[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    B[i] = -1;
                } else {
                    B[i] = stack.peek();
                }
                stack.push(A[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(B[i] + " ");
            }
        }
    }
}

/*
 * Next smaller element
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array A of size N. Another array B is defined as:
 * B[i] = A[j] such that j > i and A[j] < A[i]. If there does not exist any
 * index j satisfying the above conditions then B[i] = -1.
 * Find the array B.
 * Input
 * The first line contains an integer N.
 * The next line contains N space-separated integers denoting elements of the
 * array.
 * 
 * Constraints:
 * 1 ≤ N ≤ 105
 * 1 ≤ Ai ≤ 105
 * Output
 * Print N space separated integers denoting the elements of array B.
 * Example
 * Sample Input 1:
 * 4
 * 10 2 5 3
 * 
 * Output
 * 2 -1 3 -1
 * 
 * Explanation:
 * Next element smaller than 10 is 2.
 * There are no elements after 2 that are less than 2.
 * Next element smaller than 5 is 3.
 * There are no elements after 3.
 * 
 * Sample Input 2:
 * 2
 * 1 2
 * 
 * Output
 * -1 -1
 * 
 * Explanation:
 * There are no elements after 1 which is less than 1 and there are no elements
 * after 2.
 */