/**
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 23, 2023
    * Exersise #485
    * Exercise Name: Max Consecutive Ones
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Language Used: JavaScript
    * Tags: Array
*/

/**
 * Finds the max number of consecutive ones
 * @param {number[]} nums An Array filled with ones and zeros
 * @return {number} The Max number of consecutive ones
 */
var findMaxConsecutiveOnes = function(nums) {
    //Stores the max num ber of consecutive ones 
    let max = 0;
    //Stores the current amount of ones found
    let count = 0;
    //Traverses the array
    for (let i = 0; i < nums.length; i++) {
        //If a one is found started the counter
        if (nums[i] === 1) {
            count += 1;
        } else {
            count = 0;
        }
        //If the count is bigger than the max replace max with count
        if (count > max) {
            max = count;
        } 
    }
    //Return the max
    return max;
};