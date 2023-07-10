import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class two_sum {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 10, 2023
     * Exersise #1
     * Exercise Name: Two Sum
     * Difficulty: Easy
     * Time Complexity: O(nlogn)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, Hash Table
     */
    public static void main(String[] args) {
        // Creates sample array to use
        int[] nums = { 2, 7, 11, 15 };
        // Creates sample target to use
        int target = 9;

        // Stores the answer from the method
        int[] answer = twoSum(nums, target);

        // Prints sample answer to the console
        System.out.println(Arrays.toString(answer));
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
        // Creates an array,with a size of 2, that will store the answer.
        int answer[] = new int[2];

        // Converts the nums array into an array list to be able to search for indexes
        List<Integer> searchArr = Arrays.stream(nums).boxed().collect(Collectors.toList());

        // Creates a copy of nums so that we can sort the copy for binary search
        int sortedArr[] = nums;

        // Indexes of both arrays
        int index = 0;
        int foundIndex = 0;

        // Sorts the copy of nums.
        Arrays.sort(sortedArr);

        // Runs while found index is negative or we reach the end of the array.
        do {

            foundIndex = Arrays.binarySearch(sortedArr, (target - sortedArr[index]));

            if (foundIndex >= 0)
                break;

        } while (sortedArr.length != index++);

        // If the numbers are the same then find the first and last reference of their
        // indexes so the indexes dont repeat.
        if (sortedArr[index] == sortedArr[foundIndex]) {
            answer[0] = searchArr.indexOf(sortedArr[index]);
            answer[1] = searchArr.lastIndexOf(sortedArr[foundIndex]);
            // Else just store their indexes
        } else {

            answer[0] = searchArr.indexOf(sortedArr[index]);
            answer[1] = searchArr.indexOf(sortedArr[foundIndex]);
        }
        // Return the answer.
        return answer;
    }
}