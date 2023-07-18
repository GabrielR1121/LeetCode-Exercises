"""
    * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 17, 2023
     * Exersise #1523
     * Exercise Name: Count odd numbers in an interval range
     * Difficulty: Easy
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     * Language Used: Python
     * Tags: Math
"""


"""
 * Takes 2 numbers and returns the amount of odds inbetween them.
 * @param low The low end of the range 
 * @param high The high end of the range
 * @return The amount of odd numbers inbetween low and high ends 
"""
def countOdds(self, low: int, high: int) -> int:
    if(low%2==0):
        low += 1
    if(high%2==0):
        high -= 1

    return int((high-low)/2 +1)

#Sample low 
low = 3

#Sample high
high = 7

#Prints the results the console. 
print(countOdds(low,high))