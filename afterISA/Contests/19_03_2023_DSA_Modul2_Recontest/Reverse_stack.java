import java.util.Stack;

/**
 * Reverse_stack
 */
public class Reverse_stack {

    // *************************Code Start******************* */
    static Stack<Integer> St = new Stack<Integer>();

    static void Reverse_Stack() {
        // Enter your code here
        if (St.isEmpty()) {
            return;
        }
        int temp = St.pop();
        Reverse_Stack();
        insertAtBottom(temp);
    }

    static void insertAtBottom(int value) {
        if (St.isEmpty()) {
            St.push(value);
            return;
        }
        int temp = St.pop();
        insertAtBottom(value);
        St.push(temp);

    }
    // *************************Code End******************* */
    // ! Ignore All errors
}
/*
 * 
 * Reverse stack
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a stack containing some integers, your task is to reverse the given
 * stack.
 * 
 * Note:- Try to do this question using recursion, do not use any loop.
 * Input
 * User task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the functions Reverse_stack() that takes no parameter.
 * 
 * Constraints:
 * 1 <= Elements in stack <= 100
 * 
 * Custom Input:
 * First line of input should contain the number of elements N of the stack, the
 * next line of input should contain N space separated integers depicting the
 * elements of the stack.
 * Output
 * You don't need to return or print anything just complete the given function.
 * 
 * Note:- For the custom input if your code is correct then the elements will be
 * printed in the same order.
 * Example
 * Sample Input:-
 * Stack = {1, 2, 3, 4, 5}, where top = 5
 * 
 * Sample Output:-
 * Stack = {5, 4, 3, 2, 1} where top = 1
 * 
 */