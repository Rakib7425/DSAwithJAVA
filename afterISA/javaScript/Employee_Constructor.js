// Your code here
function Employee(name, yearOfJoin, location) {
    this.name = name;
    this.yearOfJoin = yearOfJoin;
    this.location = location;

    let salary;

    this.getEmployeeDetails = function () {
        return `Name: ${this.name}, Year of Join: ${this.yearOfJoin}, Location: ${this.location}`
    }

    this.setSalary = function (amount) {
        salary = amount
    }

    this.getSalary = function () {
        return salary
    }

}

/**
 * Employee Constructor
easy
Problem Statement
Create an Employee constructor function which should take three arguments: name, yearOfJoin, and location. These arguments should be used to set the initial values of the name, yearOfJoin, and location properties respectively.

Add a getEmployeeDetails method that returns "Name: name, Year of Join: yearOfJoin, Location: location".

Now, create a private property, salary, in the Employee constructor. Create two methods setSalary, which will take an argument, amount, and set it to salary, and getSalary method, which should return the salary. Make sure the salary property can only be accessed through these methods only.




Note:

Do not create an instance of the Employee constructor.

We have created a factory function createManager, that takes in the same argument as in the Employee constructor and creates an instance of the Employee constructor. There are two methods getManagerDetails, which returns the getEmployeeDetails function from the constructor function, and getManagerSalary method, which returns getSalary function.

The purpose to create this factory function is to check the accessibility of the private property, salary. So, in the expected output section, you will see the results of getEmployeeDetails(), getSalary(), and getManagerSalary() methods.

In the input section, give four arguments, separated by space. That is a string (name), a number (yearOfJoin), a string (location), and a number (salary).
For example, "John" 2022 "London" 50000

Input
The Employee constructor should take three arguments: a string (name), a number (yearOfJoin), and a string (location).
The setSalary() method within the constructor should take a number (salary) as an argument.
Output
The getEmployeeDetails() method within the constructor should return a string.
The getSalary() method should return a number.
Example
let name = "John", let yearOfJoin = 2022, let location = "London", let salary = 50000

const myEmployee = new Employee(name, yearOfJoin, location);
myEmployee.setSalary(salary);
const myManager = createManager(name, yearOfJoin, location);

console.log(myEmployee.getEmployeeDetails()); // Name: John, Year of Join: 2022, Location: London
console.log(myEmployee.getSalary()); // 50000
console.log(myManager.getManagerSalary()); // undefined
 */