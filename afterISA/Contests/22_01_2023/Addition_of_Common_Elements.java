
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Addition_of_Common_Elements {
    public static void main(String[] args) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            int N1 = sc.nextInt();
            int N2 = sc.nextInt();

            for (int i = 0; i < N1; i++) {
                int n = sc.nextInt();
                set.add(n);
            }

            for (int i = 0; i < N2; i++) {
                int n = sc.nextInt();
                if (set.contains(n)) {
                    sum += n;
                    set.remove(n);
                }
            }
            System.out.println(sum);
        }
    }
}








/*
 * 
 * Addition of Common Elements
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Morgan was opening some boxes when she found one bearing a message “For
 * Morgan, Dad loves you 3000". She wants to open the box but she needs to solve
 * the question to open it. She asks Peter to do that. Help Peter and Morgan
 * solve the question so that they can see what's inside the box.
 * 
 * Given two arrays Arr1 and Arr2 of size N1 and N2. Your task is to find the
 * sum of all elements that are common to both arrays. If there are no common
 * elements the output would be 0.
 * 
 * Note: The arrays may contain duplicate elements. However, you need to sum
 * only unique elements that are common to both arrays.
 * Input
 * The first line of input contains N1 and N2 separated by a space. The second
 * line contains N1 space separated elements of Arr1. The third line contains N2
 * space separated elements of Arr2.
 * 
 * Constraints:
 * 1 <= N1, N2 <= 106
 * 1 <= Arr1[i], Arr2[i] <= 1000000000
 * Output
 * Print the sum of common elements.
 * Example
 * Sample Input:
 * 5 6
 * 1 2 3 4 5
 * 2 3 4 5 6 7
 * 
 * Sample Output:
 * 14
 * 
 * Explanation:- Common elements = 2, 3, 4 , 5
 * sum= 2 + 3 + 4 + 5 = 14
 * 
 * Sample Input:-
 * 3 3
 * 1 2 3
 * 4 5 6
 * 
 * Sample Output:-
 * 0
 */