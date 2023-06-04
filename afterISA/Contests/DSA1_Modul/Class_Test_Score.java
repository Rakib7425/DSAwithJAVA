// package DSA1_Modul;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Class_Test_Score {

  public static void main(String[] args) {
    // Your code here
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int gT35 = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] >= 35) {
          gT35++;
        }
      }
      System.out.print(gT35);
    }
  }
}


/**
 * Class Test Score (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Recently a class test was conducted, and the teacher wants to find the count of the number of students who have scored marks equal to or above 35 in a class. The marks of each student are stored in an array A.
Input
The first line of the input contains an integer N, denoting the size of an array.
The second line of the input contains N space-separated integers, denoting the marks of the students.

Constraints
1 ≤ N ≤ 100
1 ≤ A[i] ≤ 100
Output
Print in single line the total count of the number of students who scored marks above 35.
Example
Sample Input
5
14 15 98 100 34
Sample Output
2
Explanation
The number of students who scored marks above 35 are 2, i.e. marks: 98 and 100.
 */
