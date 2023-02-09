import java.util.Scanner;

public class Floor_in_a_Sorted_Array {

    public static int binarySearch(long arr[], int n, long x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long arr[] = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();
            int index = binarySearch(arr, n, x);
            if (index == -1)
                System.out.println(-1);
            else
                System.out.println(index);
        }
        sc.close();
    }
}

/*
 * Floor in a Sorted Array
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a sorted array arr[] of size N without duplicates, and given a value x.
 * Find the floor of x in given array. Floor of x is defined as the largest
 * element K in arr[] such that K is smaller than or equal to x.
 * 
 * Try to use binary search to solve this problem.
 * Input
 * First line of input contains number of testcases T. For each testcase, first
 * line of input contains number of elements in the array and element whose
 * floor is to be searched. Last line of input contains array elements.
 * 
 * Constraints:
 * 1 ≤ T ≤ 100
 * 1 ≤ N ≤ 10^5
 * 1 ≤ arr[i] ≤ 10^18
 * 0 ≤ X ≤ arr[n-1]
 * Output
 * Output the index of floor of x if exists, else print -1. Use 0-indexing
 * Example
 * Input:
 * 3
 * 7 0
 * 1 2 8 10 11 12 19
 * 7 5
 * 1 2 8 10 11 12 19
 * 7 10
 * 1 2 8 10 11 12 19
 * 
 * Output:
 * -1
 * 1
 * 3
 * 
 * Explanation:
 * Testcase 1: No element less than or equal to 0 is found. So output is "-1".
 * Testcase 2: Number less than or equal to 5 is 2, whose index is 1(0-based
 * indexing).
 * Testcase 3: Number less than or equal to 10 is 10 and its index is 3.
 */