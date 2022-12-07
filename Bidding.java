import java.util.Scanner;

public class Bidding {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int T = sc.nextInt();
                  // int A=0,B=0,C = 0;

                  for(int i=0; i<T; i++){

                     int A = sc.nextInt();
                     int B = sc.nextInt();
                     int C = sc.nextInt();

                  if(A>B && A>C){
                      System.out.println("Alice");
                    }
                  else if(B>C && B>A){
                   System.out.println("Bob");
                    }
                  else if(C>A && C>B){
                      System.out.println("Charlie");
                    }

                  }
          }
     }
}
