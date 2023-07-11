"""
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: March 14, 2022
    * Date Optimized: July 11, 2023
    * Exersise #1342
    * Exercise Name: Number of steps to reduce a number to zero
    * Difficulty: Easy
    * Time Complexity: O(logn)
    * Space Complexity: O(n)
    * Language Used: Python
    * Tags: Math, Bit Manipulation
"""

"""
* Reduce a given number to 0 and counts the amount of steps taken
* Has a Parameter of nums, a number to be reduced to 0
* Returns the amount of steps taken to reach 0
"""
def numberOfSteps(num: int) -> int:
    # Initializes Variable that count steps
    steps = 0
    # While num is not equal to 0 keep looping
    while(num != 0):
        #if num is even then divide by 2
        if(num % 2 == 0):
            num /= 2
        else:
        #Else reduce the number by 1
            num-=1

        #Increment steps by 1
        steps+=1
    #Returns the amount of steps taken      
    return steps


class merge_strings:
    #Sample number
    num = 250
    #Prints the the console the amount of steps taken to reach 0
    print( str(numberOfSteps(num)) )
