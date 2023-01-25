

import java.util.*;

/**
 * Max_freq
 */
public class Max_freq {

     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
               int n = sc.nextInt();
               int[] arr = new int[n];
               for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    if (map.containsKey(a))
                         map.put(a, map.get(a) + 1);
                    else
                         map.put(a, 1);
               }
               int freq = 1;
               int maxKey = arr[0];
               for (HashMap.Entry<Integer, Integer> set : map.entrySet()) {
                    int val = set.getValue();
                    int key = set.getKey();
                    if (val > freq) {
                         freq = val;
                         maxKey = key;
                    } else if (val == freq) {
                         if (key > maxKey)
                              maxKey = key;
                    }
               }
               System.out.print(maxKey);
          }
     }
}

 /* Max freq
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers, give the number with maximum frequency. If multiple numbers have maximum frequency print the maximum number among them.
Input
The first line of the input contains an integer N, Second lines contains N space seperated integers of array.

Constraints
3 <= N <= 1000
1 <= Arr[i] <= 100
Output
The output should contain single integer, the number with maximum frequency.If multiple numbers have maximum frequency print the maximum number among them.
Example
Sample Input
5
1 4 2 4 5

Sample Output
4

Explanation:-4 has max frequency=2

*/

