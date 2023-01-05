
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Minimize_XOR {
    public static int minXor(int arr[], int n) {
        Arrays.sort(arr);
        int minXor = Integer.MAX_VALUE;
        int val = 0;
        for (int i = 0; i < n - 1; i++) {
            val = arr[i] ^ arr[i + 1];
            minXor = Math.min(minXor, val);
        }
        return minXor;
    }

    public static void main(String[] args) {
        // Main Method is here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(minXor(arr, n));
        }
    }
}