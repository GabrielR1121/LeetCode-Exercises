"""
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 31, 2023
 * Exersise #151
 * Exercise Name: Reverse Words in a String
 * Difficulty: Medium
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Python
 * Tags: Two Pointer, String
"""

"""
  * Reverses a sentence
  * @param s A string with the sentence to be reversed
  * @return The reversed sentence
"""
def reverseWords(s: str) -> str:
        #Splits reverses and returns the new sentence
        return " ".join(s.split()[::-1])
#Sample Data
s = "The sky is blue"

#Prints the result to the console
print(reverseWords(s))