import java.util.Scanner;

/**
 * mohitAndArray
 */
public class mohitAndArray {
     public static void main(String[] args) {

          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n - 1; i++) {
                    arr[i] = sc.nextInt();
               }
               
               int sum = n * (n + 1) / 2;
               int total = 0;
               for (int i = 0; i < n - 1; i++) {
                    total = total + arr[i];
               }
               int b = sum - total;

               System.out.println(b);
          }

     }
}
