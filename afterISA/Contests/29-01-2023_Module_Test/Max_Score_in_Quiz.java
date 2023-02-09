
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Max_Score_in_Quiz {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int temp = 0;
                for (int j = 0; j < m; j++) {
                    temp += arr[i][j];
                }
                ans = Math.max(ans, temp);

            }
            System.out.println(ans * 10);

        }
    }
}

/*
 * Max Score in Quiz (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Bob participated in N Quizzes. Each quiz consists of M questions. Given an N
 * X M matrix results where results[i][j] = 1 if Bob answered jth question
 * correctly in the ith Quiz.
 * 
 * Each correct answer gives 10 marks and he has the option to select any quiz
 * session for the marks evaluation.
 * 
 * What is the maximum marks Bob can get in a quiz?
 * Input
 * First line contains N and M.
 * Next N lines contain M integers each.
 * 
 * Constraints
 * 1 ≤ N, M ≤ 1000
 * results[i][j] = 0 or 1
 * Output
 * A single integer denotes maximum marks.
 * Example
 * Input:
 * 3 4
 * 0 0 1 0
 * 1 0 1 0
 * 1 0 1 1
 * 
 * Output:
 * 30
 * 
 * Explanation:
 * Bob should choose the 4th Quiz session for evaluation. He answered 3 question
 * correctly so his marks will be 30.
 */