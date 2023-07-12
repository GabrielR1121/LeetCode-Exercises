import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 10, 2023
     * Date Optimized: July 11, 2023
     * Exersise #1
     * Exercise Name: Two Sum
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, Hash Table
     */
    public static void main(String[] args) {
        // Creates sample array to use
        int[] nums = { 2, 7, 11, 15 };
        // Creates sample target to use
        int target = 9;

        // Prints sample answer to the console
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    /**
     * Method that finds the SINGLE pair of digits that sum up to the target and
     * returns their index
     * 
     * @param nums   The array to be used in order to find the digits
     * @param target The sum of numbers to be looked for in the array
     * @return An array with a size of 2 that holds the indexes of both digits that
     *         sum up to the target
     */
    public static int[] twoSum(int[] nums, int target) {
        // Creates a hashmap in order to store the key value pair of the number with an
        // index;
        Map<Integer, Integer> numbers = new HashMap<>();
        // Loops through the original array in order to store a number with its index in
        // the hashmap
        for (int i = 0; i < nums.length; i++)
            // If the value exists in the hashmap
            if (numbers.containsKey((target - nums[i])))
                // Return a new array with their indexes
                return new int[] { numbers.get(target - nums[i]), i };
            else
                // Else store the new value in the hashmap with the index
                numbers.put(nums[i], i);

        // returns an empty array
        return new int[] {};
    }
}