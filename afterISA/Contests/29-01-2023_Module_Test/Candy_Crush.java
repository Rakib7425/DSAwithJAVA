
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Candy_Crush {
    public static long calculate(long n) {
        if (n == 0) {
            return 0;
        } else {
            long grps = (n - 1) / 3 + 1;
            return grps * grps + calculate(n - grps);
        }
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();

            while (T-- > 0) {
                long n = sc.nextLong();
                long ans = calculate(n);
                System.out.println(ans);
            }

        }
    }
}

/*
 * Candy Crush
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * John has N candies. He wants to crush all of them. He feels that it would be
 * boring to crush the candies randomly, so he found a method to crush them. He
 * divides these candies into a minimum number of groups such that no group
 * contains more than 3 candies. He crushes one candy from each group. If there
 * are G groups in a single step, then the cost incurred in crushing a single
 * candy for that step is G dollars. After candy from each group is crushed, he
 * takes all the remaining candies and repeats the process until he has no
 * candies left. He hasn't started crushing yet, but he wants to know how much
 * the total cost would be incurred. Can you help him?
 * You have to answer Q-independent queries.
 * Input
 * The first line of input contains a single integer, Q denoting the number of
 * queries.
 * Next, Q lines contain a single integer N denoting the number of candies John
 * has.
 * 
 * Constraints
 * 1 <= Q <= 5 * 10^4
 * 1 <= N <= 10^9
 * Output
 * Print Q lines containing total cost incurred for each query.
 * Example
 * Sample Input 1:
 * 1
 * 4
 * 
 * Sample Output 1:
 * 6
 * 
 * Explanation:
 * Query 1: First step John divides the candies into two groups of 3 and 1 candy
 * respectively. Crushing one-one candy from both groups would cost him 2x2 = 4
 * dollars. He is now left with 2 candies. He divides it into one group. He
 * crushes one candy for 1 dollar. Now, he is left with 1 candy. He crushes the
 * last candy for 1 dollar. So, the total cost incurred is 4+1+1 = 6 dollars.
 */