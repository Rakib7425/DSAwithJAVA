import java.util.Scanner;

public class Maximum_and_Minimum_in_an_Array {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {

               int T = sc.nextInt();

               // int arr2[] = new int[n];

               while (T > 0) {
                    int n = sc.nextInt();
                    int arr[] = new int[n];

                    for (int i = 0; i < arr.length; i++) {
                         arr[i] = sc.nextInt();
                    }
                    int max = arr[0];

                    for (int i = 1; i < arr.length; i++) {
                         max = Math.max(max, arr[i]);
                    }
                    System.out.print(max + " ");

                    int min = arr[0];
                    for (int i = 0; i < arr.length; i++) {
                         min = Math.min(min, arr[i]);
                    }

                    // System.out.print("\n");
                    System.out.print(min + " ");

                    T--;

                    System.out.print("\n");
               }
          }
     }
}
