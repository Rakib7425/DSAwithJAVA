import java.util.Scanner;

class Maximum_Sum {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               int sum = 0;
               // int zero = 0;
               
               /*
               for (int k : arr) {
                    if (arr[k] > 0) {
                         sum = sum + arr[k];
                    }
               }
               */
               for (int k = 0; k < n; k++) {
                    if (arr[k] > 0) {
                         sum = sum + arr[k];
                    }
               }
               
               // if (sum > 0) {
               System.out.println(sum);
               // } else {
               // System.out.println("0");
               // }
          }
     }
}