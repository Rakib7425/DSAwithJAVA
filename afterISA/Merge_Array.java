import java.util.Arrays;
import java.util.Scanner;

public class Merge_Array {

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int m = sc.nextInt();
               int a[] = new int[n];
               int b[] = new int[m];

               for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
               }

               for (int j = 0; j < m; j++) {
                    b[j] = sc.nextInt();
               }

               int res[] = new int[(n + m)];

               System.arraycopy(a, 0, res, 0, n);
               System.arraycopy(b, 0, res, n, m);

               Arrays.sort(res);

               for (int i = 0; i < res.length; i++) {
                    System.out.print(res[i] + " ");
               }
               // System.out.println(res);
          }
     }
}
