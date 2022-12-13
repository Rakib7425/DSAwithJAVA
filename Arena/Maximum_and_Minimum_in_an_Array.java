import java.util.Scanner;

public class Maximum_and_Minimum_in_an_Array {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
               }

               // for (int elem : arr) {
               // System.out.print(arr[elem]);
               // }

               int max = arr[0];
               int min = arr[0];

               for (int i = 0; i < n; i++) {
                    if (arr[i] > max) {
                         max = arr[i];
                    }
                    if (arr[i] < min) {
                         min = arr[i];
                    }
               }
               System.out.print(max + " ");
               System.out.print(min);
          }
     }
}
