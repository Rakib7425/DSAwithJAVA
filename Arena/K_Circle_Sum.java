/**
 * K_Circle_Sum
 */
public class K_Circle_Sum {


    public static void kCircleSum(int[] arr, int N, int K) {
        int[] result = new int[N];
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        result[0] = sum;
        for (int i = 1; i < N; i++) {
            sum = sum - arr[i - 1] + arr[(i + K - 1) % N];
            result[i] = sum;
        }
        
        for (int val : result) {
            System.out.print(val + " ");
        }
        // return result;
    }



}
/*
 * K Circle Sum
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * N numbers are arranged in Circle. Find the Sum of all K contiguous
 * Sub-arrays.
 * Input
 * The first line of the input contains an integer N, the length of the array,
 * and K. The next line contains N integers which are elements of the array.
 * 
 * User task: Since this is a functional problem you don't have to worry about
 * the input. You just have to complete the function kCircleSum(arr, N, K) which
 * contains arr(array) and N(size of the array), and K as a parameter
 * 
 * Constraints
 * 1 <= N <= 100000
 * 1 <= arr[I] <= 100000
 * 1 <= K <= N
 * Output
 * You need to print N space-separated integers ith integer denoting Sum of
 * sub-array of length K starting at index i.
 * Example
 * Sample Input
 * 3 1
 * 1 2 3
 * 
 * Sample Output
 * 1 2 3
 * 
 * Explanation : k=1 so ans is 1, 2, and 3.
 * 
 * Sample Input
 * 5 2
 * 6 4 3 4 1
 * 
 * Sample Output
 * 10 7 7 5 7
 * 
 */