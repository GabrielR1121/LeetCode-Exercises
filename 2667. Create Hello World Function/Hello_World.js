/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 10, 2023
 * Exersise #2667
 * Exercise Name: Create Hello World Function
 * Difficulty: Easy
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * Study Plan: 30 Days of JavaScript
 * Language Used: JavaScript
 */


/**
 * Prints hello word
 * @return {Function} A function that returns hello world
 */
var createHelloWorld = function() {
    //Returns hello world.
    return () => "Hello World"
        
};

//Prints the result to the console.
print(createHelloWorld());