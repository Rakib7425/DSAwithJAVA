// package Contests.26-02-2023;

public class Min_Max_Difference {
    class Solution {
        public int smallestRangeI(int[] A, int K) {
            // enter your code here
            int n = A.length;
            int mnVal = A[0];
            int mxVal = A[0];

            for (int i = 0; i < n; i++) {
                mnVal = Math.min(mnVal, A[i]);
                mxVal = Math.max(mxVal, A[i]);
            }

            int diff = mxVal - mnVal;

            if (diff <= 2 * K) {
                return 0;
            } else {
                return diff - 2 * K;
            }

        }
    }
}

/*
 * \Min Max Difference (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given an integer array A and an integer K.
 * In one operation, you can choose any index i where 0 ≤ i < A.length and
 * change A[i] to A[i] + x where x is an integer from the range [- K, K]. You
 * can apply this operation at most once for each index i. The score of A is the
 * difference between the maximum and minimum elements in A.
 * Return the minimum score of A after applying the mentioned operation at most
 * once for each index in it.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function smallestRangeI() that takes the array A
 * and integer K as a parameter.
 * 
 * Constarints
 * 1 ≤ A.length ≤ 103
 * 0 ≤ A[i] ≤ 104
 * 0 ≤ K ≤ 104
 * Output
 * Return the minimum score of A after applying the mentioned operation at most
 * once for each index in it.
 * Example
 * Sample input:
 * 3
 * 1 3 6
 * 3
 * 
 * Sample output:
 * 0
 * 
 * Explanation
 * Change A to be [4, 4, 4]. The score is max(A) - min(A) = 4 - 4 = 0.
 */