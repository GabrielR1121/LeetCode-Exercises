"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #1491
     * Exercise Name: Average Salary Excluding the Minimum and Maximum Salary
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Array, Sorting
"""


"""
 * Removes the max and min from the array and get the average
 * @param salary The array with all the salaries
 * @return The average without the max and min
"""
def average(salary) -> float:
    #Calculate the sum of the salary and removes the max and min from the sum
    return (sum(salary) - max(salary) - min(salary))/(len(salary)-2)


#Sample Array
arr = [4000,3000,1000,2000]

#Prints the result to the console
print(average(arr))