import java.util.*;

public class Subarray_with_Given_sum {
    public static void SubarrayWithGivenSum(int[] arr, int n, int s) {
        int start = 0, end = 0, currentSum = arr[0];
        while (end < n) {
            if (currentSum == s) {
                System.out.println((start + 1) + " " + (end + 1));
                return;
            } else if (currentSum > s) {
                currentSum -= arr[start++];
            } else {
                end++;
                if (end < n) {
                    currentSum += arr[end];
                }
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            SubarrayWithGivenSum(arr, n, s);
        }
    }

}

/*
 * Subarray with given sum
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an unsorted array A of size N of non-negative integers, find a
 * continuous sub-array which adds to a given number S.
 * Input
 * Each test case consists of two lines. The first line of each test case is N
 * and S, where N is the size of the array and S is the sum. The second line of
 * each test case contains N space-separated integers denoting the array
 * elements.
 * 
 * Constraints:-
 * 1 ≤ N ≤ 105
 * 1 ≤ Ai ≤ 105
 * Output
 * Print the starting and ending positions (1 indexing) of first such occurring
 * subarray from the left if sum equals to subarray, else print -1.
 * Example
 * Sample Input
 * 5 12
 * 1 2 3 7 5
 * 
 * Sample Output
 * 2 4
 * 
 * Explanation:
 * subarray starting from index 2 and ending at index 4 => {2 , 3 , 7}
 * sum = 2 + 3 + 7 = 12
 * 
 * Sample Input
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * 
 * Sample Output
 * 1 5
 */