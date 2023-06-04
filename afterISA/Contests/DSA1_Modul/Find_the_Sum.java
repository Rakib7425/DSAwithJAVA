package DSA1_Modul;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Find_the_Sum {
    public static void main (String[] args) {
        try (// Your code here
        Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();

            long sum = 0;
            for(int i = 1; i <= k; i++){
                if(i%2==0 || i%3==0 || i%7==0){
                    sum += i;
                }
            }
            System.out.print(sum);
        }
    }
}


/**
 * Find the Sum (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A positive number "k" is given to Newton. He needs to find the sum from 1 to "k" which is divisible by 2, 3, or 7. Help Newton to find the sum and return the same.
Input
The only line contains the positive number "k".

Constraints
1 ≤ k ≤ 50
Output
Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
 */