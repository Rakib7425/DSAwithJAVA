import java.util.Scanner;

public class Divisors_of_N {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int u = sc.nextInt();
               while (u > 0) {
                    int n = sc.nextInt();
                    int count = 0;
                    for (int x = 1; x <= Math.sqrt(n); x++) {

                         if (n % x == 0) {

                              if (x % 2 == 0) {
                                   count++;
                              }
                              if (x * x != n) {
                                   if ((n / x) % 2 == 0) {
                                        count++;
                                   }
                              }
                         }
                    }
                    System.out.println(count);
                    u--;
               }
          }
     }
}
