"""
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: August 2, 2023
 * Exersise #238
 * Exercise Name: Product of Array Except Self
 * Difficulty: Medium
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String
 * Tags: Array, Prefix Sum
 * Language Used: Python
"""




"""
     * Creates a list of number with the product of all numbers expect self
     * @param nums An array of numbers 
     * @return A list of number with the product of all numbers expect self 
"""
def productExceptSelf(nums):
        #Creates a placeholder 1 in a list to store the result
        result = [1]

        #Traverses the array in a prefix way
        for index in range(1,len(nums)):
            result.insert(index, result[index-1]*nums[index-1])
        
        #Traverses the array in a postfix way
        product =1
        for index in reversed(range(len(nums))):
            result[index] *= product
            product*=nums[index]

        #Returns the resulting array
        return result

#Sample Data
nums =[1,2,3,4]

#Prints the result to the console
print(productExceptSelf(nums))