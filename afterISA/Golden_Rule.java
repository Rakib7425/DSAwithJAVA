// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Golden_Rule {

 
     static int count = 0;

     public static void mergeArr(int[] arr, int left, int mid, int right) {
          int n1 = mid - left + 1;
          int n2 = right - mid;
          int L[] = new int[n1];
          int R[] = new int[n2];
          for (int i = 0; i < n1; ++i) {
               L[i] = arr[left + i];

          }
          for (int j = 0; j < n2; ++j) {
               R[j] = arr[mid + 1 + j];
          }

          int i = 0, j = 0;
          int k = left;

          while (i < n1 && j < n2) {
               if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
               } else {
                    arr[k] = R[j];
                    count++;
                    j++;
               }
               k++;
          }
          while (i < n1) {
               arr[k] = L[i];
               i++;
               k++;

          }
          while (j < n2) {
               arr[k] = R[j];
               j++;
               k++;

          }
     }

     public static void mergeSort(int[] arr, int left, int right) {
          if (left < right) {
               int mid = left + (right - left) / 2;
               mergeSort(arr, left, mid);
               mergeSort(arr, mid + 1, right);
               mergeArr(arr, left, mid, right);
          }
     }

     public static void main(String[] args) {
          // Main Method is here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }

               mergeSort(arr, 0, arr.length - 1);

               for (int i : arr) {
                    System.out.print(i + " ");
               }
               System.out.print(count);

          }
     }
}


/*
//  Second Approach
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Golden_Rule {
     public static void findViolations(int[] arr, int n) {
          int count = 0;

          for (int i = 0; i < n; i++) {
               for (int j = 0; j < i; j++) {
                    if (arr[i] < arr[j]) {
                         count++;
                    }
               }
          }
          System.out.print(count);
     }

     public static void main(String[] args) {
          // Your code here
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int array[] = new int[n];
               for (int i = 0; i < n; i++) {
                    array[i] = sc.nextInt();
               }
               findViolations(array, n);
          }
     }
}
*/



/*
* ?Golden Rule
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Nishu loves to arrange things in order. Nishu sticks to his “Golden rule”
 * that every set of numbers must be in ascending order. Unfortunately, that is
 * not always the case. Nishu defines a “violation” as a situation when a
 * smaller number comes after a larger number in the set, which violates the
 * ascending order.
 * 
 * Given a set of integers, Nishu needs to find out the total number of such
 * violations.
 * Input
 * First line contain a single integer N.
 * Second line contain N space separated integer A[i].
 * Output
 * Print number of violation.
 * Example
 * Sample Input 1:
 * 5
 * 4 5 6 7 1
 * 
 * Sample Output 1:
 * 4
 * 
 * Explanation :
 * 4, 5, 6 and 7 are in order.
 * 1 comes after 4, 5, 6, 7 on the list, but is smaller than all 4 of them.
 * Hence 4 is the answer.
 * 
 * Sample Input 2:
 * 5
 * 5 4 3 2 1
 * 
 * Sample Output 2:
 * 10
 */