"""
    * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 11, 2023
     * Exersise #1
     * Exercise Name: Two Sum
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Array, Hash Table
"""

"""
     * Method that finds the SINGLE pair of digits that sum up to the target and
     * returns their index
     * 
     * @param nums   The array to be used in order to find the digits
     * @param target The sum of numbers to be looked for in the array
     * @return An array with a size of 2 that holds the indexes of both digits that
     *         sum up to the target
"""


def twoSum(nums, target):
    # Creates a dictionary in order to store the key value pairs
    dictionary = {}

    # Loops through the list in order to either return the value and its index or store it
    for index in range(len(nums)):
        # If the key is in the dictionary
        if((target - nums[index]) in dictionary.keys()):
            # Return a new list with the index found in the dictionary and the current index
            return [dictionary[target-nums[index]], index]
        else:
            # Else add the new value to the dictionary with it index.
            dictionary[nums[index]] = index


# Creates a sample list
nums = [2, 7, 11, 15]
# Creates a sample target
target = 9
# Prints to the console the list with the resulting indexes.
print(twoSum(nums, target))
