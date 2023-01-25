import java.util.*;

public class AA_Test_every_Code {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            sc.close();

            int count = 0;
            while (a < b) {
                a *= k;
                count++;
            }

            System.out.println(count);
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