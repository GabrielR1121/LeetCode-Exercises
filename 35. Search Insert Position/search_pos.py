"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 5, 2023
     * Exersise #35
     * Exercise Name: Search Insert Position
     * Difficulty: Easy
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     * Language Used: Python
     * Tags: Array, Binary Search
"""


"""
     * Binary Search
     * @param nums Array to search in 
     * @param target Value to be found
     * @return Either the index of the value or the negative location of where it would have been
"""
def searchInsert(nums, target: int) -> int:
        left,right=0,len(nums)-1
        while left<=right:
            mid=(left+right)//2
            if nums[mid]==target:
                return mid
            elif nums[mid]<target:
                left=mid+1
            else:
                right=mid-1
        return left