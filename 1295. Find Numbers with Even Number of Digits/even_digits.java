public class even_digits {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #1295
     * Exercise Name: Find Numbers with Even number of digits
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array
*/
public static void main(String[] args) {

    //Sample Array 
    int nums[] = {12,345,2,6,7896};

    //prints the result the console
    System.out.println(findNumbers(nums));
    
}

/**
 * Counts all the even number digits in the array
 * @param nums An Array of numbers
 * @return The amount of even numbered digits.
 */
public static int findNumbers(int[] nums) {
    //Initiantes counter variable
    int count =0;
    //Traverses the array
    for(int i =0; i < nums.length; i++){
        //Turns the number to a string in order to check the length of the variable
        String num = nums[i]+"";
        if(num.length() % 2 == 0)
            count++;
        }
    //Returns the amount of even numbered digits
    return count;
}



}