
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Array_List_Implementation {
    public static void main(String[] args) {
        // Your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                arrayList.add(sc.nextInt());
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arrayList.get(i) + " ");
            }
        }
    }
}

/*
 * Array List Implementation
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Array List In Java
 * 
 * There are n integers are given.
 * 
 * Create an ArrayList
 * 
 * Add elements
 * 
 * Print the elements of arraylist.
 * 
 * Input
 * There is an integer n is given in first line of input.
 * In Second line, n space separated integer are given.
 * 
 * Constraints
 * 1 <= n <= 105
 * Output
 * Print the elements of arraylist.
 * Example
 * Sample Input:
 * 5
 * 1 2 3 4 5
 * 
 * Sample Output:
 * 1 2 3 4 5
 */