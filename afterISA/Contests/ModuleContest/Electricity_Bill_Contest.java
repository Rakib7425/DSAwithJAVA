package Contests.ModuleContest;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Electricity_Bill_Contest {

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            double amount = 0;
            double sh = 0;

            double total = amount + sh;

            if (n < -50) {
                amount = n * 0.5;
            } else if (n <= 150) {
                amount = 25 + (n - 50) * 0.75;
            } else if (n <= 250) {
                amount = 100 + (n - 150) * 1.25;
            } else if (n > 250) {
                amount = 225 + (n - 250) * 1.50;
            }
            sh = amount * 0.2;
            total = amount + sh;
            System.out.printf("%.2f", total);
        }
    }
}


/*
 * Electricity Bill(Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Maruti is a Bill manager in Electricity department in his municipality. Being
 * a newbie he is not that much good in calculation. so as a good friend of
 * maruti calculate bill amount for giving electricity units counts.
 * Note:Per unit rate of eletricity is given down below.
 * For first 50 units Rs. 0.50/unit
 * For next 100 units Rs. 0.75/unit
 * For next 100 units Rs. 1.25/unit
 * For unit above 250 Rs. 1.50/unit
 * An additional surcharge of 20% is added to the bill.
 * 
 * You are given an integer n (count of electricity units), Return Total amout
 * that maruti has to pay.
 * Print answer up to 2 decimal places.
 * Input
 * There is an integer n (count of electricity units) is given as input.
 * 
 * Constraints
 * 1 ≤ n ≤ 105
 * Output
 * What is the Total amout that maruti has to pay.
 * Example
 * Sample Input:
 * 100
 * Sample Output:
 * 75.00
 * Explanation:
 * 
 * Bill Amount=0.5*50+0.75*50=25+37.5=62.5
 * Bill after 20% additional Charge=62.5+12.50=75.00
 */