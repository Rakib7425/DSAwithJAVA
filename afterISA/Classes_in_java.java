import java.util.Scanner;

/**
 * Classes_in_java
 */
public class Classes_in_java {
    public static Scanner sc = new Scanner(System.in);





    
    
    
    // ?Code Start from here

static class Student {
    // Enter your code here
    String name;
    int eng;
    int maths;
    int hindi;

    Student(String name, int eng, int maths, int hindi) {
        this.name = name;
        this.eng = eng;
        this.maths = maths;
        this.hindi = hindi;
    }

}

    static Student[] createStudentArray(int n) {
        // Enter your code here
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int eng = sc.nextInt();
            int maths = sc.nextInt();
            int hindi = sc.nextInt();
            students[i] = new Student(name, eng, maths, hindi);
        }
        return students;
    }

    static int engAverage(Student st[], int n) {
        // Enter your code here
        int totalEngMarks = 0;
        for (int i = 0; i < n; i++) {
            totalEngMarks += st[i].eng;
        }
        return (int) Math.floor(totalEngMarks / n);
    }

    static int avgPercentageOfClass(Student st[], int n)
    {
        //Enter your code here
         int totalPercentage = 0;
        for (int i = 0; i < n; i++) {
            int totalMarks = st[i].eng + st[i].maths + st[i].hindi;
            int percentage = (int) Math.floor((totalMarks * 100) / 300);
            totalPercentage += percentage;
        }
        return (int) Math.floor(totalPercentage / n);
    }




// ?Code ends here




    
}

/*
 * Classes in Java
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * In this question, you need to create a class Student which has 4 parameters:-
 * name ( String )
 * eng (int)
 * maths (int)
 * hindi (int)
 * 
 * Also, you need to complete the given three functions:-
 * createStudentArray:- In which you need to create an array of students and
 * take input
 * engAverage:- In which you need to create an average of marks in English.
 * avgPercentageOfClass:- In which you need to calculate the average percentage
 * of the class.
 * 
 * Note:- Scanner is already defined in this question. Use "sc" for scanner.
 * Input
 * You need to take the input in createStudentArray() only in which you have
 * already provided the number of students N you just have to create an array of
 * size N and take input respectively.
 * 
 * Constraints:-
 * 1 <= N <= 1000
 * Output
 * Return the Student array in createStudentArray(), Return the floor of average
 * marks in english in engAverage, and return the floor of average percentage of
 * the class in .
 * 
 * Note:- In avgPercentageOfClas you first need to create the average of
 * individual then find the average of all the students.
 * Example
 * Sample Input:-
 * 3
 * Shiv 65 47 78
 * Negi 55 40 56
 * Gargi 43 56 40
 * 
 * Sample Output:-
 * 54
 * 53
 * 
 * Explanation:-
 * Average marks in eng = (65 + 55 + 43)/3 = 163/3 = 54
 * Average percentage of class =>
 * shiv = (65 + 47 + 78)/3 = 190/3 = 63
 * Negi = (55 + 40 + 56)/3 = 151/3 = 50
 * Gargi = (43 + 56 + 40)/3 = 139/3 = 46
 * avg = (63 + 50 + 46 )/3 = 159 = 53
 */