import java.util.Scanner;

public class Non_zero_Values {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read n and m
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Initialize the counter
            int counter = 0;

            // Read the array elements and update the counter
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = sc.nextInt();
                    if (x != 0) {
                        counter++;
                    }
                }
            }

            // Print the counter
            System.out.println(counter);
        }
    }
}

/*
 * Non-zero values
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Print the number of values in the array that are NOT zeros for a n*m
 * dimensional array
 * Input
 * 1st line : space separated values for n and m
 * Next n lines: m space separated values
 * Output
 * Number of nonzero values in the array
 * Example
 * Input:
 * 3 3
 * 0 0 0
 * 0 0 1
 * 1 0 2
 * 
 * Output:
 * 3
 */