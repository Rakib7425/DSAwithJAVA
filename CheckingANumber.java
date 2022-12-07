import java.util.Scanner;

public class CheckingANumber {
     public static void main(String[] args) {
          
     try (Scanner sc = new Scanner(System.in)) {
          int num = sc.nextInt();
          int retu=0;

             if(num < retu){
                 retu=1;
             }
             if(num > retu){
                 retu = 2;
             }
                 // System.out.println(retu);
             switch(retu){
                 case 0:
                 System.out.println("Zero");
                 break;

                 case 1:
                 System.out.println("Negative");
                 break;

                 case 2:
                 System.out.println("Positive");
                 break;

               }
     }
     }
}
