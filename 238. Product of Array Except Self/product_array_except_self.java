public class product_array_except_self {
/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 2, 2023
 * Exersise #238
 * Exercise Name: Product of Array Except Self
 * Difficulty: Medium
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String
 * Tags: Array, Prefix Sum
 * Language Used: Java
 */
    public static void main(String[] args) {
        //Sample Data
        int nums[] = {1,2,3,4};

        //Prints the result to the console
        System.out.println(productExceptSelf(nums));
    }

    /**
     * Creates a list of number with the product of all numbers expect self
     * @param nums An array of numbers 
     * @return A list of number with the product of all numbers expect self
     */
    public static int[] productExceptSelf(int[] nums) {
        //Creates an array to store the new list of products
        int result [] = new int[nums.length];

        //Fills the start of the array with a placeholder 1 to allow multiplication
        result[0] =1;

        //Traverses the array in a prefix way 
        for(int i =1; i<nums.length; i++)
            result[i] = result[i-1] * nums[i-1];

        //Creates variable to allow multiplaction
        int product = 1;

        //Traverse the array in a postfix way
        for(int i = nums.length-1; i>=0; i--){
            result[i] *= product;
            product *= nums[i];
        }

        //Return the new array
        return result;

    }

}