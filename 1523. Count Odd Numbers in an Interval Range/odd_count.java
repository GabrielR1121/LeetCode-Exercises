public class odd_count {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 26, 2022
     * Exersise #1523
     * Exercise Name: Count odd numbers in an interval range
     * Difficulty: Easy
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Language Used: Java
     * Tags: Math
     */
public static void main(String [] args) {
    //sample low number
    int low = 3;

    //sample high number
    int high = 7;

    //Prints the result to the console. 
    System.out.println(countOdds(low, high));
}
/**
 * Takes 2 numbers and returns the amount of odds inbetween them.
 * @param low The low end of the range 
 * @param high The high end of the range
 * @return The amount of odd numbers inbetween low and high ends
 */
public static int countOdds(int low, int high) {
        //If the low range is even
        if(low %2==0)
            //Make it odd
            low = low +1;
        //If the high range is even
        if(high % 2 == 0)
            //make it odd
            high = high - 1;
        
        //Using the same concept of Guass Sum formula we get the result.
        return (high-low)/2 +1;
    }

}