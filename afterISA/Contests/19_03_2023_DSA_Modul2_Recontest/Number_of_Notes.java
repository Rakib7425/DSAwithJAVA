
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Number_of_Notes {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int x = sc.nextInt();
                int notes[] = { 100, 50, 10, 5, 2, 1 };
                int count[] = new int[6];

                for (int i = 0; i < notes.length; i++) {
                    count[i] = x / notes[i];
                    x %= notes[i];
                }
                int totalNotes = 0;
                for (int i = 0; i < notes.length; i++) {
                    totalNotes += count[i];
                }

                System.out.println(totalNotes);

            }
        }
    }
}
/*
 * Number of Notes (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Smitha goes to a shop. She has notes of six denominations, i.e., $1, $2, $5,
 * $10, $50, and $100. The total bill will be $X. Write a program to compute the
 * smallest number of notes that will combine to give $X.
 * Input
 * The first line contains an integer T, the total number of test cases.
 * Then follow T lines, each line contains an integer X.
 * 
 * Constraints
 * 1 ≤ T ≤ 1000
 * 1 ≤ X ≤ 1000000
 * Output
 * For each test case, display the smallest number of notes that will combine to
 * give X, in a new line.
 * Example
 * Sample Input :
 * 3
 * 1200
 * 500
 * 242
 * Sample Output :
 * 12
 * 5
 * 7
 */