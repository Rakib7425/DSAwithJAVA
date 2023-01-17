/* 
! // Code starts 
static class Student {
    // your class code goes here
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

}

public static Student myFunction(String name, int rollNumber) {
	// your function code goes here
    Student s = new Student(name, rollNumber);
    return s;
}
*/
// !Code Ended

/*
 * Classes & Objects Manipulation
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
You need to perform the below operations:

Assign the value of roll_no as given by the user

Assign the value of name as given by the user


by creating an object of the class "Student".
Finally, you have to return object of Student created.
Input
The input contains a single line of String and integer value separated by space.
Output
Return the object created for "Student" class
Example
Input:
Gaurav 1

Output:
Gaurav 1

Input:
Swapnil 2

Output:
Swapnil 2

 */