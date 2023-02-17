import java.util.ArrayList;
import java.util.Collections;

public class Count_Frequency_of_Characters_in_List {
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c) {
        // Your code here
        clist.add(c);
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c) {
        // Your code here
        if (clist.contains(c)) {
            System.out.println(Collections.frequency(clist, c));
        } else {
            System.out.println("Not Present");
        }
    }
}

/*
 * Count Frequency of Characters in List
 * easy
 * asked in interviews by 15 companies
 * Problem Statement
 * Given an ArrayList of N lowercase characters. The task is to insert given
 * elements in the list and count frequency of elements present in the list.
 * 
 * You can use some inbuilt functions as:-
 * add() to append element in the list
 * contains() to check an element is present or not in the list
 * collections.frequency() to find the frequency of the element in the list.
 * Input
 * User Task:
 * Since this will be a functional problem. You don't have to take input. You
 * just have to complete the function insert() and freq() that takes the array
 * list and the character c as parameters.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 1000
 * 
 * c will be a lowercase english character
 * 
 * Output
 * You need to print the count of the character c if it is present else you need
 * to print "Not Present" all in a separate line in function freq().
 * Example
 * Sample Input:
 * 2
 * 6
 * i n i e i w i t i n f n
 * 4
 * i c i p i p f f
 * 
 * Sample Output:
 * 2
 * Not Present
 * 
 * Explanation:
 * Testcase 1: Inserting n, e, w, t, n into the list. Frequency of n is 2 in the
 * list.
 * Testcase 2: Inserting c, p, p into the list. Frequency of f is 0 in the list.
 */