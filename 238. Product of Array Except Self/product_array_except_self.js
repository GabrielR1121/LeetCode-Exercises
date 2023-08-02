/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 2, 2023
 * Exersise #238
 * Exercise Name: Product of Array Except Self
 * Difficulty: Medium
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String
 * Tags: Array, Prefix Sum
 * Language Used: Python
 */

/**
 * Creates a list of number with the product of all numbers expect self
 * @param {number[]} nums An array of numbers 
 * @return {number[]} A list of number with the product of all numbers expect self
 */
var productExceptSelf = function(nums) {
    //Fills the start of the array with a placeholder 1 to allow multiplication
    var result = [1];

    //Traverses the array in a prefix way
    for(let i =1; i<nums.length; i++)
        result.push(result[i-1] * nums[i-1]);

    //Traverses the array in a postfix way
    var product = 1;
    for(let i = nums.length-1; i>= 0; i--){
        result[i] *= product;
        product *= nums[i];

    }
    //Returns the resulting array
    return result;
    
};

//Sample Data
nums =[1,2,3,4];

//Prints the result to the console
console.log();