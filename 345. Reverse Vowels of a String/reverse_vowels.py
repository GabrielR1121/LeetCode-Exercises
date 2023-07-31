"""
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 31, 2023
    * Exersise #345
    * Exercise Name: Reverse Vowels of a String
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Study Plan: LeetCode 75
    * Category: Array / String 
    * Language Used: Python
    * Tags: Two Pointer, String
"""


"""
    * Reverses all vowels found in a string
    * @param s A String containing a vowels to reverse
    * @return A string with the vowels reversed.
"""
def reverseVowels(s: str) -> str:
        #Start Index
        start = 0
        #End Index
        end = len(s)-1
        #String containing all vowels
        vowels = "aeiouAEIOU"
        #List of letters in the string
        letters = list(s)

        #Traverses the array from both the start and end
        while(start<end):
            #If the letter is not a vowel move to the next letter
            if(letters[start] not in vowels):
                start +=1
            #IF the letter is not a vowel move to the next letter
            if(letters[end] not in vowels):
                end -=1
            #If both letters are vowels 
            if(letters[start] in vowels and letters[end] in vowels):
                #fill the temp with the start vowel
                temp= letters[start]

                #Store the end vowel in the start
                letters[start] = letters[end]

                #Store the start vowel in the end
                letters[end] = temp

                #Move to the next letter
                start+=1
                #Move to the next letter
                end-=1

        #Join the new letters in a string
        return "".join(letters)