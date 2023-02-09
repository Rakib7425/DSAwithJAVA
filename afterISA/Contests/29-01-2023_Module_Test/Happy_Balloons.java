
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Happy_Balloons {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long arr[] = new long[n];

            int cnt = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0 && arr[i - 1] % 2 != 0 || i % 2 == 0 && arr[i - 1] % 2 == 0) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}

/*
 * Happy Balloons (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * There are N balloons numbered from 1 to N. Every balloon has an another
 * integer value Arr[i] assigned to it where i varies from 1 to N, and i
 * represents the number of balloon.
 * 
 * A balloon at an odd position (i = 1, 3, 5. ) is happy if Arr[i] is odd.
 * A balloon at an even position (i = 2, 4, 6. ) is happy if Arr[i] is even.
 * 
 * Find the number of happy balloons.
 * Input
 * The first line of the input contains a single integer N.
 * The second line of the input contains N singly spaced integers, Arr[1],
 * Arr[2], Arr[3],. , Arr[N].
 * 
 * Constrains
 * 1 <= N <= 200000
 * 1 <= Arr[i] <= 1000000
 * Output
 * Output a single integer, the number of happy balloons.
 * Example
 * Sample Input
 * 5
 * 1 3 4 6 7
 * 
 * Sample Output
 * 3
 * 
 * Explanation
 * Happy balloons are balloons numbered 1, 4, 5.
 * 
 * Sample Input
 * 5
 * 1 2 3 4 5
 * 
 * Sample Output
 * 5
 */