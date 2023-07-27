/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 4, 2023
     * Exersise #75
     * Exercise Name: Sort Colors
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Array, Sorting, Two Pointer
*/

/**
 * sorts the colors
 * @param {number[]} nums an array of Integers
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    for (let i = nums.length - 1; i > 0; i--) {
        for (let j = 0; j <= i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                let temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
    }
};



//Sample Array
colors = [2,0,2,1,1,0];

sortColors(nums);
