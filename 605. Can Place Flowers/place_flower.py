"""
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 29, 2023
 * Exersise #605
 * Exercise Name: Can Place Flower
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Python
 * Tags: Array, Greedy
"""


"""
    * Places flowers in nonadjacent locations
    * @param flowerbed An Integer array with 0's and 1's
    * @param n The amount of flowers available to plants
    * @return Boolean value if the amount of flowers can be planted in the flowerbed
"""
def canPlaceFlowers(flowerbed, n: int) -> bool:
        #Creates a copy of flowerbed
        newDirt = flowerbed[:]
        #Adds a 0 to the start and finish of the new array
        newDirt.insert(0,0)
        newDirt.append(0)

        #Traverses the array
        for i in range(1,len(newDirt)-1):
            #If 000 is found
            if(newDirt[i-1] == 0 and newDirt[i] == 0 and newDirt[i+1] == 0):
                #Substract the amount of flowers needed to plant
                n-=1
                #Plant the flower
                newDirt[i] = 1

            #If all flowers were planted
            if(n==0):
                #Return true
                return True
        #If more than the required flowers were planted return true
        # If not all the flowers were planted return false
        return n<=0