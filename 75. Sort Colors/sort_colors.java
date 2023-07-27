import java.util.Arrays;

public class sort_colors {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 4, 2023
     * Exersise #75
     * Exercise Name: Sort Colors
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, Sorting, Two Pointer
*/

    public static void main(String[] args) {
        //sample Array 
        int colors[] = {2,0,2,1,1,0};

        sortColors(colors);
    }

    /**
     * sorts the colors
     * @param nums an array of Integers
     */
    public static void sortColors(int[] nums) {
        //Sorts the list
        Arrays.sort(nums);
        //Shows the result to the console
        System.out.println(Arrays.toString(nums));
    }



}