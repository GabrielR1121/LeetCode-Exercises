/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 5, 2022
     * Exersise #35
     * Exercise Name: Search Insert Position
     * Difficulty: Easy
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     * Language Used: Java
     * Tags: Array, Binary Search
*/

/**
 * Binary Search
 * @param {number[]} nums Array to search in 
 * @param {number} target Value to be found
 * @return {number} Either the index of the value or the negative location of where it would have been
 */
var searchInsert = function(nums, target) {
    let lo = 0, hi = nums.length;
    while(lo < hi) { 
        let mid = lo + Math.floor((hi-lo)/2); 
        if (target > nums[mid]) {
            lo = mid + 1 
        } else {
            hi = mid 
        }
    }
    return lo;
};