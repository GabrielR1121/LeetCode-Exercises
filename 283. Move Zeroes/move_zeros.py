"""
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 1, 2023
 * Exersise #283
 * Exercise Name: Move Zeros
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Study Plan: LeetCode 75
 * Category: Two Pointer
 * Language Used: Python
 * Tags: Array, Two Pointers
"""


"""
    * Moves all zeros to the end of the array in-place
    * @param nums The array filled with numbers
"""
def moveZeroes(nums) -> None:
        #Initialize Pointer
        index =0
        
        #Traverses each number in nums
        for num in nums:
            #If nums is not equal to 0
            if(num != 0):
                #Replace the 0 with the next one in the array
                nums[index] = num
                index+=1

        #Finish filling the array with 0's
        while(index<len(nums)):
            nums[index] =0
            index+=1

#Sample Data
nums = [0,1,0,3,12]

moveZeroes(nums)