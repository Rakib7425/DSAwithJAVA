
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Return_two_prime_numbers {
     // don't change the name of this class
     // you can add inner classes if needed

     static boolean SieveOfEratosthenes(int n, boolean isPrime[]) {
          // Initialize all entries of boolean array as true.
          // A value in isPrime[i] will finally be false if i
          // is Not a prime, else true bool isPrime[n+1];
          isPrime[0] = isPrime[1] = false;
          for (int i = 2; i <= n; i++)
               isPrime[i] = true;

          for (int p = 2; p * p <= n; p++) {
               // If isPrime[p] is not changed, then it is a
               // prime
               if (isPrime[p] == true) {
                    // Update all multiples of p
                    for (int i = p * p; i <= n; i += p)
                         isPrime[i] = false;
               }
          }
          return false;
     }

     // Prints a prime pair with given sum
     static void findPrimePair(int n) {
          // Generating primes using Sieve
          boolean isPrime[] = new boolean[n + 1];
          SieveOfEratosthenes(n, isPrime);

          // Traversing all numbers to find first pair
          for (int i = 0; i < n; i++) {
               if (isPrime[i] && isPrime[n - i]) {
                    System.out.println(i + " " + (n - i));
                    return;
               }
          }
     }

     // Driver code
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int T = sc.nextInt();


               while(T-->0){
                    int n = sc.nextInt();
                    findPrimePair(n);
               }



          }
     }
}
