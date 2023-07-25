/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #557
     * Exercise Name: Reverse String III
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Two Pointer, String
*/


/**
 * Reverses a sentence word for word
 * @param {string} s A sentence to be reversed
 * @return {string} The reversed sentence
 */
var reverseWords = function(s) {
    //Splits the sentence into words
    let words = s.split(" ");

    //Temp variable to fild each word
    let temp = [];

    //Traverse the words and flipped them individually 
    for(let i=0; i<words.length; i++)
        temp.push(words[i].split("").reverse().join(""));

    //Returns the filpped sentence. 
    return temp.join(" ");
};