import java.util.Scanner;

public class Boundary_Traversal_of_Matrix {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int t = sc.nextInt();
               while (t-- > 0) {
                    int n1 = sc.nextInt();
                    int m1 = sc.nextInt();
                    int arr1[][] = new int[n1][m1];
                    for (int i = 0; i < n1; i++) {
                         for (int j = 0; j < m1; j++)

                              arr1[i][j] = sc.nextInt();

                    }

                    boundaryTraversal(n1, m1, arr1);
                    System.out.println();
               }
          }
     }

     static void boundaryTraversal(int n1, int m1, int arr1[][]) {
          // base cases
          if (n1 == 1) {
               int i = 0;
               while (i < m1)
                    System.out.print(arr1[0][i++] + " ");

          }

          else if (m1 == 1) {
               int i = 0;
               while (i < n1)
                    System.out.print(arr1[i++][0] + " ");
          } else {
               // traversing the first row
               for (int j = 0; j < m1; j++) {
                    System.out.print(arr1[0][j] + " ");
               }
               // traversing the last column
               for (int j = 1; j < n1; j++) {
                    System.out.print(arr1[j][m1 - 1] + " ");
               }
               // traversing the last row
               for (int j = m1 - 2; j >= 0; j--) {
                    System.out.print(arr1[n1 - 1][j] + " ");
               }
               // traversing the first column
               for (int j = n1 - 2; j >= 1; j--) {
                    System.out.print(arr1[j][0] + " ");

               }

          }
     }
}
