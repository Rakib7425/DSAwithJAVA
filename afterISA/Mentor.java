import java.util.*;

class Mentor {

     public static void main(String[] args) {

          try (Scanner sc = new Scanner(System.in)) {
               int rows = sc.nextInt();

               int column = sc.nextInt();

               int brr[][] = new int[rows][column];

               for (int i = 0; i < rows; i++) {

                    for (int j = 0; j < column; j++){

                         brr[i][j] = sc.nextInt();

                    }

                    // 1 [1 1 1]
                    // 0 [2 2 2]
                    //   0 1 2
               }

               for (int i = 0; i < rows; i++) {

                    for (int j = 0; j < column; j++){

                         System.out.print(brr[i][j] + " ");

                    }

                    System.out.println();

               }

               int sum = 0;

               for (int i = 0; i < rows; i++) {

                    for (int j = 0; j < column; j++){
                         sum = sum + brr[i][j];

                    }

               }

               System.out.println("sum" + sum);
          }

     }

}