"""
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 11, 2023
 * Exersise #1071
 * Exercise Name: Greatest Common Divisor of Strings
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Python
 * Tags: Math, String
"""

"""
    * finds the greatest common divisor of both strings
    * @param str1 A string representing the first string to verify
    * @param str2 A string representing the second string to verify
    * @return Returns a substring representing the greatest common divisors
"""
def gcdOfStrings(str1: str, str2: str) -> str:
        if( (str1 + str2) != (str2 + str1) ):
            return ""
        
        return str1[ :gcd( len(str1) ,len(str2) )]


"""
    * Recursive helper method to find the gcd of both strings
    * @param x The length of the first string
    * @param y The length of the second string
    * @return A number representing the gcd of both strings.
"""
def gcd(x: int, y:int) -> int:
    if(y==0):
        return x
    else:
        return gcd(y, x%y)
    
# Sample String
str1 = "ABCABC"
#Sample String
str2 = "ABC"

# Print the resulting substring
print( gcdOfStrings(str1, str2) )
    

