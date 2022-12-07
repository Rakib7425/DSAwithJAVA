import java.util.Scanner;

public class Lucky_Number {
     static Scanner sc = new Scanner(System.in);

    public static int counter = sc.nextInt();

    // Returns 1 if n is a lucky no.
    // otherwise returns 0
    static boolean isLucky(int n)
    {
        if (counter > n)
            return true;
        if (n % counter == 0)
            return false;


        int next_position = n - (n / counter);
 
        counter++;
        return isLucky(next_position);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          int x = sc.nextInt();
          
             // Function call
             if (isLucky(x))
                 System.out.println("LUCKY");
             else
                 System.out.println("UNLUCKY");
     }

    }
}
