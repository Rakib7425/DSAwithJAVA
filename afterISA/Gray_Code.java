//import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework 

// don't change the name of this class
// you can add inner classes if needed
public class Gray_Code {
    public static int codeGrayCon(int n) {
        return n ^ (n >> 1);
    }

    public static void main(String[] args) {
        // Main Method is here
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                System.out.println(codeGrayCon(n));

            }

        }
    }
}