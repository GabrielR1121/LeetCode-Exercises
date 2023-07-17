"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 5, 2022
     * Date Optimized: July 15, 2023
     * Exersise #2000
     * Exercise Name: Reverse Prefix of Word
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: String, Two-Pointer
"""


"""
     * reverses a givin string up until a given index 
     * @param word a string with a word
     * @param ch a character that is to be found in the string
     * @return a reversed prefix
"""
def reversePrefix(word: str, ch: str) -> str:
    #if the letter is not in the word return the same word
    if ch not in word:
        return word
    #find the index of the letter in the word 
    ind = list(word).index(ch)
    #Flips the word up until the found index
    l = (word[:ind+1][::-1])
    #joins the flipped word with the rest of the word
    word[:ind+1] = l
    #returns the full new word
    return ''.join(word)


#Sample string
word = "abcdefd"
#Sample Char
chr = 'd'
#prints the result to the console
print(reversePrefix(word,chr))