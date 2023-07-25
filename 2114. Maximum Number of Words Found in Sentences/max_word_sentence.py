"""
    * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #2114
     * Exercise Name: Average Salary Excluding the Minimum and Maximum Salary
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Array, String
"""


"""
     * Finds the sentence with the max amount of words 
     * @param sentences An array filled with sentences.
     * @return An integer with the max amount of words in the sentence.
"""
def mostWordsFound(sentences) -> int:
        #Variable to count the amount of words in each sentence
        count=0

        #For each word in sentences count the length of the word
        for word in sentences:
            length = len(word.split())
            #If the length of the sentences is larger than the previous one then repleace count with the new length
            if length>count:
                count= length
        #Returns the max length of the biggest sentence
        return count

