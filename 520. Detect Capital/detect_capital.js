/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 26, 2022
     * Exersise #520
     * Exercise Name: Detect Capital
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: String
     */

/**
 *  Checks if the capital usage of the word is correct or not
 * @param {string} word  Receives the string to be checked
 * @return {boolean} True or False depending on wether the word is correctly using capital
     *               letters.
 */
var detectCapitalUse = function (word) {
    // Valid answer:
    // * The first character is Upper case and there is only 1 uppercase letter and
    // the rest lowercase
    // * The upper counter is the same length of the word
    // * The lower counter is the same as the word
    return /(^[A-Z]+$)|(^[a-z]+$)|(^[A-Z]([a-z]+)$)/.test(word);

};

//Sample String
var word = "USA";
// Prints the result to the console.
console.log(detectCapitalUse(word));