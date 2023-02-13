/**
 * Merge_two_sorted_linked_list
 */

 
// class Node {
//     Node next;
//     int val;

//     Node(int val) {
//         this.val = val;
//         next = null;
//     }
// }

public class Merge_two_sorted_linked_list {

    // below function is used to insert nodes in the linked list
    public static Node insert111(Node head, int val) {
        if (head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

    // Code Starts From here
    public static Node Merge(Node head1, Node head2) {
        // Enter your code here
        Node head = null;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head = insert111(head, head1.val);
                head1 = head1.next;
            } else {
                head = insert111(head, head2.val);
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            head = insert111(head, head1.val);
            head1 = head1.next;

        }

        while (head2 != null) {
            head = insert111(head, head2.val);
            head2 = head2.next;
        }
        return head;
    }
    // !Code Ends

}


/*
 * Merge two sorted linked list
easy
asked in interviews by 6 companies
Problem Statement
Given two sorted linked list of size s1 and s2(sizes may or may not be same), your task is to merge them such that resultant list is also sorted.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Merge() that takes head node of both the linked list as the parameter.

Constraints:
1 < = s1, s2 < = 1000
1 < = val < = 10000
Output
Return the head of the merged linked list, printing will be done by the driver code
Example
Sample Input:
5 6
1 2 3 4 5
3 4 6 8 9 10

Sample Output:
1 2 3 3 4 4 5 6 8 9 10
 */