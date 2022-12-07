import java.util.Scanner;

public class Students_Gread {
     public static void main(String[] args) {
     
          try (Scanner sc = new Scanner (System.in)) {
               int Sub_1 = sc.nextInt();
               int Sub_2 = sc.nextInt();
               int Sub_3 = sc.nextInt();
               int Sub_4 = sc.nextInt();
               int Sub_5 = sc.nextInt();
               int Percentage = (Sub_1 + Sub_2 + Sub_3 + Sub_4 + Sub_5)/5 ;
               if(Percentage>= 80){
                   System.out.print('A');
               }else if (Percentage >= 60 && Percentage < 80){
                   System.out.print('B');
               }else if (Percentage >= 40 && Percentage < 60){
                   System.out.print('C');
               }else{
                   System.out.print('D');
               }
          }

     }
     
}
