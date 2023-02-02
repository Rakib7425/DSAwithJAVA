
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Alternate_Sum_product {

    public static void Solve(int arr[], int n) {
        int odd = 1;
        int even = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                odd *= arr[i];
            } else if (i % 2 == 1) {
                even += arr[i];
            }
        }
        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solve(arr, n);
        }
    }
}