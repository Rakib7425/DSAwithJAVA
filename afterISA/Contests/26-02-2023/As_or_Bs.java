// package Contests.26-02-2023;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class As_or_Bs {

    // don't change the name of this class
    // you can add inner classes if needed
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            int maxLength = 0;
            int currLength = 0;
            for (char c : str.toCharArray()) {
                if (c == 'B') {
                    currLength = 0;
                } else {
                    currLength++;
                    maxLength = Math.max(maxLength, currLength);
                }
            }
            System.out.println(maxLength);
        }
    }
}

/*
 * As or Bs (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a string S consisting of characters 'A' or 'B' only, you need to find
 * the maximum length of substring consisting of character 'A' only.
 * Input
 * The first and the only line of input contains the string S.
 * 
 * Constraints
 * 1 <= |S| <= 100000
 * S consists of characters 'A' or 'B' only.
 * Output
 * Output a single integer, the answer to the problem.
 * Example
 * Sample Input
 * ABAAABBBAA
 * 
 * Sample Output
 * 3
 * 
 * Explanation: Substring from character 3-5 is the longest consisting of As
 * only.
 * 
 * Sample Input
 * AAAA
 * 
 * Sample Output
 * 4
 */