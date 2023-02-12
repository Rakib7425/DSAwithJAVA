
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
};

public class Binary_Linked_List {

// *****************Code Start****************
    static int decimalValue(Node head) {
        // Complete the code

        int result = 0;
        while (head != null) {
            result = (result << 1) | head.data;
            head = head.next;
        }
        return result;
    }

    // *********************Code Ends**********************
}
