/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 11, 2023
 * Exersise #1071
 * Exercise Name: Greatest Common Divisor of Strings
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: JavaScript
 * Tags: Math, String
 */


/**
 * finds the greatest common divisor of both strings
 * @param {string} str1 A string representing the first string to verify
 * @param {string} str2 A string representing the second string to verify
 * @return {string}
 */
var gcdOfStrings = function(str1, str2) {
    if( (str1 + str2) != (str2 + str1)  )
        return "";

    return str1.substring(0, gcd(str1.length,str2.length) )
};

/**
    * Recursive helper method to find the gcd of both strings
    * @param x The length of the first string
    * @param y The length of the second string
    * @return A number representing the gcd of both strings.
*/
function gcd(x, y){
    if(y == 0)
        return x;
    return gcd(y, x%y);
}