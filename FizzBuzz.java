import java.util.Scanner;

public class FizzBuzz {
     public static void main(String[] args) {
          int N ;
          try (Scanner sc = new Scanner(System.in)) {
               N = sc.nextInt();
          }
          
          for(int i=1; i<=N; i++){
              if(i%15==0){
                  System.out.print("FizzBuzz ");
              }
              else if(i%5==0){
                System.out.print("Buzz ");
              }
            else if(i%3==0){
                System.out.print("Fizz ");

            }
            else{
                System.out.print(i + " ");
            }

          }
     }
}
