/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 25, 2023
     * Exersise #7
     * Exercise Name: Reverse Integer
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Math
*/

/**
 * Reverses an integer unless the integer is bigger than what an integer can hold
 * @param {number} x  An integer
 * @return {number} Either the reversed integer or 0
 */
var reverse = function(x) {
    //Variable to store reversed integer
    let rev = 0;
    //Checks if the integer is negative or positive
    const sign = x < 0 ? -1 : 1;
    //Forces integer to positive
    x = Math.abs(x);

    //Math way of flipping an integer
    while (x !== 0) {
      const digit = x % 10;
      rev = rev * 10 + digit;
      x = Math.floor(x / 10);
    }
    //Adds the sign back to the flipped result
    const result = sign * rev;

    //If the flipped integer is bigger than what an integer can hold then return 0 else return the flipped number
    if (result > 2 ** 31 - 1 || result < -(2 ** 31)) return 0;
    return result;
  }


  //Sample integer 
  var num = 123;

  //Prints the result to the console
  console.log(reverse(num));