import re
"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 13, 2023
     * Exersise #520
     * Exercise Name: Detect Capital
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: String
"""

"""
    * Checks if the capital usage of the word is correct or not
    * @param word Receives the string to be checked
    * @return True or False depending on wether the word is correctly using capital
    *         letters.
    *
"""


def detectCapitalUse(word: str) -> bool:
    # Uses regEx to verify if the word is capitalized correctly
    # Valid answer:
    # The first character is Upper case and there is only 1 uppercase letter and
    #   the rest lowercase
    # The upper counter is the same length of the word
    # The lower counter is the same as the word
    if(re.match('^[A-Z]+$', word) or re.match('^[A-Z][a-z]+$', word) or re.match('^[a-z]+$', word)):
        return True
    else:
        return False


# Sample String
word = "USA"

# Prints the result to the console.
print(detectCapitalUse(word))
