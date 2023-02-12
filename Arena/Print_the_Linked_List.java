
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class Print_the_Linked_List {

// *****************Code Start****************

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " "); // + " -> "
            current = current.next;
        }
        // System.out.println("null");
    }
    // **************************Code Ends****************************
}


/*
 * 
 * Print the Linked List
 * Problem Statement
 * Given a linked list consisting of N nodes, your task is to traverse the list
 * and print its elements.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function printList() that takes head node of the
 * linked list as parameter.
 * 
 * Constraints:
 * 1 <=N <= 1000
 * 1 <=Node.data<= 1000
 * Output
 * For each testcase you need to print the elements of the linked list separated
 * by space. The driver code will take care of printing new line.
 * Example
 * Sample input
 * 5
 * 2 4 5 6 7
 * 
 * Sample output
 * 2 4 5 6 7
 * 
 * Sample Input
 * 4
 * 1 2 3 5
 * 
 * Sample output
 * 1 2 3 5
 */