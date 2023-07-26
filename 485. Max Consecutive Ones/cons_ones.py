"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #485
     * Exercise Name: Max Consecutive Ones
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Array
"""

"""
     * Finds the max number of consecutive ones
     * @param nums An Array filled with ones and zeros
     * @return The Max number of consecutive ones
"""
def findMaxConsecutiveOnes(nums) -> int:
        #Seperates the list into a string 
        kk = ''.join(map(str, nums))

        #Splits the list by the zeros
        ll = kk.split('0')
        #Stores the max amount of consecutive ones
        max_len = 0
        #Traverse the list in order to find the max amount of consecutive ones
        for i in ll:
            if len(i) > max_len:
                max_len = len(i)
        #Return the max number of ones
        return(max_len)

#Sample Array
nums = [1,1,0,1,1,1]

#Prints the result to the console
print(findMaxConsecutiveOnes(nums))