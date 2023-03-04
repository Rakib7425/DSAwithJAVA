
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Minimum_Element_in_Sorted_and_Rotated_Array {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                int ans = arr[0];
                for (int i = 0; i < n; i++) {
                    if (arr[i] < ans) {
                        ans = arr[i];
                    }
                }
                System.out.println(ans);
            }
        }
    }
}

/*
 * Minimum Element in Sorted and Rotated Array
 * asked in interviews by 1 company
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Loki is one mischievous guy. He would always find different ways to make
 * things difficult for everyone. After spending hours sorting a coded array of
 * size N (in increasing order), you realise it’s been tampered with by none
 * other than Loki. Like a clock, he has moved the array thus tampering the
 * data. The task is to find the minimum element in it.
 * Input
 * The first line of input contains a single integer T denoting the number of
 * test cases. Then T test cases follow. Each test case consist of two lines.
 * The first line of each test case consists of an integer N, where N is the
 * size of array.
 * The second line of each test case contains N space separated integers
 * denoting array elements.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10^5
 * 1 <= A[i] <= 10^6
 * 
 * Sum of "N" over all testcases does not exceed 10^5
 * Output
 * Corresponding to each test case, in a new line, print the minimum element in
 * the array.
 * Example
 * Input:
 * 3
 * 10
 * 2 3 4 5 6 7 8 9 10 1
 * 5
 * 3 4 5 1 2
 * 8
 * 10 20 30 45 50 60 4 6
 * 
 * Output:
 * 1
 * 1
 * 4
 * 
 * Explanation:
 * Testcase 1: The array is rotated once anti-clockwise. So minium element is at
 * last index (n-1) which is 1.
 * Testcase 2: The array is rotated and the minimum element present is at index
 * (n-2) which is 1.
 * Testcase 3: The array is rotated and the minimum element present is 4.
 */