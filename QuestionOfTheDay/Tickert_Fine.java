import java.util.Scanner;

public class Tickert_Fine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Read the number of test cases
            int t = sc.nextInt();

            // Iterate over the test cases
            for (int i = 0; i < t; i++) {
                // Read the input values for this test case
                int x = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt();

                // Calculate the number of passengers without a ticket
                int noTicket = p - q;

                // Calculate the total fine collected
                int fine = noTicket * x;

                // Print the total fine collected
                System.out.println(fine);
            }
        }
    }
}

/*
 * Ticket Fine
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * On a certain train, Chef- the ticket collector, collects a fine of Rs. X if a
 * passenger is travelling without a ticket. It is known that a passenger
 * carries either a single ticket or no ticket.
 * P passengers are travelling and they have a total of Q tickets. Help Chef
 * calculate the total fine collected.
 * Input
 * The first line contains a single integer T, the number of test cases. T lines
 * follow. Each following line contains three integers separated by spaces,
 * whose description follows.
 * The first integer, X, is the fee in rupees.
 * The second integer, P, is the number of passengers on the train.
 * The third integer, Q, is the number of tickets Chef collected.
 * 
 * Constraints
 * 1 ≤ T ≤ 10
 * 1 ≤ X ≤ 10
 * 0 ≤ Q ≤ P ≤ 10
 * Output
 * The output must consist of T lines.
 * The ith line must contain a single integer, the total money(in rupees)
 * collected by Chef corresponding to the ith test case.
 * Example
 * Sample Input :
 * 4
 * 4 1 1
 * 2 10 7
 * 8 5 4
 * 9 7 0
 * Sample Output :
 * 0
 * 6
 * 8
 * 63
 * Explanation :
 * The total number of passengers travelling without ticket are 1 - 1 = 0. So
 * the total fine collected is 0.4 = 0 rupees.
 */