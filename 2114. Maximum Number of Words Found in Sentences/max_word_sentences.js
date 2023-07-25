/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #2114
     * Exercise Name: Average Salary Excluding the Minimum and Maximum Salary
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Array, String
*/



/**
 * Finds the sentence with the max amount of words 
 * @param {string[]} sentences An array filled with sentences.
 * @return {number} An integer with the max amount of words in the sentence.
 */
var mostWordsFound = function(sentences) {
    //Variable to store the max sentence length
    let max = 0;
    //Loops through the snetences finding the max length
    for (const i of sentences) {
      let len = i.split(" ").length;
      max = max > len ? max : len;
    }
  
    //Returns the sentence with the max length
    return max;
};