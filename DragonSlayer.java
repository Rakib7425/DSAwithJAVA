// import java.util.Scanner;

public class DragonSlayer {
     static int DragonSlayerr(int A, int B, int C,int D){
          //Enter your code here
          int res=-1;
          while(A>0 || C>0){
              A=A-D;
              if(A<=0){
                  res =1;
                  break;
              }
              C=C-B;
              if(C<=0){
                  res= 0;
                  break;
              }
          }
          return res;
          
          }
     public static void main(String[] args) {
        
        DragonSlayerr(12, 12, 11, 11);
     }
}
