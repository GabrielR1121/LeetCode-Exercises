"""
* Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 28, 2023
 * Exersise #1431
 * Exercise Name: Kids with the greatest Number Of Candies
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Python
 * Tags: Array
"""


def kidsWithCandies(candies, extraCandies: int):
        #Finds the largest amount of candy a kid has
        maxNum = max(candies)
        #Using list comprehension, fill a list with boolean values
        # If the maxNum of is less than or equal to the kidsCandies PLUS extraCandies 
        # Then return true
        # else return false
        return[maxNum <= kidCandy + extraCandies for kidCandy in candies]

#Sample Data
candies = [2,3,5,1,3]

extraCandies = 3

#Prints the result to the console
print(kidsWithCandies(candies, extraCandies))