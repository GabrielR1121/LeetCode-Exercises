/**
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 15, 2023
    * Exersise #2000
    * Exercise Name: Reverse Prefix of Word
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Language Used: JavaScript
    * Tags: String, Two-Pointer
*/


/**
 * reverses a givin string up until a given index 
 * @param {string} word a string with a word
 * @param {character} ch a character that is to be found in the string
 * @return {string} a reversed prefix
 */
var reversePrefix = function(word, ch) {
    var index = word.indexOf(ch);
    var rev = word.substring(0, index+1).split("").reverse().join("");
    return rev + word.substring(index+1, word.length);

};

 //Sample String
 var word = "abcdefd";
 //Sample Char
 var chr = 'd';

 //prints the result to the console. 
 console.log(reversePrefix(word,chr));