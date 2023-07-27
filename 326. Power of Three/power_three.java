public class power_three {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 15, 2022
     * Exersise #326
     * Exercise Name: Power of Three
     * Difficulty: Easy
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Language Used: Java
     * Tags: Math, Recursion
*/

/**
 * Detemines if a number is a power of 3
 * @param n a number
 * @return True or False if the number is a power of three
 */
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        
        
        int num =(int)Math.round(Math.log(n)/Math.log(3));
        
        return Math.pow(3,num) == n;
    }
}