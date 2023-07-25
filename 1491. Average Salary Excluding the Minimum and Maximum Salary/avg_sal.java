import java.util.Arrays;

public class avg_sal{
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #1491
     * Exercise Name: Average Salary Excluding the Minimum and Maximum Salary
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, Sorting
*/
    public static void main(String [] arg ){
        //Sample integer array
        int arr [] = {4000,3000,1000,2000};
        //Prints the result to the console
        System.out.println(average(arr));
    }
/**
 * Removes the max and min from the array and get the average
 * @param salary The array with all the salaries
 * @return The average without the max and min
 */
    public static double average(int[] salary) {
        //Sorts the array so the max and min are the first and last elements.
        Arrays.sort(salary);
        //Creates a variable to store the sum
        double sum =0;
        //Ignores the first and last element in the array 
        for(int i =1; i < salary.length-1; i++)
            sum+= salary[i];
        
        //Returns the average without the max and min
        return(double)(sum/(salary.length-2));
    }

}