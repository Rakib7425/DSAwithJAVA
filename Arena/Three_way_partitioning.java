import java.util.ArrayList;
import java.util.Collections;

/**
 * Three_way_partitioning
 */
public class Three_way_partitioning {


    // Code Starts from here
    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal) {
        // Your code here
        int i = 0, j = 0, k = A.size() - 1;
        while (j <= k) {
            if (A.get(j) < lowVal) {
                Collections.swap(A, i, j);
                i++;
                j++;
            } else if (A.get(j) > highVal) {
                Collections.swap(A, j, k);
                k--;
            } else {
                j++;
            }
        }
        return A;
    }
    // code Ends



}
// !OR
/*
 * 
public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal) {
    ArrayList<Integer> low = new ArrayList<Integer>();
    ArrayList<Integer> mid = new ArrayList<Integer>();
    ArrayList<Integer> high = new ArrayList<Integer>();
    for (int i = 0; i < A.size(); i++) {
        if (A.get(i) < lowVal) {
            low.add(A.get(i));
        } else if (A.get(i) > highVal) {
            high.add(A.get(i));
        } else {
            mid.add(A.get(i));
        }
    }
    low.addAll(mid);
    low.addAll(high);
    return low;
}

 */
/*
 * 
 ? Explanation 
 This code performs a three-way partition on an ArrayList of integers. It takes in an ArrayList of integers (A) and two values (lowVal and highVal). It then iterates through the list, swapping elements so that all elements less than lowVal are at the beginning of the list, all elements greater than highVal are at the end of the list, and all elements between lowVal and highVal are in the middle. At the end, it returns the modified ArrayList.
 */
 
 /*
 * 
 * Three way partitioning
 * Problem Statement
 * Given an array A[] and a range [a, b]. The task is to partition the array
 * around the range such that array is divided in three parts.
 * 1) All elements smaller than a come first.
 * 2) All elements in range a to b come next.
 * 3) All elements greater than b appear in the end.
 * The individual elements of three sets can appear in any order. You are
 * required to return the modified arranged array.
 * 
 * Note:- In case of custom input you will get 1 if your code is correct else
 * get a 0.
 * Input
 * User Task:
 * Since this is a functional problem you don't have to worry about the input.
 * You just have to complete the function threeWayPartition() which contains
 * following arguments.
 * 
 * A: input array list
 * low: starting integer of range
 * high: ending integer of range
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10000
 * 1 <= A[i] <= 100000
 * 1 <= low <= high <= 100000
 * 
 * Sum of N over all test case doesn't exceed 10^5
 * Output
 * For each test case return the modified array.
 * Example
 * Sample Input:
 * 2
 * 5
 * 1 8 3 3 4
 * 3 5
 * 3
 * 1 2 3
 * 1 3
 * 
 * Sample Output:
 * 1 3 3 4 8
 * 1 2 3
 * 
 * Explanation:
 * Testcase 1: First, array has elements less than or equal to 3. Then ,
 * elements between 3 and 5. And, finally elements greater than 5. So, one of
 * possible output is 1 3 3 4 8.
 * Testcase 2: First, array has elements less than or equal to 1. Then, elements
 * between 1 and 3. And, finally elements greater than 3. So, output is 1 2 3.
 */