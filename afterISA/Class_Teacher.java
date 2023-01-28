
// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Teacher {
    private String name;
    private int age;
    private int salary;

    public Teacher(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

class Class_Teacher {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int salary = sc.nextInt();
        sc.close();

        Teacher teacher = new Teacher(name, age, salary);
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Salary:  " + teacher.getSalary());
    }

}

/*
 * 
 * Class Teacher
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Create a class Teacher with name, age, and salary attributes, where salary
 * must be a private attribute that cannot be accessed outside the class.
 * Print the details of the teacher including salary.
 * Input
 * The first line contains the name, the second line contains the age and the
 * third line contains the salary of the teacher.
 * 
 * Constraints:
 * 20<=age<=80
 * Output
 * Prints the details of the teacher in the following format:
 * Name:
 * Age:
 * Salary:
 * Example
 * Sample Input:
 * raj
 * 22
 * 20000
 * 
 * Sample Output:
 * Name: raj
 * Age: 22
 * Salary: 20000
 */