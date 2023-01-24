// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Square_Root_Of_an_Integer {
     static int floorSqrt(int x) {

          if (x == 0 || x == 1)
               return x;

          int i = 1, result = 1;
          while (result <= x) {
               i++;
               result = i * i;
          }
          return i - 1;
     }

     public static void main(String[] args) {
          // Your code here
          try (Scanner sc = new Scanner(System.in)) {

               int n = sc.nextInt();
               for (int i = 0; i < n; i++) {
                    int x = sc.nextInt();
                    System.out.println(floorSqrt(x));

               }
          }

     }

}
