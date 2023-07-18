/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 26, 2022
     * Exersise #1523
     * Exercise Name: Count odd numbers in an interval range
     * Difficulty: Easy
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Language Used: JavaScript
     * Tags: Math
*/

/**
 * Takes 2 numbers and returns the amount of odds inbetween them
 * @param {number} low The low end of the range 
 * @param {number} high The high end of the range
 * @return {number} The amount of odd numbers inbetween low and high ends
 */
var countOdds = function(low, high) {
    if(low%2==0)
        low +=1;
    if(high%2==0)
        high-=1

    return (high-low)/2 +1
};


//Sample Low
var low = 3;
//Sample High
var high = 7;


//Prints the result to the console. 
console.log(countOdds(low,high));