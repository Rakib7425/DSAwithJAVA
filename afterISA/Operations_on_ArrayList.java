import java.util.ArrayList;
import java.util.Collections;

public class Operations_on_ArrayList {
    // Function to insert element into list

    public static void insert(ArrayList<Integer> list, int x) {
        // Your code here
        list.add(x);
    }

    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list) {
        // Your code here
        Collections.sort(list);
    }

    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val) {
        // Your code here

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                System.out.print(i + " ");
                return;
            }
        }
        System.out.print("-1 ");
    }

    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list) {
        // Your code here
        Collections.sort(list, Collections.reverseOrder());
    }
}

/*
 * Operations on ArrayList
 * easy
 * Problem Statement
 * Given an ArrayList of integers. The task is to perform operations on
 * ArrayList according to the queries and print output for the required queries.
 * 
 * Note: use Collections.sort() to sort the list in the natural order,
 * Collections.reverseOrder() to arrange the elements in reverse, get() to
 * return the element at the index of the list, linear search for finding a
 * specified element in the list. If multiple positions exist, print the
 * smallest one.
 * Input
 * User Task:
 * Since this is a functional problem, you don’t have to worry about the input,
 * you just have to complete the functions:-
 * insert() That takes the ArrayList and the integer to be inserted as a
 * parameter
 * IncOrder() That takes the ArrayList as a parameter.
 * Search()That takes the ArrayList and the integer to be found as a parameter.
 * DecOrder() That takes arraylist as a parameter.
 * 
 * Constraints:-
 * 1 < = N < = 1000
 * 1 < = Arr[i] < = 100000
 * Output
 * Print the index of element if found else print -1 in Search function add a
 * white-space after every output.
 * Example
 * Sample Input:-
 * 6
 * a 2 a 3 a 4 a 2 i s 2
 * 
 * Sample output:-
 * 0
 * 
 * Sample Input:-
 * 5
 * a 2 a 3 a 3 d s 5
 * 
 * Sample Output:-
 * -1
 * 
 * Explanation:
 * Testcase 1: After inserting elements, list is (2, 3, 4, 2) and arranging them
 * in ascending order, we have list as (2, 2, 3, 4). Now, serching for 2, first
 * occurence is at 0th index.
 * 
 * Testcase 2: After inserting elements, list is (2, 3, 3) and arranging them in
 * descending order, we have list as (3, 3, 2). Finding 5 gives -1, as 5 is not
 * present.
 */