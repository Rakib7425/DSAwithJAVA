package DSA1_Modul;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Find_sum_of_all_elements {
    public static void calculateSum(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        // return sum;
        System.out.println(sum);
    }

    public static void main (String[] args) {
        // Your code here
        try(Scanner sc = new Scanner(System.in)){
            int row = sc.nextInt();
            int col = sc.nextInt();
            int arr [][] = new int[row][col];

            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            calculateSum(arr);
        }
    }
}

/**
 * Find sum of all elements (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
The task is to determine the sum of all elements of a 2- dimensional array of non- negative integers, of size n x m.
Input
The first line contains two Integers n and m, which is the number of rows and columns.
Then next n lines of input is there, where each line contains m integers separated by spaces, representing the elements of the corresponding row.

Constraints
1 ≤ n ≤ 100
1 ≤ m ≤ 100
0 ≤ a[i][j] ≤ 100
Output
Print the sum of all elements of the given array.
Example
Sample 1:
Input:
2 2
1 1
2 2
Output:
6
 */
