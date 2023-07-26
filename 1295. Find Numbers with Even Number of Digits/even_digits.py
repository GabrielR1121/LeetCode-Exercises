"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #1295
     * Exercise Name: Find Numbers with Even number of digits
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Array
"""



"""
 * Counts all the even number digits in the array
 * @param nums An Array of numbers
 * @return The amount of even numbered digits.
"""
def findNumbers(nums) -> int:
        #Initiates the count variable to count the amount of even numbered digits
        count=0
        #Traverses the array
        for i in range(len(nums)):
            #If the number is has an even amount of digits 
            if len(str(nums[i]))%2==0:
                count+=1
        #Returns the results
        return count

#Sample Array
arr = [12,345,2,6,7896]

#Prints the result to the console
print(findNumbers(arr))