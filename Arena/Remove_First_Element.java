// https://my.newtonschool.co/playground/code/a0jvuzrwxspp/

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Remove_First_Element {

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
 * 
 * Remove first element
 * asked in interviews by 2 companies
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Maruti is having an array nums having n integers in it. the first element of
 * the array is the leader of it but Maruti doesn't like that so he wants to
 * remove that element and make the second element as a leader.
 * Now print the elements of array nums modified by Maruti.
 * Input
 * There is an integer n that is given as input in the First line.
 * In the Second line, n space- separated integers of array nums are given.
 * 
 * Constraints
 * 1 ≤ n ≤ 105
 * 0 ≤ nums[i] ≤ 106
 * 0 ≤ i ≤ n-1
 * Output
 * Print the elements of the modified array nums.
 * Example
 * Sample Input:
 * 6
 * 1233 1324 545 23 656 76
 * Sample Output:
 * 1324 545 23 656 76
 */