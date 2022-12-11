/**
 * Table
 */
import java.util.*;
// import java.io.*;

public class ArenaQ_01 {

     public static void main(String[] args) {
          int in; long l ; float fl; double d; char ch;

          try (Scanner sc = new Scanner(System.in)) {
               in = sc.nextInt();
               System.out.println(in);
               l = sc.nextLong();
               System.out.println(l);
               fl = sc.nextFloat();
               System.out.format("%.2f\n",fl);
               // System.out.println();
               d = sc.nextDouble();
               System.out.format("%.4f\n",d);
               // System.out.println();
               ch = sc.next().charAt(0);
          }

          System.out.println(ch);
}
    
}
