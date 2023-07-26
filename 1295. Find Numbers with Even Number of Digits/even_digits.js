/*   
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #1295
     * Exercise Name: Find Numbers with Even number of digits
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Array
 */

/**
 * Counts all the even number digits in the array
 * @param {number[]} nums An Array of numbers
 * @return {number} The amount of even numbered digits.
 */
var findNumbers = function(nums) {
    // Initiates the count variable to count the amount of even numbered digits
    let count=0;
    //Traverses the array
    for(let x of nums)
    //If the digit has an even length then increment count
    count+=Math.floor(Math.log10(x)+1)%2==0;
    //Return the result
    return count;
};

//Sample Array
var arr = [12,345,2,6,7896];

//Prints the result to the console
console.log(findNumbers(arr));