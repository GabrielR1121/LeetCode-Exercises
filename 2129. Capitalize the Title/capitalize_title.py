"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 14,2023
     * Exersise #2129
     * Exercise Name: Capitalize the Title
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: String
"""

"""
     * Receives a string to return in its correctly capitalized format
     * @param title A string with the sentence to capitalize correctly
     * @return A string with a correctly capitalized structure
"""


def capitalizeTitle(title: str) -> str:
    # Using list comprehension the given string is divided by word filtered and capitalized if necessary
    return ''.join([str(word.lower() + " ") if len(word) <= 2 else str(word.capitalize() + " ")
                    for word in title.split()]).strip()


# Sample String
title = "First leTTeR of EACH Word"

# Prints the result to the console
print(capitalizeTitle(title))
