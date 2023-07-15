/**
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 15, 2023
    * Exersise #977
    * Exercise Name: Squares of a Sorted Array
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Language Used: JavaScript
    * Tags: Array, Two-Pointer, Sorting
*/

/**
 * Turns an unsorted array into a sorted array filled with the original numbers squares
 * @param {number[]} nums An array with unsorted integers
 * @return {number[]} A sorted array with the squares of each number
 */
var sortedSquares = function(nums) {
    //Runs through the array and squares all values
    for(var i = 0; i < nums.length; i++)
        nums[i] = Math.pow(nums[i],2);

    //Sorts the array
    //Since sort is made to sort alphabetically an extra parameter needs to be added to allow integer sort
    nums.sort(function(a, b) {
                return a - b;
            });
    return nums;
};


//Sample Array 
const arr = [-4,-1,0,3,10];

//Prints the result to the console 
console.log(sortedSquares(arr));