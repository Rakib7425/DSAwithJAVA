import java.util.Scanner;

public class Doctors_Clinic {
     public static void forLoop(int n) {
          for (int i = 1; i <= n; i++) {
               if (i%2==0) {
                    System.out.print("even ");
               }else{
                    System.out.print("odd ");
               }
          }
     }
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n =sc.nextInt();
               // System.out.print(forLoop(n));
               forLoop(n);
          }
     }
}
