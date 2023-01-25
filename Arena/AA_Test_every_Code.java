
// https://my.newtonschool.co/playground/code/z5342ll7jelc/
import java.util.*;

public class AA_Test_every_Code {
    public static void findWays(int[] A, int[] B, int n) {
        int sumA = 0, sumB = 0, missing = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != -1) {
                sumA += A[i];
            } else {
                missing++;
            }
            if (B[i] != -1) {
                sumB += B[i];
            } else {
                missing++;
            }
        }
        if (missing == 2) {
            System.out.println("Infinite");
        } else if (missing == 1) {
            if (sumA == sumB) {
                System.out.println("Infinite");
            } else {
                System.out.println("0");
            }
        } else {
            if (sumA == sumB) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arrA[] = new int[n];
            int arrB[] = new int[n];

            for (int i = 0; i < n; i++) {
                arrA[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arrB[i] = sc.nextInt();
            }

            findWays(arrA, arrB, n);
        }
    }
}