public class triplet_sequence {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: August 3, 2023
     * Exersise #334
     * Exercise Name: Increasing Triplet Sequence
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Study Plan: LeetCode 75
     * Category: Array / String
     * Tags: Array, Greedy
     * Language Used: Java
     */
    public static void main(String[] args) {
        // Sample Data
        int nums[] = { 1, 2, 3, 4 };

        // Prints the result to the console.
        System.out.println(increasingTriplet(nums));
    }

    /**
     * Finds triplets in the array
     * 
     * @param nums Array filled with integer values
     * @return Boolean value if the array contains an increasing triplet sequence
     */
    public static boolean increasingTriplet(int[] nums) {
        // If the array has triplets
        if (nums.length >= 3) {
            // Create 2 variables to store the smallest triplets
            int firstMin = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;

            // Traverse the array finding the 3 smallest triplets in the array
            for (int i = 0; i < nums.length; i++)
                if (nums[i] <= firstMin)
                    firstMin = nums[i];
                else if (nums[i] <= secondMin)
                    secondMin = nums[i];
                else
                    // If the third one is found stop the search and return true
                    return true;

        }
        // If valid triplets are not in the array then return false.
        return false;

    }
}