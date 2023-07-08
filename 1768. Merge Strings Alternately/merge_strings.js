/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 8, 2023
 * Exersise #1768
 * Exercise Name: Merge Strings Alternately
 * Difficulty: Easy
 * Time Complexity: O(n), Based on the longest String.
 * Space Complexity: O(n), Based on the longest String.
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: JavaScript
 * Tags: Two Pointer, String
 */

//Creates a sample of word1 for testing
var word1 = "abc";

//Creates a sample of word2 for testing
var word2 = "def";

//Prints the result to the console.
console.log(mergeAlternately(word1,word2));



/**
 * Merges 2 strings together regardless of length of the 2 strings
 * @param {string} word1 A string representing the first word
 * @param {string} word2 A string representing the second word
 * @return {string} The merge word
 */
function mergeAlternately(word1, word2) {
    //Creates the variable that will store the merge word
    var newWord = "";

    //Finds the largest of the 2 words
    var max = Math.max(word1.length, word2.length);

    //Iterates through both words until the merge word is complete.
    for(var index =0; index<max ; index++) {
        //Checks if the letter is Truthy or Falsy (If the letter is there or not)
        if(word1[index])
            //If the letter exists then add it to merge word
            newWord += word1[index];
            //Checks if the letter is Truthy or Falsy (If the letter is there or not)
        if(word2[index])
            //If the letter exists then add it to merge word
            newWord += word2[index];
    }
   
    //Returns the merged word
    return newWord;
};