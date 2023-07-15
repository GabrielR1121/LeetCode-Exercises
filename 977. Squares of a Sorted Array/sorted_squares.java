import java.util.Arrays;

public class sorted_squares {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #977
     * Exercise Name: Squares of a Sorted Array
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, Two-Pointer, Sorting
     */
    public static void main(String[] args) {
        //Sample Array
        int [] arr = {-4,-1,0,3,10};
        
        //Prints the result to the console.
        System.out.println(sortedSquares(arr));
    }

    /**
     * Turns an unsorted array into a sorted array filled with the original numbers squares
     * @param nums An array with unsorted integers
     * @return A sorted array with the squares of each number
     */
    public static int[] sortedSquares(int[] nums) {
        
        //Runs through the array squaring all the numbers.
        for(int i =0; i <=nums.length-1; i++)
            nums[i] = (int)Math.pow(nums[i],2);
        
        //Sorts the new squared array
        Arrays.sort(nums);
        return nums;
    }
}