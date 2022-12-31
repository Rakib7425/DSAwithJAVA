
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Orange_or_Chocolate_Candy_Contest {

     public static void main(String[] args) {
          // Your code here
          try (Scanner sc = new Scanner(System.in)) {
               int X = sc.nextInt();
               int Y = sc.nextInt();
               int A = sc.nextInt();
               int B = sc.nextInt();
               int C = sc.nextInt();

               int chocolate[] = new int[A];
               int orange[] = new int[B];
               int unknown[] = new int[C];
               int test[] = new int[X + Y];

               for (int i = 0; i < A; i++) {
                    chocolate[i] = sc.nextInt();
               }
               for (int i = 0; i < B; i++) {
                    orange[i] = sc.nextInt();
               }
               for (int i = 0; i < C; i++) {
                    unknown[i] = sc.nextInt();
               }
               Arrays.sort(chocolate);
               Arrays.sort(orange);
               Arrays.sort(unknown);
               Arrays.sort(test);

               int ptr = 0;
               for (ptr = 0; ptr < X; ptr++) {
                    test[ptr] = chocolate[A - 1 - ptr];
               }

               int ptr1 = 0;
               for (int i = ptr; i < (ptr + Y); i++) {
                    test[i] = orange[B - 1 - ptr1];
                    ptr1++;
               }
               Arrays.sort(test);

               long sum = 0l;

               int ptr2 = unknown.length - 1;
               int ptr3 = test.length - 1;
               for (int i = 0; i < (X + Y); i++) {
                    if (test[ptr3] > unknown[ptr2]) {
                         sum += test[ptr3];
                         ptr3--;
                    } else {
                         sum += unknown[ptr2];
                         ptr2--;
                    }
               }
               System.out.print(sum);
          }
     }
}

/*
 * Orange or Chocolate Candy? (Contest)
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Pino is super fond of candies. Today she has A chocolate candies, B orange
 * candies, and C unknown candies. You are also given the happiness she gets
 * after eating a particular candy.
 * She wants to have exactly X chocolate candies and Y orange candies. She can
 * transform an unknown candy to a candy of any type (chocolate or orange).
 * Find the maximum happiness she can attain.
 * Input
 * First line of input contains 5 integers X, Y, A, B, C.
 * Second line contains A integers corresponding to the happiness of the various
 * chocolate candies.
 * Third line contains B integers corresponding to the happiness of the various
 * orange candies.
 * Fourth line contains C integers corresponding to the happiness of the various
 * unknown candies.
 * 
 * Constraints
 * 1 <= A, B, C <= 100000
 * 1 <= X <= A
 * 1 <= Y <= B
 * 1 <= happiness of any candy <= 1000000000 (10^9)
 * Output
 * Output a single integer, the maximum happiness Pino can achieve by eating the
 * candies.
 * Example
 * Sample Input
 * 1 2 2 2 1
 * 2 4
 * 5 1
 * 3
 * 
 * Sample Output
 * 12
 * 
 * Explanation
 * Pino eats the 2nd chocolate candy (happiness=4), then eats the 1st orange
 * candy (happiness=4+5=9), then transforms the first unknown candy to orange
 * candy and eats it (happiness=9+3=12)
 * 
 * Sample Input
 * 2 2 2 2 2
 * 8 6
 * 9 1
 * 2 1
 * 
 * Sample Output
 * 25
 */