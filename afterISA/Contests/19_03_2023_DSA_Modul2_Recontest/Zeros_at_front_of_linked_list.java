/**
 * Zeros_at_front_of_linked_list
 */
public class Zeros_at_front_of_linked_list {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }
    // ******************************Code Start************************

    static public Node moveZeroes(Node head) {
        // Your code here
        Node temp = head.next;
        Node prev = head;
        while (temp != null) {
            if (temp.data == 0) {
                Node curr = temp;
                temp = temp.next;
                prev.next = temp;
                curr.next = head;
                head = curr;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
    // ******************************Code End*****************
}
/*
 * 
 * 
 * Zeros at front of linked list
 * medium
 * Problem Statement
 * Given a linked list, the task is to move all 0’s to the front of the linked
 * list. The order of all another element except 0 should be same after
 * rearrangement.
 * 
 * Note: Avoid use of any type of Java Collection frameworks.
 * 
 * Note: For custom input/output, enter the list in reverse order, and the
 * output will also be in reverse order.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function moveZeroes() that takes head node as
 * parameter.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 100000
 * 0<=Node.data<=100000
 * 
 * Note:- Sum of all test cases doesn't exceed 10^5
 * 
 * Output
 * Return the head of the modified linked list.
 * Example
 * Input:
 * 2
 * 10
 * 0 4 0 5 0 2 1 0 1 0
 * 7
 * 1 1 2 3 0 0 0
 * 
 * Output:
 * 0 0 0 0 0 4 5 2 1 1
 * 0 0 0 1 1 2 3
 * 
 * Explanation:
 * Testcase 1:
 * Original list was 0->4->0->5->0->2->1->0->1->0->NULL.
 * After processing list becomes 0->0->0->0->0->4->5->2->1->1->NULL.
 * 
 * Testcase 2:
 * Original list was 1->1->2->3->0->0->0->NULL.
 * After processing list becomes 0->0->0->1->1->2->3->NULL.
 */