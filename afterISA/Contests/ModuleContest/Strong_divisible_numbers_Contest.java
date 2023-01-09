package Contests.ModuleContest;

//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework 

// don't change the name of this class
// you can add inner classes if needed
class Strong_divisible_numbers_Contest {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int strongNum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 5 == 0 || i % 7 == 0) {
                    strongNum++;
                }
            }
            System.out.print(strongNum);

        }
    }
}

/*
 * Strong divisible numbers(Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * There is an integer N given as input. Count the all Strong numbers in between
 * 1 and n.
 * 
 * Note: Strong numbers are the number which are divisible by either 5 or 7.
 * Input
 * There is an integer n is given as input.
 * 
 * Constraints
 * 1 ≤ N ≤ 105
 * Output
 * Return count of all string numbers in range of 1 to n.
 * Example
 * Sample Input:
 * 10
 * 
 * Sample Output:
 * 3
 * 
 * Explanation :
 * In Range of 1 to 10 only 5,7 and 10 are strong numbers.
 */