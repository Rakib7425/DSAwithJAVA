
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Index_of_the_Element {

    public static int findAnss(int n, int arr[], int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            int ans = findAnss(n, arr, k);
            System.out.println(ans);

        }
    }
}

/*
 * Index of the Element
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * There is an array having unique elements is given as input. Find the index of
 * an element k if present in the array, else -1.
 * Input
 * There is an integer n is given(size of array nums).
 * In second line, n space seperated integers are given.
 * in third line, an integer k is given.
 * 1 <= n <= 105
 * 0 <= nums[i] <= 106
 * 0 <= i <= n-1
 * Output
 * Find the index of an element k if present in the array, else -1.
 * Example
 * Sample Input:
 * 5
 * 1 4 3 2 5
 * 3
 * 
 * Sample Output:
 * 2
 * 
 * Explanation: Index of element 3 is 2. So the answer will be 2.
 */