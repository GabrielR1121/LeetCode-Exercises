"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #58
     * Exercise Name: Length of Last Word
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: String
"""

"""
     * Given a string will return the length of its last word
     * @param s A string 
     * @return The length of the last word.
"""
def lengthOfLastWord(s: str) -> int:
    #Returns the length of the last word
    return len(s.split()[-1])

#Sample String
sentences = "Hello World"

#Prints the result to the console
print(lengthOfLastWord(sentences))

