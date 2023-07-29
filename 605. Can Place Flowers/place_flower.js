/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 29, 2023
 * Exersise #605
 * Exercise Name: Can Place Flower
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: JavaScript
 * Tags: Array, Greedy
 */

/**
 * Places flowers in nonadjacent locations
 * @param {number[]} flowerbed An Integer array with 0's and 1's
 * @param {number} n The amount of flowers available to plants
 * @return {boolean} Boolean value if the amount of flowers can be planted in the flowerbed
 */
var canPlaceFlowers = function(flowerbed, n) {
    // Creates a new array
    newDirt = [...flowerbed];
    //Adds a 0 to the start of the new Array
    newDirt.unshift(0);
    //Adds 0 to the end of the new Array
    newDirt.push(0);

    //Traverses the array
    for(var i=1; i < newDirt.length-1; i++){
        //If 000 is found
        if(newDirt[i-1]=== 0 && newDirt[i] === 0 && newDirt[i+1]===0){
            //Subtract a flower
            n--;
            //Plant the flower
            newDirt[i] =1;
        }

        //If all flowers planted
        if(n===0)
            //Return true
            return true;


    }
    //Return true or false if either all flowers were planted or not
    return n<=0;


};