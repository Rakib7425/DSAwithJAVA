//? package Contests.05-02-2023F; Rakib_RsM

public class Delete_even_nodes_from_the_list {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Code Starts From Here
    static Node deleteEven(Node head) {
        // Enter your code here

        if (head == null) {
            return head;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != head) {
            if (curr.data % 2 == 0) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        if (head.data % 2 == 0) {
            prev.next = head.next;
            head = prev.next;
        }
        return head;
    }

    // Code ends here
}

/*
 * Delete even nodes from the list
 * medium
 * Problem Statement
 * Given a circular singly linked list containing N nodes, the task is to delete
 * all the even nodes from the list.
 * 
 * Note:-The first digit of the list will always be an odd integer.
 * 
 * Note:Examples in Sample Input and Output just shows how a linked list will
 * look like depending on the questions. Do not copy-paste as it is in custom
 * input
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function deleteEven() that takes head node of
 * circular linked list as parameter.
 * 
 * Constraints:
 * 1 <=N <= 1000
 * 1 <= Node. data <= 1000
 * Output
 * Return the head of the modified list
 * Example
 * Sample Input:-
 * 4
 * 1 2 3 4
 * 
 * Sample Output:-
 * 1 3
 * 
 * Explanation:
 * 1- >2- >3- >4- >1
 * After deletion of nodes
 * 1- >3- >1
 * 
 * Sample Input:-
 * 5
 * 1 4 6 5 8
 * 
 * Sample Output:-
 * 1 5
 * 
 * Explanation:
 * 1- >4- >6- >5- >8->1
 * After deletion of nodes
 * 1->5->1
 */