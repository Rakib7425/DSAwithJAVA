
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Centered_mean {
     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               Arrays.sort(arr);

               int sum = 0;
               int count = 0;
               for (int i = 1; i < n - 1; i++) {
                    sum += arr[i];
                    // sum += arr[i];
                    count++;
               }
               System.out.println(sum / count);

          }
     }
}