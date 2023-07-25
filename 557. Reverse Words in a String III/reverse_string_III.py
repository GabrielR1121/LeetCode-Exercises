"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #557
     * Exercise Name: Reverse String III
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Two Pointer, String
"""



"""
 * Reverses a sentence word for word 
 * @param s A sentence to be reversed
 * @return The reversed sentence
"""
def reverseWords(s: str) -> str:
    #Using list comprehension to reverse each letter in the sentence and return the full reversed sentence
    return " ".join([ word[::-1] for word in s.split()])


#Sample String
sentence = "Let's take LeetCode contest"

#Prints the result to the console
print(reverseWords(sentence))