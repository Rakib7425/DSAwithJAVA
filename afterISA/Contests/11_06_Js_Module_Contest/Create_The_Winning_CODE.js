function findCode(students, selectedStudents) {
    // Write your code here
    let res = '';

    for (let i = 0; i < selectedStudents.length; i++) {
        const selecedStud = selectedStudents[i];
        if (students.includes(selecedStud)) {
            const firstLetter = selecedStud.charAt(0).toUpperCase();
            res += firstLetter;
        }
    }

    return res;
}



/**
 * Create The Winning CODE
easy
Problem Statement

You are a class teacher of a class whose students' names are in an Array called students.
You got a list of students who are selected for Student of the Year and their names are in the array selectedStudents
Now your task is to compare both arrays and filter out the names of students of your class from the student of the year's array
Then you have to generate a code that contains the first letter of all the filtered Students in capital letters in order of their occurrence in selectedStudents array.
Input
priyanshu karan vishal piyush
karan priyanshu
Output
KP
Example
let students=["priyanshu ","karan","vishal ","piyush"]
let selectedStudents=["karan ","priyanshu"]
let answer =function findCode(students, selectedStudents)
console.log(answer)// outputs KP
 */