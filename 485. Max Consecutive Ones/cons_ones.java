public class cons_ones {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #485
     * Exercise Name: Max Consecutive Ones
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array
*/
    public static void main(String [] args) {
        //Sample Array
        int arr[] = {1,1,0,1,1,1};

        //Prints the result to the console
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    /**
     * Finds the max number of consecutive ones
     * @param nums An Array filled with ones and zeros
     * @return The Max number of consecutive ones
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        //Variable used to count the amount of ones found
        int count=0;
        //Stores the max amount of ones found
        int max =0;

        //Traverses the array
        for(int i =0; i<nums.length; i++)
            //If a one is found start counting them 
            if(nums[i] == 1)
                count++;
            //Else the ones end
            else{
                //If the max is smaller than count than replace max with the new count
                if(max<=count)
                    max = count;
                //Reset count
                count=0;
            }
        //Last check of max and count.
        if(max<= count)
            max=count;
        
        //Returns the max number of ones in a count
        return max;
    }
}