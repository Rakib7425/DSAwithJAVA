
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Max_Product {
    class Main {
        public static void maxProduct(int arr[], int n) {

            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arr[i] > max1) {
                    max2 = max1;
                    max1 = arr[i];
                } else if (arr[i] > max2) {
                    max2 = arr[i];
                }
                if (arr[i] < min1) {
                    min2 = min1;
                    min1 = arr[i];
                } else if (arr[i] < min2) {
                    min2 = arr[i];
                }
            }
            int maxPdct1 = max1 * max2;
            int maxPdct2 = min1 * min2;

            int ans = Math.max(maxPdct1, maxPdct2);

            System.out.print(ans);

        }

        public static void main(String[] args) {
            // Your code here
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                int arr[] = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                maxProduct(arr, n);
            }
        }
    }
}

/*
 * int maxPct = Integer.MIN_VALUE;
 * for(int i=0; i<n-1; i++){
 * for(int j=i+1; j<n; j++){
 * int product = arr[i]* arr[j];
 * if(product > maxPct){
 * maxPct = product;
 * }
 * }
 * }
 * System.out.print(maxPct);
 */

/*
 * Max Product
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array of N integers, You have to find the maximum product of two
 * integers.
 * Input
 * The first line of input contains a single integer N. The next line of input
 * contains N space separated integers.
 * 
 * Constraints:-
 * 2 <= N <= 100000
 * -10000 <= Arr[i] <= 10000
 * Output
 * Print the maximum product of two elements.
 * Example
 * Sample Input:-
 * 5
 * -1 -2 3 4 -5
 * 
 * Sample Output:-
 * 12
 * 
 * Explanation:-
 * 4*3 = 12
 * 
 * Sample Input:-
 * 4
 * -1 -1 1 1
 * 
 * Sample Output:-
 * 1
 */