
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Search_in_rotated_sorted_array {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (arr[i] == ans) {
                    System.out.println(1);
                    break;
                } else if (i == n - 1 && arr[i] != ans) {
                    System.out.println(0);

                }
            }
        }
    }
}
/*
 * Search in rotated sorted array
 * asked in interviews by 3 companies
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You have an array sorted in non- decreasing order and an element key. You
 * have to find whether the key is present inside your array or not.
 * Input
 * The first line contains a single element N(size of our array)
 * The next line contains N space- separated integer A[i].
 * The next line contains a single integer key.
 * Output
 * Determine whether the key is present in our array or not.
 * Example
 * Sample Input 1:
 * 8
 * 5 6 7 8 1 2 3 4
 * 7
 * 
 * Sample Output 1:
 * 1
 * 
 * Explanation:
 * 7 present at 3rd index.
 */