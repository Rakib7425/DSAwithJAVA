// package Contests.12-02-2023;

public class JEE_Marks {
    // ***********************START****************

    static int Marks(int P, int Q, int R) {
        // Enter your code here
        int final_marks = (P * 4) - (Q * 2) - (R * 1);
        return final_marks;

    }
    // ***********************END****************
}

/*
 * JEE Marks
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * In an exam of JEE one aspirant got P correct answers, Q wrong answer, and R
 * unattempted question. If the mark for the correct answer is 4, for the wrong
 * answer is -2, and for the unattempted questions is -1. Find the final marks
 * the aspirant got.
 * Input
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function Marks() that takes integer P, Q, and R as
 * arguments.
 * 
 * Constraints:-
 * 0 <= P, Q, R <= 1000
 * Output
 * Return the final marks of each student.
 * Example
 * Sample Input:-
 * 4 2 0
 * 
 * Sample Output:-
 * 12
 * 
 * Sample Input:-
 * 1 1 1
 * 
 * Sample Output:-
 * 1
 */