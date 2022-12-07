import java.util.Scanner;

public class LuckyNumber {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
                   sc.nextLine();
                   String s = sc.nextLine();
               
                                                              
                  int s1 = 0;
                  for(int i = 0; i<n; i++){
                          s1+=Integer.parseInt(String.valueOf(s.charAt(i)));
                  }
                  int s2 = 0;
                  for(int i = n; i<s.length(); i++){
                  s2+=Integer.parseInt(String.valueOf(s.charAt(i)));
                  }
                  if (s1 == s2){
                          System.out.println("LUCKY");
                  }
                  else{
                          System.out.println("UNLUCKY");
                  }
                  
               } catch (NumberFormatException e) {
               e.printStackTrace();
          }

     }
}
