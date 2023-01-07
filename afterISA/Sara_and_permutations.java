// import java.util.Arrays;000000
import java.util.HashMap;
import java.util.Scanner;

public class Sara_and_permutations {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashMap <Integer, Integer> map =new HashMap<>();
            int arr[] = new int[n];
            for(int i=0; i<n ; i++){
                arr[i]  =sc.nextInt();
                map.put(arr[i], i);
            }
            int l=n,r=-1;
            for(int k=1; k<=n;k++){
                int ind =map.get(k);
                l=Math.min(l,ind);
                r=Math.max(r,ind);
                if(r-l+1 == k)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
        }
    }
}
    
    // public static void main(String[] args) {
    //     try (Scanner sc = new Scanner(System.in)) {
    //         int n = sc.nextInt();  // read in size of permutation
    //         int[] arr = new int[n];  // initialize array
    //         for (int i = 0; i < n; i++) {
    //             arr[i] = sc.nextInt();  // read in elements of permutation
    //         }
    //         for (int k = 1; k <= n; k++) {  // iterate through all possible values of k
    //             int start = 0;  // initialize start of subarray
    //             int end = k-1;  // initialize end of subarray
    //             boolean found = false;  // flag to track if permutation is found
    //             while (end < n) {  // iterate through array
    //                 int[] count = new int[k];  // initialize count array to 0
    //                 Arrays.fill(count, 0);
    //                 for (int i = start; i <= end; i++) {  // iterate through subarray
    //                     count[arr[i]-1] += 1;  // increment count for element
    //                 }
    //                 if (allOnes(count)) {  // if all counts are 1
    //                     found = true;  // permutation is found
    //                     break;  // move on to next value of k
    //                 }
    //                 start += 1;  // increment start of subarray
    //                 end += 1;  // increment end of subarray
    //             }
    //             if (found) {
    //                 System.out.print("1 ");  // print 1 if permutation is found
    //             } else {
    //                 System.out.print("0 ");  // print 0 if permutation is not found
    //             }
    //         }
    //     }
    // }

    // // helper function to check if all values in array are 1
    // public static boolean allOnes(int[] arr) {
    //     for (int x : arr) {
    //         if (x != 1) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

/*
 * Sara and permutations
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara loves problems on permutation but this time she stuck on a problem and asks for your help.
Given a permutation of N integers as Arr[], your task is to check for each K(1 <= K <= N) there exists a subarray of size K such that it is also a permutation of K integers.

Note:- A permutation of N integers is a sequence of size N where every element from 1- N are present.
Input
The first line of input contains a single integer N denoting the size of permutation, the next line of input contains N space separated integers depicting the permutaiton.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= N
Output
Print N space separated integers either 1 or 0. Print 1 if there exist a permutation K for the ith number else print 0.
Example
Sample Input:-
6
4 5 1 3 2 6

Sample Output:-
1 0 1 0 1 1

Explanation:-
for k=1 permutaion exist from [3, 3]
for k=2 no permutaion exists
for k=3 permutaion exist from [3, 5]
for k=4 no permutaion exists
for k=5 permutaion exist from [1, 5]
for k=6 permutaion exist from [1, 6]

Sample Input:-
6
6 5 4 3 2 1

Sample Output:-
1 1 1 1 1 1
 */