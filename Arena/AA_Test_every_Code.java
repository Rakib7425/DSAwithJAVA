import java.util.*;

public class AA_Test_every_Code {

    public static void modifyArray(int[] nums, int n) {
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
        n--;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            modifyArray(nums, n);
        }
    }
}

/*
 * Bob and Hammer
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Bob is at the origin of a number line. He wants to reach a goal at coordinate
 * X.
 * There is a wall at coordinate Y, which Bob cannot go beyond at first.
 * However, after picking up a hammer at coordinate Z, he can destroy that wall
 * and pass through.
 * Determine whether Bob can reach the goal. If he can, find the minimum total
 * distance he needs to travel to do so.
 * Input
 * The input is given from Standard Input in the following format:
 * 
 * X Y Z
 * 
 * Constraints
 * −1000≤X, Y, Z≤1000
 * X, Y, and Z are distinct, and none of them is 0.
 * All values in the input are integers.
 * Output
 * If Bob can reach the goal, print the minimum total distance he needs to
 * travel to do so. If he cannot, print -1 instead.
 * Example
 * Sample Input 1
 * 10 -10 1
 * Sample Output 1
 * 10
 * 
 * Sample Input 2
 * 20 10 -10
 * Sample Output 2
 * 40
 */