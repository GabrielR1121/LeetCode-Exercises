/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: August 3, 2023
     * Exersise #334
     * Exercise Name: Increasing Triplet Sequence
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Study Plan: LeetCode 75
     * Category: Array / String
     * Tags: Array, Greedy
     * Language Used: JavaScript
*/

/**
 * Finds triplets in the array
 * @param {number[]} nums  Array filled with integer values
 * @return {boolean} Boolean value if the array contains an increasing triplet sequence
 */
var increasingTriplet = function (nums) {
    //Finds the largest number in the array and stores it in order to find the smallest value
    var firstMin = Math.max(...nums);
    var secondMin = Math.max(...nums);

    //Traverses the array finding all valid triplets
    for (let i = 0; i < nums.length; i++)
        if (nums[i] <= firstMin)
            firstMin = nums[i];
        else if (nums[i] <= secondMin)
            secondMin = nums[i];
        else
            //If valid triplets were found return true
            return true;
    //If no valid triplets were found return false
    return false;

};

//Sample Data
nums = [1, 2, 3, 4]

//Prints the result to the console
print(increasingTriplet(nums))