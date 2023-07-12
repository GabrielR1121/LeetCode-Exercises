/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 11, 2023
     * Exersise #1
     * Exercise Name: Two Sum
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Array, Hash Table
     */

/**
  * Method that finds the SINGLE pair of digits that sum up to the target and
  * returns their index
  * @param {number[]} nums The array to be used in order to find the digits
  * @param {number} target The sum of numbers to be looked for in the array
  * @return {number[]} An array with a size of 2 that holds the indexes of both digits that
  *                    sum up to the target
 */
var twoSum = function (nums, target) {
    // Creates a map in order to store the key value pair of the number with an index
    numbers = new Map();
    // Loops through the original array in order to store a number with its index in the hashmap
    for (var index = 0; index < nums.length; index++)
        //If the value exists in the hashmap
        if (numbers.has(target - nums[index]))
            // Return a new array with their indexes
            return [numbers.get(target - nums[index]), index];
        // Else store the new value in the hashmap with the index
        else
            numbers.set(nums[index], index);

};

//Creates a sample list
var nums = [2, 7, 11, 15];
//Creates a sample target
var target = 9;
//Prints the resulting array to the console
console.log(twoSum(nums, target));