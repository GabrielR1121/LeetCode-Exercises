"""
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 15, 2023
    * Exersise #977
    * Exercise Name: Squares of a Sorted Array
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Language Used: Python
    * Tags: Array, Two-Pointer, Sorting
"""

"""
     * Turns an unsorted array into a sorted array filled with the original numbers squares
     * @param nums An array with unsorted integers
     * @return A sorted array with the squares of each number
"""
def sortedSquares(nums):
    # Using list comprehension and squaring to create suare sorted array and then sorting it
    return sorted([pow(num,2) for num in nums])

#Sample Array
arr = [-4,-1,0,3,10]
#Prints the result to the console
print(sortedSquares(arr))
