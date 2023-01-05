import java.util.Arrays;
import java.util.Scanner;

public class Sara_and_permutations {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();  // read in size of permutation
            int[] arr = new int[n];  // initialize array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  // read in elements of permutation
            }
            for (int k = 1; k <= n; k++) {  // iterate through all possible values of k
                int start = 0;  // initialize start of subarray
                int end = k-1;  // initialize end of subarray
                boolean found = false;  // flag to track if permutation is found
                while (end < n) {  // iterate through array
                    int[] count = new int[k];  // initialize count array to 0
                    Arrays.fill(count, 0);
                    for (int i = start; i <= end; i++) {  // iterate through subarray
                        count[arr[i]-1] += 1;  // increment count for element
                    }
                    if (allOnes(count)) {  // if all counts are 1
                        found = true;  // permutation is found
                        break;  // move on to next value of k
                    }
                    start += 1;  // increment start of subarray
                    end += 1;  // increment end of subarray
                }
                if (found) {
                    System.out.print("1 ");  // print 1 if permutation is found
                } else {
                    System.out.print("0 ");  // print 0 if permutation is not found
                }
            }
        }
    }

    // helper function to check if all values in array are 1
    public static boolean allOnes(int[] arr) {
        for (int x : arr) {
            if (x != 1) {
                return false;
            }
        }
        return true;
    }
}
