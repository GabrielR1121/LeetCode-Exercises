/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #58
     * Exercise Name: Length of Last Word
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: String
 */

/**
 * Given a string will return the length of its last word
 * @param {string} s A string 
 * @return {number} The length of the last word.
 */
var lengthOfLastWord = function(s) {
    //Removes whitespaces in the start and finish of the sentence
    s = s.trim();
    //Splits the sentence into words
    var arr = s.split(' ');
    //Returns the length of the last word.
    return arr[arr.length-1].length;
};