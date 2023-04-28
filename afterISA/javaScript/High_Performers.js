/**
 * The function takes in an array of students and returns an array of high performers, where a high
 * performer is defined as a student with an average score greater than 90.
 * @param students - an array of objects representing students, where each object has the following
 * properties:
 * @returns The function `highPerformers` returns an array of objects containing the name and average
 * score of students whose average score is greater than 90.
 */
function highPerformers(students) {
    return students
        .map(student => ({
            name: student.name,
            average: student.scores.reduce((acc, score) => acc + score, 0) / student.scores.length
        }))
        .filter(student => student.average > 90);
}

/**
 * 
 * High Performers
easy
Problem Statement
You are given an array of objects representing a group of students, each with a name and an array of test scores. Your task is to use map, filter, and reduce to calculate the average test score for each student, and then return an array of objects containing only the students who have an average score above 90.

The array of objects that you will return should have the keys "name" and "average" which should contain the name and the average marks of the student if his average marks is greater than 90.
Input
The highPerformers function takes an array of objects as argument
Output
Return an array of objects containing only the students who have an average score above 90. The objects in the array should have the keys "name" and "average" which should contain the name and the average marks of the student if his average score is greater than 90.
ai_logoAI CODELENS
BETA
Simpler Explanation
Concepts Used
Example
const students = [
{ name: "Ram", scores: [80, 95, 60] },
{ name: "Mohan", scores: [85, 70, 90] },
{ name: "Sai", scores: [60, 70, 80] },
{ name: "Hemang", scores: [95, 90, 94] },
];

const res = highPerformers(students);
console.log(res);
// [ { name: 'Hemang', average: 93 } ]
 */