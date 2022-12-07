import java.util.Scanner;

public class LeapYear {
     public static void main(String[] args) {
          int N;
        try (Scanner sc = new Scanner(System.in)) {
          N= sc.nextInt();
     }
        if(( N%4 == 0  && N%100 != 0) || N%400 == 0 ){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
     }
}
