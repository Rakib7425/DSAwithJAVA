import java.util.Scanner;

public class Knight {
     static int Knightt(int X, int Y){
          //Ener your code here
          int res=0;
          if (X-1>=1 && Y-2>=1) res++;
          if (X-2>=1 && Y-1>=1) res++;
          if (X-2>=1 && Y+1<=8) res++;
          if (X-1>=1 && Y+2<=8) res++;
          if (X+1<=8 && Y-2>=1) res++;
          if (X+2<=8 && Y-1>=1) res++;
          if (X+2<=8 && Y+1<=8) res++;
          if (X+1<=8 && Y+2<=8) res++;
          return res;
          }
          public static void main(String[] args) {

               try (Scanner sc = new Scanner(System.in)) {
                    int A = sc.nextInt();
                    int B = sc.nextInt();

                    System.out.println(Knightt(A, B));
               } 

               // Knightt(5, 5);
          }
}
