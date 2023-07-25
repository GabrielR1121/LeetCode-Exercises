import java.util.Arrays;

public class concat_array {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #1929
     * Exercise Name: Concatination Of Array
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array
*/
    public static void main(String [] arr) {
        //Sample array
        int nums[] = {1,2,1};

        //Prints the result to the console
        System.out.println(getConcatenation(nums));
    }

    /**
     * Doubles the contents of an array with the same values
     * @param nums An array of numbers
     * @return Returns a doubled array with the same values.
     */
     public static int[] getConcatenation(int[] nums) {
        
        //Creates a new array with double the size of the old array =
        int[] arr = Arrays.copyOf(nums, nums.length*2);
        
        //Traverses the array and adds the doubled value to the new slots of the array
        for(int i = 0; i< arr.length/2; i++)
            arr[i+nums.length] = arr[i];
        
        //Returns the new array
        return arr;
    }
}