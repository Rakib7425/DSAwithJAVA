//Create a StopWatch constructor function
function StopWatch() {
   //Create a property duration that returns the number of milliseconds passed between start and stop function calls
   this.duration = 0;

   //Create a private variable startTime that stores the starting time of the clock
   let startTime;

   //Create a private variable endTime that stores the ending time of the clock
   let endTime;

   //Create a private variable running that stores whether the clock is running or not
   let running = false;

   //Create a start function that starts the clock
   this.start = function () {
      //If the clock is already running, return "Stopwatch is already running"
      if (running) {
         return "Stopwatch is already running";
      }
      //Otherwise, set running to true and assign the current time to startTime
      running = true;
      startTime = Date.now();
   };

   //Create a stop function that stops the clock
   this.stop = function () {
      //If the clock is not running, return "Stopwatch is not started"
      if (!running) {
         return "Stopwatch is not started";
      }
      //Otherwise, set running to false and assign the current time to endTime
      running = false;
      endTime = Date.now();

      //Update the duration property by adding the difference between endTime and startTime
      this.duration += endTime - startTime;
   };

   //Create a reset function that resets the clock
   this.reset = function () {
      //Set running to false and assign null to startTime and endTime
      running = false;
      startTime = null;
      endTime = null;

      //Set duration to zero
      this.duration = 0;
   };
}

/****
 * 
 * 
 * 
 * Construct Stopwatch
easy
Problem Statement
Complete the Constructor Function StopWatch that should have the below functionalities

Create three functions start, stop, and reset.

Create a property duration, that the constructor function would attach to its object. It should return the number of milliseconds passed between start and stop function calls.

Calling the start function, while the clock is already running, should return Stopwatch is already running

Calling the stop function, while the clock is not running, should return Stopwatch is not started

Calling the reset function, should reset the starting time and the ending time of the clock, and hence the value of duration should also return 0

Input
Three functions start, stop, and reset needs to be implemented. None of them requires any argument.
A property duration is also needed to be defined which also needs no argument.
All of these methods and properties will be part of the object returned by StopWatch constructor function.
Output
start function is used to start the StopWatch, and it should only return the string Stopwatch is already running if it is called while the clock is already running.

stop function is used to stop the StopWatch, and it should only return the string Stopwatch is not started if it is called while the clock is not running.

reset function resets the clock and need not return any value

The duration property should return the number of milliseconds passed between start and stop function calls.
Example

const obj = new StopWatch();

//Example 1
obj.start();
setTimeout(() => {
obj.stop();
console.log(obj.duration) // prints 1000
},1000)

//Example 2
const obj2 = new StopWatch();
obj2.start(); //
console.log(obj2.start()) //prints "Stopwatch is already running"

//Example 3
obj2.stop(); //watch gets stopped
console.log(obj2.stop()) //prints "Stopwatch is not started"
 */
