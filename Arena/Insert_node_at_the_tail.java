
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class Insert_node_at_the_tail {
// *****************Code Start****************
    public static Node addElement(Node head, int k) {
        // enter your code here
        Node newNode = new Node(k);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        return head;
    }
    // *****************Ends****************

}

/*
 * 
 * Insert node at the tail
 * asked in interviews by 1 company
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a singly linked list and an element K, your task is to insert the
 * element at the tail of the linked list.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function addElement() that takes head node and the
 * integer K as a parameter.
 * 
 * Constraints:
 * 1 <=N<= 1000
 * 1 <=K, value<= 1000
 * Output
 * Return the head of the modified linked list
 * Example
 * Sample Input:-
 * 5 2
 * 1 2 3 4 5
 * 
 * Sample Output:
 * 1 2 3 4 5 2
 */