
import java.util.*;

/**
 * Count_duplicates
 */
public class Count_duplicates {

     public static void main(String[] args) {
          try (Scanner inputTaker = new Scanner(System.in)) {
               int n = inputTaker.nextInt();
               int[] arr = new int[n];
               for (int i = 0; i < n; i++) {
                    arr[i] = inputTaker.nextInt();
               }
               HashMap<Integer, Integer> map = new HashMap<>();
               for (int i = 0; i < n; i++) {
                    if (map.containsKey(arr[i])) {
                         Integer prevCount = map.get(arr[i]);
                         map.put(arr[i], prevCount + 1);
                    } else {
                         map.put(arr[i], 1);
                    }
               }

               for (Integer number : map.keySet()) {
                    if (map.get(number) > 1) {
                         System.out.println(number + " " + map.get(number));
                    }
               }
          }
     }
}

/* 
Count duplicates
asked in interviews by 15 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N elements, your task is to find the count of repeated elements. Print the repeated elements in ascending order along with their frequency.
Have a look at the example for more understanding.
Input
The first line of input contains a single integer N, the next line of input contains N space- separated integers depicting the values of the array.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
For each duplicate element in sorted order in a new line, First, print the duplicate element and then print its number of occurence space- separated.

Note:- It is guaranteed that at least one duplicate element will exist in the given array.
Example
Sample Input:-
5
3 2 1 1 2

Sample Output:-
1 2
2 2

Sample Input:-
5
1 1 1 1 5

Sample Output:-
1 4

Explaination:
test 1: Only 1 and 2 are repeated. Both are repeated twice. So, we print:
1 -> frequency of 1
2 -> frequency of 2
1 is printed before 2 as it is smaller than 2
*/
