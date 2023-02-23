
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Count_Frequencies {
    public static void main(String[] args) {
        // Your code here

        // create an ArrayList to store the input integers
        ArrayList<Integer> list = new ArrayList<>();

        // create a Scanner object to read the input from the user
        Scanner sc = new Scanner(System.in);

        // ask the user for the number of integers to be entered
        // System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        // ask the user to enter the integers
        // System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        // create a TreeMap to store unique elements as keys and their frequencies as
        // values
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // iterate over the ArrayList and update the TreeMap
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        // print the unique elements and their frequencies in sorted order
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // close the Scanner object
        sc.close();
    }
}