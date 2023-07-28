/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 28, 2023
 * Exersise #1431
 * Exercise Name: Kids with the greatest Number Of Candies
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: JavaScript
 * Tags: Array
 */


/**
* Creates a Boolean list of which kids will have the greatest amount of candies 
*      if given the extra candy
 * @param {number[]} candies An array filled with the amount of candies each kid has
 * @param {number} extraCandies The amount of extra candies i have
 * @return {boolean[]} A list with boolean values that determines
 *                        which kids have and dont have the greates amny of candies
 */
var kidsWithCandies = function(candies, extraCandies) {
    //Finds the max number of candies a kid has
    var maxNum = Math.max(...candies);
    //Creates a list to store the result
    let results= [];
    //Traverse the list
    for(var i =0; i < candies.length; i++)
        //Push into the array the correct boolean response
        results.push(maxNum <= candies[i] + extraCandies);
    //Return the results
    return results;
};


//Sample Data
candies = [2,3,5,1,3];
extraCandies = 3;

//Prints the result to the console
print(kidsWithCandies(candies, extraCandies));