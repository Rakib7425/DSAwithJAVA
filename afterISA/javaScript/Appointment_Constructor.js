function Appointment(aptDate) {
    // write your code here
    this.date = new Date(aptDate);
    this.location = '';

    this.setLocation = function (str) {
        this.location = str
    }

    this.getLocation = function () {
        return this.location
    }

    this.toString = function () {
        return `Appointment on ${this.date.toDateString()} at ${this.location}`
    }

}

/*
Appointment Constructor
easy
Problem Statement
We gave you a constructor function called Appointment boilerplate that takes a single argument: aptDate which represents the appointment date.

The Appointment object should have a property named date which should be an instance of the JavaScript Date object, that takes aptDate as an argument, and a property named location which should be initially empty string.


The appointment object should have a setter method named setLocation that accepts a string representing the appointment location and sets the location property.


The appointment object should also have a getter method named getLocation that returns the value of the location property.


Finally, the appointment object should have a third method named toString that returns a string representation of the appointment, including the date portion of the date object (as string) and location. The method should return "Appointment on {date} at {location}" where {date} and {location} are the date and location properties of the object created using the Appointment constructor




Note: In the input section, give two arguments, both strings, separated by a comma. That is a string (date) and another string (location). Give the date in yyyy-mm-dd format.
Input
The Appointment constructor should take a single argument: a string (aptDate)
The setLocation() method, within the constructor, should take a string as an argument
Output
The getLocation() method should return a string
And toString() method should also return a string.
Example
let aptDate1 = "2022-12-25", let location = "Doctor Lal Pathlabs"
const appointment1 = new Appointment(aptDate1);
appointment1.setLocation(location);

console.log(appointment1.getLocation()); // Doctor Lal Pathlabs
console.log(appointment1.toString()); // Appointment on Sun Dec 25 2022 at Doctor Lal Pathlabs
*/