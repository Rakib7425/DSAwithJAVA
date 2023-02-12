import java.util.Scanner;

/**
 * Code_Analise
 */
public class Code_Analise {

     public static void main(String[] args) {
          try(Scanner sc = new Scanner(System.in)){
               int N = sc.nextInt();
          
               if(N<=1000){
                    System.out.println("Yes");
               }else{
                    System.out.println("No");
               }
          }
     }
}