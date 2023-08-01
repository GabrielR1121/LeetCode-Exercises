/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 31, 2023
 * Exersise #151
 * Exercise Name: Reverse Words in a String
 * Difficulty: Medium
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: JavaScript
 * Tags: Two Pointer, String
 */

/**
 * Reverses a sentence
 * @param {string} s A string with the sentence to be reversed
 * @return {string} The reversed sentence
 */
var reverseWords = function(s) {
    //Removes all whitespace and reverses the string.
    return s.split(/\s+/).reverse().join(" ").trim();
};