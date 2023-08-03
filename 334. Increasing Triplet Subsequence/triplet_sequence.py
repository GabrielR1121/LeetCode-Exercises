"""
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
     * Language Used: Python
"""


def increasingTriplet(nums) -> bool:
    """
     * Finds triplets in the array
     * @param nums Array filled with integer values
     * @return Boolean value if the array contains an increasing triplet sequence
     """

    # Stores the largest number in the list into the variable in order to find the smallest triplest
    firstMin = max(nums)
    secondMin = max(nums)

    # If the list has 3 or more values then find the triplet
    if(len(nums) >= 3):
        # Traverse every number in the list finding the smallest triplets
        for num in nums:
            if(num <= firstMin):
                firstMin = num
            elif(num <= secondMin):
                secondMin = num
            else:
                # If valid triplets were found then return true
                return True

    # If the list contained no triplets or no valid triplets return false
    return False


# Sample Data
nums = [1, 2, 3, 4]

# Prints the result to the console
print(increasingTriplet(nums))
