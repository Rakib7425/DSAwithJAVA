
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework 

// don't change the name of this class
// you can add inner classes if needed
public class Number_of_characters_in_string {
    public static void main(String[] args) {
        // Main Method is here
        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(s.charAt(i));
            }
            System.out.println(set.size());

            // long totalCharacters = str.chars().filter(ch -> ch != ' ' && ch != 'a').count();
            // System.out.print(totalCharacters);
        }
    }
}

/*
 * 
 * Number of characters in string
 * easy
 * asked in interviews by 1 company
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a string s of length n, print the number of unique characters in the
 * string.
 * Input
 * First line contains n.
 * Next line contains a string s.
 * 
 * Constraints
 * 1 ≤ n ≤ 105
 * s contains only lowercase English letters.
 * Output
 * A single integer denoting the answer.
 * Example
 * Input:
 * 7
 * amazing
 * 
 * Output:
 * 6
 * 
 * Explanation :
 * {a, m, z, i, n, g}
 */