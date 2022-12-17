import java.util.Scanner;

class Maximum_Sum {

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
               }

               int sum = 0;

               /*
                * for (int k : arr) {
                * if (arr[k] > 0) {
                * sum = sum + arr[k];
                * }
                * }
                */

               for (int k = 0; k < arr.length; k++) {
                    if (arr[k] >= 0) {
                         sum = sum + arr[k];
                    }
               }

               // if (sum > 0) {
               System.out.println(sum);
               // } else {
               // System.out.println("0");
               // }
          }
     }
}

/*
 * Maximum Sum
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Numbers are awesome, larger numbers are more awesome!
 * 
 * Given an array A of size N, you need to find the maximum sum that can be
 * obtained from the elements of the array (the selected elements need not be
 * contiguous). You may even decide to take no element to get a sum of 0.
 * Input
 * The first line of the input contains the number of test cases T.
 * 
 * For each test case, the first line of the input contains an integer N
 * denoting the number of elements in the array. The next line contains N
 * (white-space separated) integers.
 * 
 * 
 * Constraints
 * 1 <= N <= 10000
 * -10000000 <=A[i] <= 10000000
 * Output
 * For each test case, output one integer representing the maximum value of the
 * sum that can be obtained using the various elements of the array.
 * Example
 * Input 1:
 * 5
 * 1 2 1 -1 1
 * 
 * output-1
 * 5
 * 
 * input-2
 * 5
 * 0 0 -1 0 0
 * 
 * output-2
 * 0
 * 
 * input-3
 * 1
 * -1
 * 
 * Output:-3
 * 0
 * 
 * Explanation(might now be the optimal solution):
 * Testcase 1:
 * In order to maximize the sum among [ 1 2 1 -1 1], we need to only consider [
 * 1 2 1 1] and neglect the [-1].
 */