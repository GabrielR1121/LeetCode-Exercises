"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 15, 2023
     * Exersise #9
     * Exercise Name: Palindrome Number
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Language Used: Python
     * Tags: Math
"""


"""
    * Checks if a number is a palindrome
    * @param x A number
    * @return True or False depending on if the number is a palindrome or not
"""
def isPalindrome(x: int) -> bool:
         #Reverses a number and compares them and either returns True or False.
         return str(x) == str(x)[::-1]




#Sample Number
number = 121
#Prints the result to the console.
print(isPalindrome(number))