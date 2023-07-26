/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #344
     * Exercise Name: Reverse String
     * Difficulty: Easy
     * Time Complexity: O(logn)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Two Pointer, String
*/

/**
 * Reverse a string in place.
 * @param {character[]} s A string containg the words to reverse.
 */
var reverseString = function(s) {
    
    //Traverse the array and reverse the string
    for(let start  = 0, end = s.length - 1; start < end; start++){
        temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        end--;
    }
};