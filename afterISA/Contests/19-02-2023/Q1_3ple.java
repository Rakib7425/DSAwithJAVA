// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Q1_3ple {
    public static void main (String[] args) {
        // Your code here
         try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();

            if( n%3 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}


/*
 * 3ple
easy
Time Limit: 1 sec
Memory Limit: 128000 kB
Problem Statement
You are given a positive integer N. Print "Yes" if N is a multiple of 3, otherwise, print "No".
Input
The input consists of a single integer N.

Constraints:
1 ≤ N ≤ 1000
Output
If N is a multiple of 3, print "Yes". Otherwise, print "No" (without the quotation marks). Note that the output is case-sensitive.
Example
Sample Input 1:
6

Sample Output 1:
Yes

Sample Input 2:
10

Sample Output 2:
No

(6 is a multiple of 3 (3*2==6) while 10 is not a multiple of 3)
 */