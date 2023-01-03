
//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Print_Squared_Sorted_Array {
     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {
               int T = sc.nextInt();
               while (T-- > 0) {
                    int n = sc.nextInt();
                    int arr[] = new int[n];

                    for (int i = 0; i < n; i++) {
                         arr[i] = sc.nextInt();
                    }

                    int ans[] = new int[n];

                    for (int j = 0; j < n; j++) {
                         ans[j] = arr[j] * arr[j];
                    }

                    Arrays.sort(ans);

                    for (int k = 0; k < n; k++) {
                         System.out.print(ans[k] + " ");
                    }
                    
                    System.out.println();
               }
          }
     }
}