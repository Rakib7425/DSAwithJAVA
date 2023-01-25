// https://my.newtonschool.co/playground/code/lv2f8serhjm7/

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Season_Of_Love {
    public static int numYellowRoses(int N) {
        return N / 3 + (N % 3 == 2 ? 1 : 0);
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int res = numYellowRoses(n);
            System.out.println(res);
        }
    }
}

/*
 * 
 * Season Of Love
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * In this season of love, everyone wants to surprise each other.
 * You are also super excited and you wish to buy roses of 3 different colors.
 * You always buy roses in order, white, yellow, red.
 * So if you buy 7 roses, they will be
 * "white, yellow, red, white, yellow, red, white".
 * 
 * You need to find the number of yellow roses that you will buy?
 * Input
 * The only line of input contains a single integer, N, the number of roses that
 * you will buy.
 * 
 * Constraints
 * 1 <= N <= 1000
 * Output
 * Output a single integer, the number of yellow roses.
 * Example
 * Sample Input 1
 * 2
 * 
 * Sample Output 1
 * 1
 * 
 * Sample Input 2
 * 8
 * 
 * Sample Ouput 2
 * 3
 * 
 * Explanation;-
 * testcase1;- 2 flower will be white,yellow
 * so number of yellow flower is 1
 */