"""
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 7, 2023
 * Exersise #1768
 * Exercise Name: Merge Strings Alternately
 * Difficulty: Easy
 * Time Complexity: O(n), Based on the longest String.
 * Space Complexity: O(n), Based on the longest String.
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Python
 * Tags: Two Pointer, String
"""


"""
* Merges 2 strings together regardless of length of the 2 strings
* Has a Parameter of word1, a String 
* Has a Parameter of word2, a String 
* Returns the merged representation of both strings.
*
* This code can be optimized even more by using ZIP()
"""


def mergeAlternately(word1: str, word2: str) -> str:
    # Initializes a string variable where the merged word will be stored.
    mergedWord = ""

    # Initializes an Integer variable that will be used as index for the respective words
    index = 0

    # Runs a while loop based on the shortest word and starts merging until shortest word is complete
    while(index < min(len(word1), len(word2))):
        mergedWord += word1[index]
        mergedWord += word2[index]

        index += 1

    # Returns the completed mergeWord by concatinating the merged word up until the shortest word
    # and after using array manipulation to add the remaining of the longest word.
    return mergedWord + word1[index:] + word2[index:]


class merge_strings:
    # Creates a sample variable of word1
    word1 = "abc"

    # Creates a sample variable of word2
    word2 = "efg"

    # Calls the method mergeAlternately and Prints the merged word to the console.
    print(mergeAlternately(word1, word2))
