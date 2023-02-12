class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

public class Insert_node_at_the_head {

    
// ****************CODE START*******************

public static Node addElement(Node head, int k) {
    // enter your code here
    
    Node newNode = new Node(k);
    newNode.next = head;
    head = newNode;
    return head;
}
// ****************CODE END*******************

}

/*
 * 
 * Insert node at the head
 * asked in interviews by 1 company
 * Problem Statement
 * You are given a Singly linked list and an integer K. Your task is to insert
 * the integer K at the head of the given linked list
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function addElement() that takes head node and the
 * element K as a parameter.
 * 
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
 * 2 1 2 3 4 5
 */