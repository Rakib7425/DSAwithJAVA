// Your code here
//Create a Product constructor function
function Product(name, price, manufacturer) {
   //Set the initial values of the name, price, and manufacturer properties
   this.name = name;
   this.price = price;
   this.manufacturer = manufacturer;

   //Create a private property, tax which will store the tax percentage
   let tax;

   //Create a method getProductDetails that returns the string "Name: {name}, Price: {price}, Manufacturer: {manufacturer}"
   this.getProductDetails = function () {
      return `Name: ${this.name}, Price: ${this.price}, Manufacturer: ${this.manufacturer}`;
   };

   //Create a method setTax, which will take an argument amount, and assign its value to the tax
   this.setTax = function (amount) {
      tax = amount;
   };

   //Create a method getTax method, which should return the tax
   this.getTax = function () {
      return tax;
   };

   //Create a private method calculateTotalPrice which would return the total price
   let calculateTotalPrice = function () {
      return this.price + this.price * (tax / 100);
   }.bind(this); //bind the this keyword to the current object

   //Create a method getTotalPrice which would call calculateTotalPrice function, and return the value
   this.getTotalPrice = function () {
      return calculateTotalPrice();
   };

   //Create a method deleteMethod which would take methodName as argument and should delete the methodName function of the constructor
   this.deleteMethod = function (methodName) {
      delete this[methodName];
   };
}

/**
 Product Constructor
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Create a Product constructor function which should take three arguments: name, price, and manufacturer. These arguments should be used to set the initial values of the name, price, and manufacturer properties respectively.

Add a getProductDetails method that returns the string"Name: {name}, Price: {price}, Manufacturer: {manufacturer}" where {name},{price},{manufacturer} are the corresponding properties of the object


Now, create a private property, tax which will store the tax percentage. This property should not be directly accessible by the objects created using the Product constructor.

Create a method setTax, which will take an argument amount, and assign its value to the tax. Create another method getTax method, which should return the tax


Create a private method calculateTotalPrice which would return the total price which can be calculated as price + price*(tax/100)


Create a method getTotalPrice which would call calculateTotalPrice function, and return the value which calculateTotalPrice returned


Create a method deleteMethod which would take methodName as argument and should delete the methodName function of the constructor.


All functions other than calculateTotalPrice should be accessible to the objects created using the Product constructor


Input
The Product constructor should take three arguments: name , price, and manufacturer.
The setTax() method within the constructor should take amount as an argument.
The deleteMethod() function within the constructor should take methodName as an argument.
Providing the functions with the input is handled internally.

Example:
Bulb,1000,Philips,10
Output
getProductDetails method should return string "Name: name, Price: price, Manufacturer: manufacturer"
getTax method should return the tax
setTax method should set the value of tax and need not return any value
getTotalPrice should return the total price which can be calculated by calling the calculateTotalPrice function
calculateTotalPrice function should return the total price calculated as price + price*(tax/100)
deleteMethod(methodName) should delete methodName function and need not return any value
Example
const arg1 = "Bulb";
const arg2 = "1000";
const arg3 = "Philips";
const arg4 = "5";

const myProduct = new Product(arg1, parseInt(arg2), arg3);
myProduct.setTax(parseInt(arg4));
console.log(myProduct.getProductDetails()); //prints "Name: Bulb, Price: 1000, Manufacturer: Philips"
console.log(myProduct.getTax()); //prints 5
 */
