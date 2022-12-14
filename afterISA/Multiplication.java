public class Multiplication {
     static int Multiply_by_recursion(int M, int N) {
          // Enter your code here
          if (N == 0)
               return 0;
          return M + Multiply_by_recursion(M, N - 1);
     }



     
     /////
     public static void main(String[] args) {
          System.out.println(Multiply_by_recursion(5, 6));
      
     }
}

/*
 * Multiplication
 * easy
 * Problem Statement
 * Given two numbers m and n, multiply them using only "addition" operations.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function Multiply() that takes the integer M and N
 * as a parameter.
 * 
 * Constraints:
 * 1 ≤ T ≤ 100
 * 0 ≤ M, N ≤ 100
 * Output
 * Return the product of N and M.
 * Example
 * Sample Input
 * 2
 * 2 3
 * 3 4
 * 
 * Sample Output
 * 6
 * 12
 */