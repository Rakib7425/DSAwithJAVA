// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AB_String {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = Integer.parseInt(sc.next());
               String s = sc.next();

               int cnt = 0;
               int f = 0;
               for (int i = n - 1; i >= 0; i--) {
                    if (s.charAt(i) == 'A') {
                         if (cnt == 0) {
                              if (f == 0) {
                                   f = -1;
                                   break;
                              }
                         } else
                              cnt--;
                    } else {
                         cnt++;
                         f = 1;
                    }
               }
               if (f == -1 || cnt != 0) {
                    System.out.print("NO");
               } else
                    System.out.print("YES");
          }
          System.out.close();
     }
}

/*
 * 
 * ? AB strings
 * ? medium
 * ? Time Limit: 2 sec
 * ? Memory Limit: 128000 kB
 * ? Problem Statement
 * ? A string is called AB string if it's of length at least 2 and all it's
 * ? characters are A except the last character which is B.
 * ?
 * ? You have an empty string s, you can do the following operation any number
 * of
 * ? times.
 * ?
 * ? Choose any position of s and insert any AB string in that position.
 * ?
 * ? You are given a string t of some length containing only A and B. Find out
 * if
 * ? it is possible to convert s to t after some operations.
 * ? Input
 * ? First line contains N denoting the length of t.
 * ? Next line contains t.
 * ?
 * ? Constraints
 * ? 1 <= N <= 105
 * ? t contains only A and B.
 * ? Output
 * ? Output "YES" or "NO".
 * ? Example
 * ? Input:
 * ? 5
 * ? AAABB
 * ?
 * ? Output:
 * ? YES
 * ?
 * ? Explanation :
 * ? "" => "AAB" => "AA "AB" B" => "AAABB"
 * ?
 * ?
 * ? Input:
 * ? 3
 * ? ABB
 * ?
 * ? Output:
 * ? NO
 */

/*
 * // import java.io.*;
 * import java.util.Scanner;
 * 
 * class AB_String {
 * 
 * // Function to check divisibility
 * static boolean checkIfDivisible(String str,
 * long num) {
 * 
 * // Calculate the number of digits in num
 * long powerOf2 = (int) (Math.log(num) / Math.log(2));
 * 
 * // Check if the length of
 * // the string is less than
 * // the powerOf2 then
 * // return false
 * if (str.length() < powerOf2)
 * return false;
 * 
 * // Check if the powerOf2 is 0
 * // that means the given number
 * // is 1 and as every number
 * // is divisible by 1 so return true
 * if (powerOf2 == 0)
 * return true;
 * 
 * // Find the number which is
 * // formed by the last n digits
 * // of the string where n=powerOf2
 * long i, number = 0;
 * int len = str.length();
 * 
 * for (i = len - powerOf2; i < len; i++) {
 * number += (str.charAt((int) i) - '0') *
 * Math.pow(10, powerOf2 - 1);
 * powerOf2--;
 * }
 * 
 * // Check if the number formed is
 * // divisible by input num or not
 * if (number % num != 0)
 * return false;
 * else
 * return true;
 * }
 * 
 * // Driver Code
 * public static void main(String[] args) {
 * 
 * // Input number
 * try (Scanner sc = new Scanner(System.in)) {
 * 
 * long num = sc.nextLong();
 * String str = sc.next();
 * 
 * // Function call
 * if (checkIfDivisible(str, num))
 * System.out.print("NO");
 * else
 * System.out.print("YES");
 * }
 * }
 * }
 * 
 */