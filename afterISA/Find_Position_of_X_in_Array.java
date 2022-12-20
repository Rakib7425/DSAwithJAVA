import java.util.Scanner;

public class Find_Position_of_X_in_Array {

     public static int findElem(int[] arr, int x) {
          for (int i = 0; i < arr.length; i++) {
               if (i == x) {
                    // System.out.print(x + " ");
                    return x;
               }
               
          }
          return -1;

     }

     public static void main(String[] args) {
          try(Scanner sc = new Scanner(System.in)){
               
               int T = sc.nextInt();
               int N = sc.nextInt();
               int X  = sc.nextInt();
               int arr[] = new int[N];

               while (T-->0) {
                    
                    for (int i = 0; i < N; i++) {
                         arr[i]= sc.nextInt();
                         
                    }


                  int elem = findElem(arr,X); 
                  if (elem == -1) {
                       System.out.println("Not found");
                    }else{
                         System.out.println(elem + " ");
                    }
                    



               }


          }
     }

}
