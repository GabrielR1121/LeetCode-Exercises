public class move_zeros {
/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #283
 * Exercise Name: Move Zeros
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Study Plan: LeetCode 75
 * Category: Two Pointer
 * Language Used: Java
 * Tags: Array, Two Pointers
 */
    public static void main(String[] args) {
        //Sample Data
        int nums[] = {0,1,0,3,12};


        moveZeroes(nums);

    }
    /**
     * Moves all zeros to the end of the array in-place
     * @param nums The array filled with numbers
     */
    public static void moveZeroes(int[] nums) {
        //Initialize Pointer
        int index =0; 

        //Enhanced For loop to traverse the nums array
        for(int num: nums)
            //If num is not equal to zero
            if(num != 0)
                //Replace all 0's with the number next to them
                nums[index++] = num;

        //Finish filling out the array with the final zeros
        for(int i = index; i<nums.length; i++)
            nums[i] =0;
        
    }

}