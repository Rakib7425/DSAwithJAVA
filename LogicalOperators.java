import java.util.Scanner;

public class LogicalOperators {
     public static void main(String[] args) {
          int a , b ;
          boolean t= true, f= false ;
          try (Scanner sc = new Scanner (System.in)) {
               a = sc.nextInt();
               b = sc.nextInt();
          }
          if(a<=10 && b>=10){
          System.out.print(t);
          }
          else {
            System.out.print(f);
          }

          if(a%2==0 || b%2==0){
          System.out.print(" " + t);
          }
          else {
            System.out.print(" " + f);
          }
          if(a != b){
          System.out.print(" " + t);
          }
          else {
            System.out.print(" " + f);
          }    
     }
}
