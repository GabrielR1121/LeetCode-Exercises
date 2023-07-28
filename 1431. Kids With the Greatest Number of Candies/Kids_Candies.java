import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_Candies {
/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 28, 2023
 * Exersise #1431
 * Exercise Name: Kids with the greatest Number Of Candies
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Java
 * Tags: Array
 */
    public static void main(String[] args) {
        //Sample Data
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;

        //Prints the result to the console
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    /**
     * Creates a Boolean list of which kids will have the greatest amount of candies 
     *      if given the extra candy
     * @param candies An array filled with the amount of candies each kid has
     * @param extraCandies The amount of extra candies i have
     * @return A list with boolean values that determines
     *           which kids have and dont have the greates amny of candies
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //Finds the kid with the largest amount of candy
        int maxNum = Arrays.stream(candies).max().getAsInt();
        //Creates an array list to store the results
        ArrayList<Boolean> result = new ArrayList<Boolean>();

        //Traverses the array 
        for(int i =0; i <candies.length; i++)
            //If the maxNumber of candies is less than or equal to 
            //  the amnt of candies the kid had PLUS the extra candies return true
            //  else return false
            result.add(maxNum <= candies[i] + extraCandies);

        //Return the answer
        return result;
    }
}