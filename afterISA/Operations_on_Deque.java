import java.util.*;

public class Operations_on_Deque {
    static void push_back_pb(Deque<Integer> dq, int x) {
        // Your code here
        dq.offerLast(x);
    }

    static void push_front_pf(Deque<Integer> dq, int x) {
        // Your code here
        dq.offerFirst(x);
    }

    static void pop_back_ppb(Deque<Integer> dq) {
        // Your code here
        if (!dq.isEmpty()) {
            dq.pollLast();
        }
    }

    static int front_dq(Deque<Integer> dq) {
        // Your code here
        if (!dq.isEmpty()) {
            return dq.peekFirst();
        } else {
            return -1;
        }
    }
}

/*
 * Operations on Deque
 * easy
 * Problem Statement
 * Given a Deque and Q queries. The task is to perform some operation on Deque
 * according to the queries as described in input:
 * 
 * Note:-if deque is empty than pop operation will do nothing, and -1 will be
 * printed as a front and rear element of queue if it is empty.
 * Input
 * User task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the functions:
 * push_front_pf():- that takes the deque and the integer to be added as a
 * parameter.
 * push_bac_pb():- that takes the deque and the integer to be added as a
 * parameter.
 * pop_back_ppb():- that takes the deque as parameter.
 * front_dq():- that takes the deque as parameter.
 * 
 * Constraints:
 * 1 <= N(Number of queries) <= 103
 * 
 * Custom Input:
 * First line of input should contain the number of queries Q. Next, Q lines
 * should contain any of the given operations:-
 * For push_front use pf x where x is the element to be added
 * For push_rear use pb x where x is the element to be added
 * For pop_back use pp_b
 * For Display Front use f
 * Moreover driver code will print
 * Front element of deque in each push_front opertion
 * Last element of deque in each push_back operation
 * Size of deque in each pop_back operation
 * Output
 * The front_dq() function will return the element at front of your deque in a
 * new line, if the deque is empty you just need to return -1 in the function.
 * Example
 * Sample Input:
 * 6
 * push_front 2
 * push_front 3
 * push_rear 5
 * display_front
 * pop_rear
 * display_front
 * 
 * Sample Output:
 * 3
 * 3
 */