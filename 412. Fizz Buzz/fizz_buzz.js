/**
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 12, 2023
    * Exersise #412
    * Exercise Name: Fizz Buzz
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Language Used: JavaScript
    * Tags: Math, String, Simulation
*/

/**
 * Going from 1 to n returns an array filled with Fizz, Buzz, FizzBuzz or the number depending
 * on if the number is divisible by 5 AND 3 or just divisible by 3 or just divisible by 5 or neither
 * @param {number} n A number that will serve as a limit and range from 0 to n
 * @return {string[]} An array filled with either Fizz, Buzz, FizzBuzz Or n
 */
var fizzBuzz = function(n) {
    //Creating an array list to store the results. 
    var arr = [];

    //Loop that increases n by one with each iteration.
    for(var number =1; number <=n; number++)
         //Checks if number is divisible by 3 AND 5
        if(number % 3 == 0 && number%5 == 0)
           //If true add FizzBuzz to arraylist
            arr.push("FizzBuzz");
        //If true add FizzBuzz to arraylist
        else if(number%3==0)
          //if true add Fizz to arraylist
            arr.push("Fizz");
        //Check if number id divisible by 5
        else if(number%5==0)
            //if true add buzz to arraylist
            arr.push("Buzz");
        //If none of the other conditions are true
        else
            //Add the plain number to the arraylist
            arr.push(number+"");
            
    //Returns the list filled with Fizz, Buzz, FizzBuzz or the number
    return arr;
};
//Sample Number
var n = 100; 
//Prints resulting array to the console
console.log(fizzBuzz(n));