import java.util.*;

public class OddOrEven {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int num = sc.nextInt();
                  int retu=1;
                  if(num%2 == 0){
                      retu=0;
                  }
                  // System.out.println(retu);
                  switch(retu){
                      case 0:
                      System.out.println("Even");
                      break;
                      case 1:
                      System.out.println("Odd");
                      break;
                  }
          }
     }
}
