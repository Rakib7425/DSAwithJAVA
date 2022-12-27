
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Bubble_Sort_Decresing_Order {
     public static void bubbleSort(int arr[], int n) {
          for (int i = 0; i < n - 1; i++) {
               boolean swaped = true;
               for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
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
          for (int j : arr) {
               System.out.print(j + " ");
          }

     }

     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               bubbleSort(arr, n);

          }
     }
}