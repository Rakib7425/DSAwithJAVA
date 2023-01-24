
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Easy_Sorting {
    public static void main(String[] args) {
        // Your code here
        
        try (Scanner sc = new Scanner(System.in)) {
            String[] words = new String[5];

            for (int i = 0; i < 5; i++) {
                // System.out.print("Enter a string of 2 characters: ");
                String input = sc.next();
                if (input.length() == 2) {
                    words[i] = input;
                } else {
                    // System.out.println("Invalid input, please enter a string of 2 characters");
                    i--;
                }
            }
            Arrays.sort(words);

            for (String w : words)
                System.out.print(w + " ");
        }

        // System.out.println(Arrays.toString(words));

    }
}

/*
 * 
 * Easy sorting
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * An array of 5 string is given where each string contains 2 characters, Now
 * you have to sort these strings, like in a dictionary.
 * Input
 * Input contains 5 strings of length 2 separated by spaces.
 * String contains only uppercase English letters.
 * Output
 * Print the sorted array.
 * Example
 * INPUT :
 * AS KF ER DD JK
 * 
 * OUTPUT :
 * AS DD ER JK KF
 */