public class power {
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
    public static void main(String[] args) {
        //Sample Variables
        double x = 2.00000;
        int  n = 10;

        //Prints the result to the console
        System.out.println(myPow(x,n));
    }
    /**
     * Raises n to the power of x
     * @param x The base value
     * @param n The exponent
     * @return The raised power of n to x
     */
    public static double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}