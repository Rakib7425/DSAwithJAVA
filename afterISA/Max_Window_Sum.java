
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Max_Window_Sum {

    // don't change the name of this class
    // you can add inner classes if needed

    public static void main(String[] args) {
        // Your code here

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Deque<Integer> deque = new ArrayDeque<>();

            long sum = 0;
            
            for (int i = 0; i < n; i++) {
                while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                    deque.poll();
                }
                while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                    deque.pollLast();
                }
                deque.offer(i);
                if (i >= k - 1) {
                    sum += arr[deque.peek()];
                }
            }

            System.out.println(sum);
        }
    }
}

/*
 * Max Widow Sum
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given an array of integers arr of size n, a window of size k. Your
 * task is to find the sum of the maximum element from each window.
 * Input
 * The first line contains the input of n, k ie the size of the array, and the
 * size of the window.
 * The next line contains the input of the array.
 * 
 * Constraints
 * 1 <= k < n <= 105
 * 1 <= arr[i] <= 105
 * Output
 * Print the single line containing the maximum sum.
 * Example
 * Sample Input 1:
 * 5 3
 * 1 2 3 4 5
 * 
 * Sample Output 1:
 * 12
 * 
 * Sample Input 2:
 * 6 2
 * 2 3 1 7 8 3
 * 
 * Sample Output 2:
 * 29
 */