"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 25, 2023
     * Exersise #1089
     * Exercise Name: Duplicate Zeros
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Array, Two Pointer
"""



"""
    * Duplicates all zeros in the array
    * @param arr An array filled with integers
"""
def duplicateZeros(arr) -> None:
        #Counts the amount of zeros 
        zeroes = arr.count(0)
        #Stores the length of the list in a variable
        n = len(arr)
        #Traverses the list in order to duplicate the zeros
        for i in range(n-1, -1, -1):
            if i + zeroes < n:
                arr[i + zeroes] = arr[i]
            if arr[i] == 0: 
                zeroes -= 1
                if i + zeroes < n:
                    arr[i + zeroes] = 0

#Sample Array
arr = [1,0,2,3,0,4,5,0]

duplicateZeros(arr)