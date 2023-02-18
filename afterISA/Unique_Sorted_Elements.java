
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Unique_Sorted_Elements {
    public static void main(String[] args) {
        // Your code here
        TreeSet<Integer> treeSet = new TreeSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                treeSet.add(sc.nextInt());
            }

            for (Integer elem : treeSet) {
                System.out.print(elem + " ");
            }
        }
    }
}

/*
 * Unique Sorted Elements
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Array List In Java
 * 
 * There is a list, having n integers that may have duplicates, is given. Print
 * all unique elements in sorted order.
 * Input
 * There is an integer n is given in first line of input.
 * In Second line, n space separated integers are given.
 * 
 * Constraints
 * 1 <= n <= 104
 * Output
 * Print all unique elements in sorted order.
 * Example
 * Sample Input:
 * 7
 * 1 2 4 3 5 4 3
 * 
 * Sample Output:
 * 1 2 3 4 5
 */