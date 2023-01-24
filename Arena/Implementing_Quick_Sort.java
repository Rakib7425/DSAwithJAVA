import java.util.Scanner;

public class Implementing_Quick_Sort {

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sort(arr, 0, n - 1);
            print(arr, n);
        }

    }

    /*
     * // Information about the arguments given in function
     * arr[]: input array
     * start: starting index of array
     * end: ending index of array
     */
    /**
     * Implementing_uick Sort
     */

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int[] quickSort(int arr[], int start, int end) {
        // Your code here
        // You can create your own helper function
        sort(arr, start, end);
        // ! print(arr, end);
        return arr;
    }

}



/*
 * Implementing Quick Sort
 * asked in interviews by 15 companies
 * Problem Statement
 * Given an array A[] having N positive integers. You need to arrange these
 * elements in increasing order using Quick Sort algorithm.
 * Input
 * User Task:
 * Since this is a functional problem you don't have to worry about the input.
 * You just have to complete the function quickSort() which contains following
 * arguments.
 * 
 * A[]: input array
 * start: starting index of array
 * end: ending index of array
 * 
 * Constraints
 * 1 <= T <= 1000
 * 1 <= N <= 10^4
 * 1 <= A[i] <= 10^5
 * 
 * Sum of "N" over all testcases does not exceed 10^5
 * Output
 * For each testcase you need to return the sorted array. The driver code will
 * do the rest.
 * Example
 * Sample Input:
 * 2
 * 3
 * 3 1 2
 * 3
 * 4 5 6
 * 
 * Sample Output:
 * 1 2 3
 * 4 5 6
 */