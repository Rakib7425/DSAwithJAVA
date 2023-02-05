
public class Nth_node_from_end_of_linked_list {

    // information about the class Node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    // Code Starts From Here
    static int getNthFromLast(Node head, int n) {
        // Your code here
        Node first = head;
        Node second = head;
        for (int i = 0; i < n - 1; i++) {
            second = second.next;
            if (second == null) {
                return -1;
            }
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        return first.data;
    }

    // Code Ends
}

/*
 * Nth node from end of linked list
 * easy
 * hint
 * Hint
 * 
 * Problem Statement
 * Given a linked list consisting of L nodes and given a number N. The task is
 * to find the Nth node from the end of the linked list.
 * Input
 * First line of input contains number of testcase T. For each testcase, first
 * line of input contains number of nodes in the linked list L and the number N.
 * Next line contains N nodes of linked list.
 * 
 * User Task:
 * The task is to complete the function getNthFromLast() which takes two
 * arguments: reference to head and N and you need to return Nth from end.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= L <= 10^3
 * Output
 * For each testcase, output the data of node which is at Nth distance from end.
 * Example
 * Input:
 * 2
 * 9 2
 * 1 2 3 4 5 6 7 8 9
 * 4 5
 * 10 5 100 5
 * 
 * Output:
 * 8
 * -1
 * 
 * Explanation:
 * Testcase 1: In the first example, there are 9 nodes in linked list and we
 * need to find 2nd node from end. 2nd node from end os 8.
 * Testcase 2: In the second example, there are 4 nodes in linked list and we
 * need to find 5th from end. Since 'n' is more than number of nodes in linked
 * list, output is -1.
 */