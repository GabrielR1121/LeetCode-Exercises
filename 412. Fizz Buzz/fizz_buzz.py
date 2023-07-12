"""
    * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 12, 2023
     * Exersise #412
     * Exercise Name: Fizz Buzz
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Math, String, Simulation
"""

"""
    * Going from 1 to n returns an array filled with Fizz, Buzz, FizzBuzz or the number depending
    * on if the number is divisible by 5 AND 3 or just divisible by 3 or just divisible by 5 or neither
    * @param n A number that will serve as a limit and range from 0 to n
    * @return An array filled with either Fizz, Buzz, FizzBuzz Or n
"""
def fizzBuzz(n: int):
    #Using list comprehension to fill a list with FizzBuzz, Fizz, Buzz or a number
    return ["FizzBuzz" if x%3== 0 and x%5 ==0 
            else "Fizz" if x%3==0 
                else  "Buzz" if x%5==0 
                    else str(x) 
                        for x in range(1,n+1)]
#Sample number
n = 100
#Prints the resulting list to the console.
print(fizzBuzz(n))