// package 19_03_2023_DSA_Modul2_Recontest;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Multiple_of_6 {

    // Helper function to swap two digits in a string
    private static String swapDigits(String num, int i, int j) {
        char[] chars = num.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String num = sc.nextLine();
            boolean canBeDivisibleBy6 = false;

            // Check if the sum of digits is divisible by 3
            int sum = 0;
            for (int i = 0; i < num.length(); i++) {
                sum += (num.charAt(i) - '0');
            }
            if (sum % 3 == 0) {
                // Check if the number ends with an even digit
                if ((num.charAt(num.length() - 1) - '0') % 2 == 0) {
                    canBeDivisibleBy6 = true;
                } else {
                    // Check if there is at least one even digit that can be swapped with an odd
                    // digit
                    for (int i = 0; i < num.length() - 1; i++) {
                        if ((num.charAt(i) - '0') % 2 == 0) {
                            // Swap the even digit with an odd digit and check if the resulting number is
                            // divisible by 3
                            for (int j = i + 1; j < num.length(); j++) {
                                if ((num.charAt(j) - '0') % 2 != 0) {
                                    String swappedNum = swapDigits(num, i, j);
                                    int newSum = 0;
                                    for (int k = 0; k < swappedNum.length(); k++) {
                                        newSum += (swappedNum.charAt(k) - '0');
                                    }
                                    if (newSum % 3 == 0) {
                                        canBeDivisibleBy6 = true;
                                        break;
                                    }
                                }
                            }
                            if (canBeDivisibleBy6) {
                                break;
                            }
                        }
                    }
                }
            }

            if (canBeDivisibleBy6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

/*
 * 
 * Multiple of 6
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given an integer N. You can do the following operation on it at most
 * once:
 * You can swap any two digits of this number
 * . FInd whether you can make integer N a multiple of 6 after applying this
 * operation at most once.
 * Input
 * First and the only line of the input contains the integer N.
 * 
 * Constraints:
 * 1 <= N <= 10100000
 * Output
 * Print "YES" if you can make integer N a multiple of 6 after applying this
 * operation at most once, else print "NO", without the quotes.
 * Example
 * Sample Input:
 * 123
 * 
 * Sample Output:
 * YES
 * 
 * Explaination:
 * We can swap the 2nd and the 3rd digits to make N = 132 which is perfectly
 * divisible by 6.
 */