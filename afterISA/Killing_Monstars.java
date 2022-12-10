import java.util.Scanner;

public class Killing_Monstars {
     /**
      * @param args
      */
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               long[] a = new long[n + 1];

               for (int i = 0; i <= n; i++) {
                    a[i] = sc.nextLong();
               }

               long h = 0;
               long b;
               long d = 0;
               for (int i = 0; i <= n; i++) {
                    if (i != n) {
                         b = sc.nextLong();
                    } else {
                         b = 0;
                    }
                    if (h <= a[i]) {
                         d += h;
                         a[i] -= h;
                    } else {
                         d += a[i];
                         a[i] = 0;
                    }
                    if (b <= a[i]) {
                         d += b;
                         h = 0;
                    } else {
                         d += a[i];
                         h = b - a[i];
                    }
               }
               System.out.println(d);
          }
     }
}
