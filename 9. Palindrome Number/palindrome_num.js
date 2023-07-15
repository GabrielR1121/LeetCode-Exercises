 /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 15,2023
     * Exersise #9
     * Exercise Name: Palindrome Number
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Language Used: JavaScript
     * Tags: Math
   */

 /**
 * Checks if a number is a palindrome
 * @param {number} x A number
 * @return {boolean} True or False depending on if the number is a palindrome or not
 */
var isPalindrome = function(x) {
    //Reverses a number and compares them and either returns True or False.
    return (x+"") === (x+"").split("").reverse().join("");
};


//Sample Number
var number = 121;

//Prints the result to the console
console.log(isPalindrome(number));