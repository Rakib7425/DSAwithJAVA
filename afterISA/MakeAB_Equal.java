import java.util.Scanner;

public class MakeAB_Equal {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arrA[] = new int[n];
               int arrB[] = new int[n];

               for (int i = 1; i < n; i++) {
                    arrA[i] = sc.nextInt();
               }
               for (int i = 1; i < n; i++) {
                    arrB[i] = sc.nextInt();
               }

               int x = 0;
               int y = 0;
               int z = 0;

               for (int i = 0; i < n; i++) {
                    if (arrA[i] == 1) {
                         x++;
                    }
               }
               for (int i = 0; i < n; i++) {
                    if (arrB[i] == 1) {
                         y++;
                    }
                    if (arrA[i] != arrB[i]) {
                         z++;
                    }
               }
               int ans = Math.min(z, Math.abs(x - y) + 1);
               System.out.println(ans);
          }
     }
}
