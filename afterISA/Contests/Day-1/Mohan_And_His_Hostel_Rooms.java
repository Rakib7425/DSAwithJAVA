// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Mohan_And_His_Hostel_Rooms {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();

            while (T-- > 0) {
                int rollNo = sc.nextInt();
                char gen = sc.next().charAt(0);
                char boy = 'B';
                char girl = 'G';
                if (rollNo % 2 == 0 && gen == boy) {
                    System.out.println("PAPUM L");
                } else if (rollNo % 2 != 0 && gen == boy) {
                    System.out.println("LOHIT L");
                } else if (rollNo % 2 != 0 && gen == girl) {
                    System.out.println("LOHIT U");
                } else if (rollNo % 2 == 0 && gen == girl) {
                    System.out.println("PAPUM U");
                }
            }
        }
    }
}

/*
 * MOHAN AND HIS HOSTEL ROOMS
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Mohan was so excited to visit his college NIT Arunachal Pradesh campus after
 * COVID along with his friends Shreya and Anuj. The Warden allocated the hostel
 * room for him but he was curious to know about the fact that how students are
 * getting rooms.
 * The warden told him that those students whose roll no are divisible by 2 they
 * will get PAPUM HOSTEL and if it odd then they will get LOHIT HOSTEL. If the
 * student is girl, then she will get ‘Upper Wing’ otherwise ‘Lower Wing’.
 * Input
 * The first line of input will contain a single integer t denoting the no. of
 * test cases
 * Each test case contains only one line containing two space separated inputs R
 * for Roll No and S
 * for denoting Sex ‘B’ for boy and ‘G’ for girl
 * 
 * Constraints
 * 1 ≤ t ≤ 10000
 * 1 ≤ R ≤ 300
 * Output
 * Print the hostel name (LOHIT/PAPUM) with upper wing (U) and lower wing (L).
 * Example
 * Sample Input
 * 2
 * 30 B
 * 35 G
 * Sample Output
 * PAPUM L
 * LOHIT U
 * Explanation
 * Here 30 is evenly divisible by two and B is the boy so he gets the Papum
 * Hostel and allocated the room at lower wing.
 */