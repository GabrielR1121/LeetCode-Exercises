"""
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 25, 2023
    * Exersise #7
    * Exercise Name: Reverse Integer
    * Difficulty: Medium
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Language Used: Java
    * Tags: Math
"""


"""
    * Reverses an integer unless the integer is bigger than what an integer can hold
    * @param x An integer
    * @return Either the reversed integer or 0
"""
def reverse(x: int) -> int:
        #Variable used to store the reversed integer
        res = 0

        #Determines the sign of the integer
        sign = -1 if x < 0 else 1

        #Removes the sign from the integer
        x *= sign

        #Math procees for flipping the integer
        while x>0:
            res = res * 10 + x % 10
            x //=10

        #If the reverse of the number is larger than what an integer can hold then return 0
        if sign * res < -2**31 or sign * res > 2**31 - 1:
            return 0
        
        #Returns the flipped number with the appropiate sign 
        return res * sign



#Sample Integer
num = 123

#Prints the result to the console
print(reverse(num))