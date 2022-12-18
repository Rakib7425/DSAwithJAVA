
// this program is for finding the count of each character
//importing the required packages
import java.io.*;
import java.util.*;

// A class CountOOfChar1 is created
public class Repeated_characters_and_their_count {
     static final int MAX_CHAR = 256;

     static void getOccuringChars(String st) {
          // an array was created with the size of 256 ( Ascii values)
          int counts[] = new int[MAX_CHAR];
          // a variable for finding the length of the String given as input
          int length = st.length();
          // the index value of the count array is initialized
          for (int i = 0; i < length; i++)
               counts[st.charAt(i)]++;
          // an array which has the size as the length of the String is created
          char cha[] = new char[st.length()];
          for (int i = 0; i < length; i++) {
               cha[i] = st.charAt(i);
               int finds = 0;
               for (int j = 0; j <= i; j++) {
                    // if the condition becomes true as the ame character is found
                    if (st.charAt(i) == cha[j])
                         finds++;
               }
               if (finds == 1)
                    // display the character count
                    System.out.println(st.charAt(i) + " " + counts[st.charAt(i)]);
          }
     }

     // main section of the program
     public static void main(String args[]) {
          try (Scanner sc = new Scanner(System.in)) {
               String n = sc.nextLine();
               // String st = "banana"; // a string
               String st = new String(n);
               // function calling
               getOccuringChars(st);
               
          }
     }
}

/*
 * // * Repeated_characters_and_their_count
 * //
 * //
 * 
 * Repeated characters and their count
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a string s of length n. Find all the repeating characters and count
 * their occurrence. A character is a repeating character if it occurs more than
 * once.
 * Input
 * First line contains n.
 * Next line contains the string s.
 * 
 * Constraints
 * 1 ≤ n ≤ 105
 * s contains only lowercase English letters.
 * Output
 * Print all the repeating characters and their frequency. Print in order from
 * 'a' to 'z'.
 * Example
 * Input:
 * 6
 * banana
 * 
 * Output:
 * a 3
 * n 2
 * 
 * Explanation :
 * b occurs only once.
 * 
 */