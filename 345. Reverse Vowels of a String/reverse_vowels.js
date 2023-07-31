/**
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 31, 2023
    * Exersise #345
    * Exercise Name: Reverse Vowels of a String
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Study Plan: LeetCode 75
    * Category: Array / String 
    * Language Used: JavaScript
    * Tags: Two Pointer, String
 */


/**
 * Reverses all vowels found in a string
 * @param {string} s A String containing a vowels to reverse
 * @return {string} A string with the vowels reversed.
 */
var reverseVowels = function(s) {
    //Staring index
    var start = 0;
    //Ending index
    var end = s.length-1;
    //String with all vowels.
    var vowels = "aeiouAEIOU";
    //Array filled with each character in the word
    var letters = s.split("");

    //Traverse the array from the start and the end at the same time
    while(start<end) {
        //If the letter isnt a vowel move to the next letter
        if(!vowels.includes(letters[start]))
            start++;
        //If the letter is not a vowel move to the next letter
        if(!vowels.includes(letters[end]))
            end--;
        //If both current letters are vowels then swap them
        if(vowels.includes(letters[start]) && vowels.includes(letters[end])){
            //Store the start variable in a temporary variable
            var temp = letters[start];
            //Replace the start with the end vowel
            letters[start] = letters[end];
            //Replace the end with the temporary vowel
            letters[end] = temp;
            //Move to the next letter
            start++;
            //Move to the next letter
            end--;
        }

    }
    //Returns the joined string of the letters array
     return letters.join("");

    
};