import java.util.Scanner;

public class FiniteInput {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               while(true){
                  int a = sc.nextInt();
                  System.out.print(a+" ");
                  if(a == 0) break;
                  }
          }
     }
}
