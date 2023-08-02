/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #283
 * Exercise Name: Move Zeros
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Study Plan: LeetCode 75
 * Category: Two Pointer
 * Language Used: JavaScript
 * Tags: Array, Two Pointers
 */


/**
 * Moves all zeros to the end of the array in-place
 * @param {number[]} nums The array filled with numbers
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    //Initialize Pointers
    let j = 0;
    let i = 1;

    //Traverse the nums array
    while (i < nums.length) {
        //if swap variable until 0's at the end
        if (nums[j] === 0 && nums[i] !== 0) {
            nums[j] = nums[i];
            nums[i] = 0;
            j++;
        }
        //If Variable is not 0 then move on to the next
        if (nums[j] !== 0) 
            j++;
    
        //Move to the next
        i++;
    }
            
};

//Sample Data
let nums = [0,1,0,3,12];

moveZeroes(nums);