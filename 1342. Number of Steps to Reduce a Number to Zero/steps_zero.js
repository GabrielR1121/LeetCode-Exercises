/**
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: March 14, 2022
    * Date Optimized: July 11, 2023
    * Exersise #1342
    * Exercise Name: Number of steps to reduce a number to zero
    * Difficulty: Easy
    * Time Complexity: O(logn)
    * Space Complexity: O(n)
    * Language Used: JavaScript
    * Tags: Math, Bit Manipulation
*/

/**
 * Reduce a given number to 0 and counts the amount of steps taken
 * @param {number} num  A number to be reduced to 0
 * @return {number} Returns the amount of steps taken to reach 0
 */
var numberOfSteps = function(num) {
    //Initializes variable that will count steps.
    var steps = 0;
    //While nums is not zero keep reducing it
    while(num!=0){
        //If num is an even number divide num by 2
        if(num%2 == 0)
            num/=2;
        //If num is an odd number substract by 1
        else
            num-=1;
        //Increments steps by 1 each turn 
        steps++;
    }
    //Returns the amount of steps taken to reach 0
    return steps;
};

//Sample number
var num = 250;

//Prints to the console the amount of steps taken to reach 0
console.log(numberOfSteps(num));