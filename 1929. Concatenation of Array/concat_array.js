/**
    * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #1929
     * Exercise Name: Concatination Of Array
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Array
 */

/**
 * Doubles the contents of an array with the same values
 * @param {number[]} nums An array of numbers
 * @return {number[]} Returns a doubled array with the same values.
 */
var getConcatenation = function(nums) {
    //Creates a new array to store the doubled values
    let ans = [];
    //Traverses the array and adds the new values
    for(let i = 0; i < nums.length * 2; i++) 
        ans[i] = nums[i % nums.length];
    
    //Returns the new Array
    return ans;
};