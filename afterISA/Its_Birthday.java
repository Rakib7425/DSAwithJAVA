
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Its_Birthday {

    public static void largestStringAfterRemoval(String str, int n, int k) {
        Deque<Character> deque = new LinkedList<>();

        int maxElementsAllowed = n - k;

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            while (!deque.isEmpty() && k > 0) { // do the removal based on condition
                if (deque.peekLast() < c) {
                    deque.removeLast();
                } else {
                    break;
                }
                k--;
            }
            if (deque.size() < maxElementsAllowed) {
                deque.addLast(c);
            }
        }

        String s = "";
        while (!deque.isEmpty()) {
            s = s + deque.removeFirst();
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Your code here

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String str = sc.next();
            int k = sc.nextInt();
            largestStringAfterRemoval(str, n, k);
        }
    }
}

/*
 * It's Birthday
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Bob has a string S of lowercase alphabets of size N. He want to gift this
 * string to Alice since today is her birthday. But Alice will accept the string
 * only when its length is N - K. So Bob will delete K characters from the
 * string. Bob want to gift the largest string obtained in Dictionary order to
 * Alice. Find that string.
 * In other terms, find the largest string in dictionary order that can be
 * obtained by deleting K characters from S. Given that K < |S|.
 * Input
 * First line contains an integer N - the length of string
 * The next line contains a string S
 * The last line contains an integer K denoting the number of characters to be
 * removed.
 * 
 * Constraints
 * 1<= N <= 10000
 * 0<= K < N
 * Output
 * Print a single line containing a string after deleting k characters and
 * fulfilling above conditions.
 * Example
 * Sample Input 1:
 * 10
 * helloworld
 * 3
 * 
 * Output
 * loworld
 * 
 * Explanation:
 * Deleting the character 'h', 'e', 'l' gives us the largest possible string.
 * 
 * Sample Input 2:
 * 5
 * india
 * 4
 * 
 * Output
 * n
 * 
 * Explanation:
 * Deleting the character 'i', 'd', 'i', 'a' gives us the largest possible
 * string.
 */