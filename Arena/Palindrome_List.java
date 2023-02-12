import java.util.*;

class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class Palindrome_List {

// *****************Code Start****************

    public static boolean IsPalindrome(Node head) {
        // enter your code here
        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the number of elements in the linked list is odd, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop();
            if (top != slow.val) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    // **************************Code Ends****************************
}

/*
 * 
 * Palindrome List
 * asked in interviews by 1 company
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a linked list consisting of N nodes, your task is to check if the given
 * list is palindrome or not.
 * 
 * A palindrome is a string/number that mirrors itself, for example, 21312
 * reverse is also 21312.
 * Input
 * User task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the functions Ispalindrome() that takes the head of the
 * linked list as parameter.
 * 
 * Constraints:-
 * 1<=N<=1000
 * 1<=Node.data<=1000
 * Output
 * Return true if given list is palindrome else return false.
 * Example
 * Sample Input 1:-
 * 5
 * 1 2 3 2 1
 * 
 * Sample Output 1:-
 * Yes
 * 
 * Sample Input 2:-
 * 3
 * 1 2 2
 * 
 * Sample Output 2:-
 * No
 */