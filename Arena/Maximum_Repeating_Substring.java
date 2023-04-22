
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Maximum_Repeating_Substring {
    public static int maxKRepeating(String S, String W) {
        int maxK = S.length() / W.length();
        for (int k = maxK; k >= 1; k--) {
            if (S.contains(W.repeat(k))) {
                return k;
            }
        }
        return 0;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String W = sc.nextLine();
        System.out.println(maxKRepeating(S, W));
    }
}

/**
 * Maximum Repeating Substring
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
For a string S, a string W is k- repeating if W concatenated k times is a substring of S. The W's maximum k- repeating value is the highest value k where W is k- repeating in S. If W is not a substring of S, W's maximum k-repeating value is 0.
Given strings S and W , find the maximum k- repeating value of W in S.
Input
First line contains the string S.
Second line contains the string W.

Constraints:
1 <= S. length <= 500
1 <= W. length <= 500
S and W consists of lowercase English letters.
Output
Print the maximum value of k such that W is k - repeating in S.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
Sample Input 1:
ababc
ab

Output
2

Explanation:
"abab" is a substring in "ababc".

Sample Input 2:
ababc
ba

Output
1

Explanation
"ba" is a substring in "ababc". "baba" is not a substring in "ababc".
 */