
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Find_Jth_Element_in_ith_row_of_a_Pascal_Triangle {

    public static ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> currow = new ArrayList<Integer>();

        currow.add(1);

        if (rowIndex == 0) {
            return currow;
        }

        ArrayList<Integer> prev = getRow(rowIndex - 1);

        for (int i = 1; i < prev.size(); i++) {
            int curr = (prev.get(i - 1) % 1000000007) + (prev.get(i) % 1000000007);
            currow.add(curr % 1000000007);
        }
        currow.add(1);

        // Return the row
        return currow;
    }

    // Driver Program
    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int limit = 500;
                ArrayList<Integer> arr = getRow(n);
                int j;
                for (j = 1; j <= limit - n; j++) {
                    arr.add(0);
                }

                System.out.println(arr.get(m) % 1_00_00_00_007);
            }
            // 1000000007
        }
    }
}

/*
 * Find jth element in ith row of a pascal triangle
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * In a pascal triangle starting from top to bottom. Find the value of the
 * element in a given row and column position i.e. ith row and at jth position.
 * 
 * Input
 * The first line of input contains an integer T denoting the number of test
 * cases. Each test case will have two integers indexes of the ith row and jth
 * column provided in the new line.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 0 <= j <= i <= 500
 * Output
 * Print the answer for each testcase in separated line. Since the output can be
 * very large, mod your output by 10^9+7.
 * Example
 * Input:
 * 2
 * 0 0
 * 2 1
 * 
 * Output:
 * 1
 * 2
 * Explanation: The Pascal Triangle has first value as 1. (0th row 0th element).
 * The pascal triangle has next set of values as 1 1. (1th row). On the next
 * level, pascal triangle has values 1 2 1. (2nd row). Its 1st element is 2. (0
 * based).
 */