
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Sum_Subarray {

     public static void main(String[] args) {

          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int k = sc.nextInt();

               int arr[] = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               
               int sum = 0;
               for (int i = 0; i < n; i++) {
                    for (int j = n - 1; j >= i; j--) {
                         if (arr[i] + arr[j] >= k) {
                              sum = arr[i] + arr[j];
                              break;
                         }

                    }
               }
               System.out.print(sum);
          }
     }
}