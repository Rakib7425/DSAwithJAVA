import java.util.HashMap;
import java.util.Scanner;

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