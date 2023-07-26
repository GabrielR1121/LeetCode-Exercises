/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 25, 2023
     * Exersise #1089
     * Exercise Name: Duplicate Zeros
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Array, Two Pointer
*/


/**
 * Duplicates all zeros in the array
 * @param {number[]} arr An array filled with integers
 * @return {void} Do not return anything, modify arr in-place instead.
 */
var duplicateZeros = function(arr) {
    //Traverses the array to find duplicate all the zeros in the array
    for(let i = 0; i<arr.length;i++){
    if(arr[i]===0){
        arr.pop(); 
        arr.splice(i+1,0,0);
        i++
    }
}
//Returns the result to the console.
return arr; 
};

//Sample array
var arr = [1,0,2,3,0,4,5,0];

duplicateZeros(arr);