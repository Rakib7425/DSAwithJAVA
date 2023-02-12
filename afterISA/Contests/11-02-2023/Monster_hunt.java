// package Contests.11-02-2023;

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Monster_hunt {
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] h = new int[n];

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }

            int time = 0;

            while (h[k] > 0) {
                for (int i = 0; i < n; i++) {
                    if (h[i] > 0) {
                        h[i]--;
                        time++;
                    }
                    if (h[k] == 0) {
                        break;
                    }
                }
            }

            System.out.println(time);
        }
    }
}

/*
 * Monster hunt
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Sara is playing a game in which she is fighting with N monsters who are
 * standing in a line. Each monster has some HP with him. At every second, Sara
 * hits the monster standing at the front of the line. When the monster gets hit
 * his HP decreases by 1 and he goes to the end of the line(which happens
 * instantaneously).
 * 
 * For example:
 * if the monster's health are (1, 3, 2)
 * After 1st hit:- 3, 2 (monster at index 0 dies)
 * After 2nd hit:- 2, 2
 * After 3rd hit:- 2, 1
 * After 4th hit:- 1, 1
 * After 5th hit:- 1(monster who was originally at index 2 dies)
 * After 6th hit:- (monster who was originally at index 1 dies)
 * 
 * Now Sara who keeps track of the time wants to know the time when the Kth(0
 * indexing) monster dies(A monster dies when his HP hits 0).
 * Input
 * The first line of input contains two space separated integers depicting N and
 * K.
 * The next line contains N space separated integers depicting the HP of every
 * monster.
 * 
 * Constraints:-
 * 1 <= N <= 100
 * 0 <= K < N
 * 1 <= HP <= 100
 * Output
 * Print the time when the Kth monster dies.
 * Example
 * Sample Input:-
 * 3 2
 * 1 3 2
 * 
 * Sample Output:-
 * 5
 * 
 * Sample Input:-
 * 4 0
 * 5 1 1 1
 * 
 * Sample Output:-
 * 8
 */