// package Contests.19-02-2023;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Same_Pair_Contest {
    public static void samePair(ArrayList<Integer> list, int n) {
        Map<Integer, Integer> frq = new TreeMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int k = list.get(i);

            if (frq.containsKey(k) == false) {
                frq.put(k, 1);
            } else {
                int value = frq.get(k);
                frq.put(k, value + 1);
            }
        }
        int All = 0;
        for (Integer kk : frq.keySet()) {
            int val = frq.get(kk);
            All += val * (val - 1) / 2;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = All - frq.get(list.get(i)) + 1;
            System.out.print(res + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            samePair(list, n);
        }
    }
}

/*
 * Same Pair (Contest)
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array Arr of N integers. Solve the following problem for X from 1 to
 * N :-
 * Find the number of ways to select a pair (i, j) such that i < j and i != X
 * and j != X and Arr[i] = Arr[j].
 * Input
 * First line of input contains a single integer, N.
 * Second line of input contains N space separated integers, denoting array Arr.
 * 
 * Constraints:
 * 1 <= N <= 100000
 * 1 <= Arr[i] <= N
 * Output
 * Print N space separated integers where ith integer is the answer when X = i.
 * Example
 * Sample Input
 * 5
 * 4 4 1 1 1
 * 
 * Sample Output
 * 3 3 2 2 2
 * 
 * Explanation:
 * For X=1 we have (3, 4) (3, 5) (4, 5)
 * For X=2 we have (3, 4) (3, 5) (4, 5)
 * For X=3 we have (1, 2) (4, 5)
 * For X=4 we have (1, 2) (3, 5)
 * For X=5 we have (1, 2) (3, 4)
 */