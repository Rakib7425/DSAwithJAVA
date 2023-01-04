
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Sum_Subarray {
     public static void bubbleSort(int arr[], int n) {
          for (int i = 0; i < n - 1; i++) {
               boolean swaped = true;
               for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                         int temp = arr[j + 1];
                         arr[j + 1] = arr[j];
                         arr[j] = temp;
                         swaped = false;
                    }
               }
               if (swaped) {
                    break;
               }
          }
          // for (int i = 0; i < n; i++) {
          // System.out.print(arr[i] + " ");
          // }
     }

     public static void main(String[] args) {
          
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int k = sc.nextInt();

               int arr[] = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               bubbleSort(arr, n);

               // for (int elem = 0; elem < n; elem++) {
               // System.out.print(arr[elem] + " ");
               // }

               int sum = 0;
               for (int i = 0; i < n; i++) {
                    for (int j = n - 1; j >= i; j--) {
                         if (arr[i] + arr[j] >= k) {
                              sum = arr[i] + arr[j];
                              break;
                         }

                         // if (sum >= k) {
                         //      System.out.println(arr[i] + " " + arr[j]);
                         // }
                    }
               }
               System.out.print(sum);
          }
     }
}