import java.util.Arrays;

public class search_pos {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 5, 2022
     * Exersise #35
     * Exercise Name: Search Insert Position
     * Difficulty: Easy
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     * Language Used: Java
     * Tags: Array, Binary Search
*/
    public static void main(String[] args) {
       //Sample Variables
       int [] nums = {1,3,5,6};
       int target = 5;
        
       //Prints the result to the console
       System.out.println(searchInsert(nums, target));
    }
    
    /**
     * Binary Search
     * @param nums Array to search in 
     * @param target Value to be found
     * @return Either the index of the value or the negative location of where it would have been
     */
    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums,target);
        if(index<0)
            index = (index*-1)-1;
        return index;
    }

}