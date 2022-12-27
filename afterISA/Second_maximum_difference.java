
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Second_maximum_difference {

     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               Arrays.sort(arr);

               int FirstElem = arr[0];
               int secondLastElem = arr[n - 2];

               int lastElem = arr[n - 1];
               int secondFirst = arr[1];

               int secondMaxDiffOne = secondLastElem - FirstElem;
               int secondMaxDiffTwo = lastElem - secondFirst;

               if (secondMaxDiffOne > secondMaxDiffTwo) {
                    System.out.print(secondMaxDiffOne);
               } else {
                    System.out.print(secondMaxDiffTwo);
               }

          }
     }
}