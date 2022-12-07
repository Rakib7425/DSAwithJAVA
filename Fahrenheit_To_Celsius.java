import java.util.Scanner;

public class Fahrenheit_To_Celsius {
     
     static void farhrenheitToCelsius(int farhrenheit)
	{
          //  Given a temperature F in Farenheit, your task is to convert it into Celsius using the following equation:-
          // T(°c) = (T(°f) - 32)*5/9

		int C = ((farhrenheit-32)*5/9);
	     // return C;
        System.out.format("%d",C);
        
	}
     public static <farhrenheitToCelsius> void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int F = sc.nextInt();
           farhrenheitToCelsius(F);
          }

     }
}
