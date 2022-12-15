
/*
 * 
 * Help Megha
*easy
*Time Limit: 2 sec
*Memory Limit: 128000 kB
*Problem Statement
*In School Megha was given a homework to find the number of prime numbers before N (Including that number too), since Megha is weak in Maths she needs your help to do her homework.
*Input
*The first line of the input contains the number of testcases T,
*Next T lines contains the value N.
*
*Constraints
*1 <= T <= 1e5
*1 <= N <= 1e5
*Output
*Print the number of primes number before that number.
*Example
*Sample Input 1:
*2
*3
*11
*
*Sample Output 1:
*2
*5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;
// import java.util.StringTokenizer;

class Help_Megha_Prime_Num {

  static int[] booleanArray(int num) {
    boolean[] bool = new boolean[num + 1];
    int[] count = new int[num + 1];

    bool[0] = true;
    bool[1] = true;

    for (int i = 2; i * i <= num; i++) {
      if (bool[i] == false) {
        for (int j = i * i; j <= num; j += i)
          bool[j] = true;
      }
    }

    int counter = 0;
    for (int i = 1; i <= num; i++) {
      if (bool[i] == false) {
        counter = counter + 1;
        count[i] = counter;
      } else {
        count[i] = counter;
      }
    }

    return count;
  }

  public static void main(String[] args) throws IOException {
    InputStreamReader ak = new InputStreamReader(System.in);
    BufferedReader hk = new BufferedReader(ak);

    int[] v = booleanArray(100000);

    int t = Integer.parseInt(hk.readLine());

    for (int i = 1; i <= t; i++) {
      int a = Integer.parseInt(hk.readLine());
      System.out.println(v[a]);
    }
  }
}



/*

// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


//  * Help_Megha_Prime_Num
 
public class Help_Megha_Prime_Num {
  // function to check if a given number is prime
  static boolean isPrime(int n) {
    // since 0 and 1 is not prime return false.
    if (n == 1 || n == 0) {
      return false;
    }

    // Run a loop from 2 to n-1
    for (int i = 2; i * i <= n; i++) {
      // if the number is divisible by i, then n is not a prime number.
      if (n % i == 0)
        return false;
    }
    // otherwise, n is prime number.
    return true;
  }

  // Driver code
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // int T = sc.nextInt();
      int N = sc.nextInt();
      int count = 0;
      // int N = 100;
      // check for every number from 1 to N
      // for (int t =0; t < T; t++){

      for (int i = 1; i <= N; i++) {

        // check if current number is prime
        if (isPrime(i)) {
          count++;
          // System.out.print(i + " ");
        }

      }
      // }
      System.out.print(count);

    }

  }
}

*/