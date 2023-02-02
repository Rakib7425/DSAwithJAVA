// Zeros at front of linked list
// https://my.newtonschool.co/playground/code/2iqqa5i8dlql/

public class Zeros_at_front__of_linked_list {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static public Node moveZeroes(Node head) {
        // Your code here
        Node zeroHead = null;
        Node zeroTail = null;
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (curr.data == 0) {
                if (zeroHead == null) {
                    zeroHead = curr;
                    zeroTail = curr;
                } else {
                    zeroTail.next = curr;
                    zeroTail = curr;
                }

                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    head = curr.next;
                }
            } else {
                prev = curr;
            }

            curr = curr.next;
        }

        if (zeroTail != null) {
            zeroTail.next = null;
        }

        if (zeroHead != null) {
            zeroTail.next = head;
            head = zeroHead;
        }

        return head;

    }
}
