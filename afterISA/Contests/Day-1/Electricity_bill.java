import java.util.Scanner;

// import javax.security.sasl.SaslException;

public class Electricity_bill {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {

               int units = sc.nextInt();

               double billToPay = 0;

               if (units < 50) {
                    billToPay = units * 0.50;
               } else if (units < 100) {
                    billToPay = 100 * 0.50 + (units - 50) * 2;
               } else if (units > 100) {
                    billToPay = 100 * 1.25 + (units - 100) * 2;
               } else if (units > 250) {
                    billToPay = 100 * 1.20 + 200 * 2 + (units - 250) * 3;
               }
               System.out.println(((billToPay)*20)/100);
          }
     }
}
