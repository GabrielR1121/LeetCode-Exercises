/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 25, 2023
     * Exersise #50
     * Exercise Name: Pow(x,n)
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, Sorting
*/

/**
 * Raises n to the power of x
 * @param {number} x The base value
 * @param {number} n The exponent
 * @return {number} The raised power of n to x
 */
var myPow = function(x, n) {
    if(n < 0) {
      x = 1 / x;
      n = -n;
  }

  let result = 1;
  let current_product = x;

  while(n > 0) {
      if(n % 2 == 1) {
          result = result * current_product;
      }
      current_product = current_product * current_product;
      n = Math.floor(n / 2);
  }

  return result;    
};