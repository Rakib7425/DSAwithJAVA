import java.io.*;
import java.util.Scanner;

class AB_String {

     // Function to check divisibility
     static boolean checkIfDivisible(String str,
               long num) {

          // Calculate the number of digits in num
          long powerOf2 = (int) (Math.log(num) / Math.log(2));

          // Check if the length of
          // the string is less than
          // the powerOf2 then
          // return false
          if (str.length() < powerOf2)
               return false;

          // Check if the powerOf2 is 0
          // that means the given number
          // is 1 and as every number
          // is divisible by 1 so return true
          if (powerOf2 == 0)
               return true;

          // Find the number which is
          // formed by the last n digits
          // of the string where n=powerOf2
          long i, number = 0;
          int len = str.length();

          for (i = len - powerOf2; i < len; i++) {
               number += (str.charAt((int) i) - '0') *
                         Math.pow(10, powerOf2 - 1);
               powerOf2--;
          }

          // Check if the number formed is
          // divisible by input num or not
          if (number % num != 0)
               return false;
          else
               return true;
     }

     // Driver Code
     public static void main(String[] args) {

          // Input number
          try (Scanner sc = new Scanner(System.in)) {

               long num = sc.nextLong();
               String str = sc.next();

               // Function call
               if (checkIfDivisible(str, num))
                    System.out.print("NO");
               else
                    System.out.print("YES");
          }
     }
}