/**
 * Print_Butterfly
 */
public class Print_Butterfly {

     public static void main(String[] args) {
          for (int i = -3; i <= 3; i++) {
               int num = 1;
               for (int j = 1; j <= 4 - Math.abs(i); j++) {
                    System.out.print(num);
                    num++;
               }
               for (int j = 1; j <= 2 * Math.abs(i); j++) {
                    System.out.print(" ");
               }
               int number = 1;
               for (int j = 1; j <= 4 - Math.abs(i); j++) {
                    System.out.print(number);
                    number++;
               }
               System.out.println(); 
          }
     }
}