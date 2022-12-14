// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

/**
 * Help_Megha_Prime_Num
 */
public class Help_Megha_Prime_Num {
     // function to check if a given number is prime
    static boolean isPrime(int n) {
          // since 0 and 1 is not prime return false.
        if (n == 1 || n == 0){
               return false;
            }

          // Run a loop from 2 to n-1
        for (int i = 2; i*i <= n; i++) {
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
                int count = 0 ;
               // int N = 100;
               // check for every number from 1 to N
                // for (int t =0; t < T; t++){

                        for (int i = 1; i <= N; i++) {

                            // check if current number is prime
                            if (isPrime(i)) {
                                count++;
                                //  System.out.print(i + " ");
                            }
                            
                    }
                // }
                System.out.print(count);

            }

     }
}