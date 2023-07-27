"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 15, 2022
     * Exersise #326
     * Exercise Name: Power of Three
     * Difficulty: Easy
     * Time Complexity: O(logn)
     * Space Complexity: O(1)
     * Language Used: Python
     * Tags: Math, Recursion
"""


def isPowerOfThree(n: int) -> bool:
        if n < 1:
            return False
        while(n % 3 == 0):
            n /= 3
        return n == 1