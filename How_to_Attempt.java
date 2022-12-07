import java.util.Scanner;

public class How_to_Attempt {

     static int Ludo(int input1){
          if (input1 == 1 || input1 ==6) {
               return 1;
          }
          else{
               return 0;
          }
     }
     
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int num = sc.nextInt();
               System.out.println(Ludo(num));
          
          }
     }
}
