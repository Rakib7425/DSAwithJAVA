
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Prefix_to_Infix {
    
    public static String convertToInfix(String expression) {
        Stack<String> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            // If the character is an operand, push it onto the stack
            if (Character.isDigit(c) || Character.isLetter(c)) {
                stack.push(c + "");
            } else {
                // Pop two operands from the stack
                String operand1 = stack.pop();
                String operand2 = stack.pop();

                // Concatenate the operands and the operator in infix notation
                String result = "(" + operand1 + c + operand2 + ")";

                // Push the result back onto the stack
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        // Your code here

        try (Scanner sc = new Scanner(System.in)) {
            String expression = sc.next();

            System.out.print(convertToInfix(expression));
        }
    }
}

/*
 * Prefix to Infix
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a Prefix expression, convert it into a Infix expression.
 * 
 * Infix : An expression is called the Infix expression if the operator appears
 * in between the operands in the expression. Simply of the form (operand1
 * operator operand2).
 * Example : (M+N) * (O-P)
 * 
 * Prefix : An expression is called the prefix expression if the operator
 * appears in the expression before the operands. Simply of the form (operator
 * operand1 operand2).
 * Example : *+MN-OP (Infix : (M+N) * (O-P) )
 * Input
 * Input contains a single string of prefix expression.
 * 
 * Constraints:
 * 1 < = string length < = 20
 * 
 * Note :- String will only contain uppercase english letters and maths operand
 * :- '/', '*', '+', '-'.
 * 
 * Output
 * Print the Infix expression.
 * Example
 * Sample Input
 * -A/BC-/AKL
 * 
 * Sample Output:
 * ((A-(B/C))*((A/K)-L))
 * 
 * Sample Input
 * +AB
 * 
 * Sample Output
 * A+B
 */