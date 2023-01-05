
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Sum_Subarray {
     // helper function to calculate sum of elements in array
     public static int sum(int[] arr, int start, int end) {
          int sum = 0;
          for (int i = start; i <= end; i++) {
               sum += arr[i];
          }
          return sum;
     }

     public static void main(String[] args) {

          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int k = sc.nextInt();

               int arr[] = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               int min_length = Integer.MAX_VALUE; // initialize minimum length to maximum integer value
               int start = 0; // initialize start of subarray
               int end = 0; // initialize end of subarray
               while (end < arr.length) { // iterate through array
                    if (sum(arr, start, end) >= k) { // if sum is greater than or equal to k
                         min_length = Math.min(min_length, end - start + 1); // update min length if necessary
                         start += 1; // increment start of subarray
                    } else {
                         end += 1; // increment end of subarray
                    }
               }

               System.out.println(min_length);

          }
     }
}
