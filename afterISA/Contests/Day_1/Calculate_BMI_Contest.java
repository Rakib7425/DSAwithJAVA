
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Calculate_BMI_Contest {

     public static void main(String[] args) {
          // Your code here

          try (Scanner sc = new Scanner(System.in)) {
               final double kilograms_per_pound = 0.45359237;
               final double meters_per_pound = 0.0254;

               double Weight = sc.nextDouble();
               double Height = sc.nextDouble();
               Weight = Weight * kilograms_per_pound;
               Height = Height * meters_per_pound;
               double BMI = Weight / Math.pow(Height, 2);
               // double BMI = Weight / (Height*Height);
               System.out.printf("%.2f", BMI);
          }

     }
}

/*
 * Calculate BMI(Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Maruti is a software engineer at Neton School. He is very passionate
 * regarding his Job due to that he always remains very Concious regarding his
 * health. So he checks his BMI(Body mask Index) Regulary and show that to the
 * doctor.
 * You are given the weight and height of maruti in Pound and Inches
 * respectively.
 * Calculate Maruti's BMI and Return it.
 * Note:Return BMI value of to two decimal places.
 * BMI=Weight(in kg)/Height(in meters)2
 * Input
 * There are two decimal values w, h (weight and height of maruti) are given as
 * input.
 * 
 * Constraints
 * 1 ≤ w, h ≤ 102
 * Output
 * Return BMI Value of maruti.
 * Example
 * Sample Input:
 * 72 45
 * Sample Output:
 * 25.00
 */