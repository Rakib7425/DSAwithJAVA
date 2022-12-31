
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Different_ways_to_add_parenthesis_2_Contest {

    public static Vector<Integer> gun(String str) {
        Vector<Integer> ret = new Vector<Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*') {
                String p1 = str.substring(0, i);
                String p2 = str.substring(i + 1);
                Vector<Integer> p1res = gun(p1);
                Vector<Integer> p2res = gun(p2);
                for (Integer ps : p1res) {
                    for (Integer pe : p2res) {
                        int c = 0;
                        switch (str.charAt(i)) {
                            case '+':
                                c = ps + pe;
                                break;
                            case '-':
                                c = ps - pe;
                                break;
                            case '*':
                                c = ps * pe;
                                break;
                        }
                        ret.add(c);
                    }
                }
            }
        }
        if (ret.size() == 0) {
            ret.add(Integer.valueOf(str));
        }
        return ret;
    }

    public static void main(String[] args) {
        // Your code here
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            Vector<Integer> ans = gun(str);
            Collections.sort(ans);

            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");

            }
        }

    }
}

/*
 * Different ways to add parenthesis-2(Contest)
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given a string expression of numbers and operators, print all
 * possible results from computing all the different possible ways to group
 * numbers and operators. You should print the answer in ascending order.
 * 
 * The test cases are generated such that the output values fit in a 32- bit
 * integer and the number of different results does not exceed 109.
 * Input
 * A string expression of numbers and operators.
 * 
 * Constraints:
 * 1 ≤ expression.length ≤ 20
 * Output
 * Print all possible results from computing all the different possible ways to
 * group numbers and operators in ascending order separated by space.
 * Example
 * Sample input:
 * 2*3-4*5
 * 
 * Sample Output:
 * -34 -14 -10 -10 10
 * 
 * Explanation:
 * The different ways of computation are:
 * (2*(3- (4*5))) = -34
 * ((2*3)- (4*5)) = -14
 * ((2*(3-4))*5) = -10
 * (2*((3-4)*5)) = -10
 * (((2*3)-4)*5) = 10
 */