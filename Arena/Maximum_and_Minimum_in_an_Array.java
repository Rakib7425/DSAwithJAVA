import java.util.Scanner;

public class Maximum_and_Minimum_in_an_Array {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {

               int T=sc.nextInt();

               int n = sc.nextInt();
               int arr2[] = new int[n];
               int max = arr2[0];
               int min = arr2[0];

               while (T-->0) {
                int arr[] = new int[n];

                    for (int i = 0; i < arr.length; i++) {
                         arr[i] = sc.nextInt();
                    }

                    for (int i = 0; i < n; i++) {
                         max = Math.max(max, arr[i]);
                    }

                    for (int i = 0; i < n; i++) {
                         min = Math.min(max, arr[i]);
                    }
               }
               System.out.print(max + " ");
               System.out.print(min);
          }
     }
}
