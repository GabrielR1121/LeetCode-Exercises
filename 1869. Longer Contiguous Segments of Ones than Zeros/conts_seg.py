"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 25, 2023
     * Exersise #1869
     * Exercise Name: Longer Contigoud Segments of Ones Than Zeros 
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Language Used: Python
     * Tags: tring
"""
def checkZeroOnes(self, s: str) -> bool:
        best_one, best_zero, current_one, current_zero = 0, 0, 0, 0
        
        for i in s:
            if i == "1":
                current_zero = 0
                current_one += 1
            else:
                current_zero += 1
                current_one = 0
                
            best_one = max(best_one, current_one)
            best_zero = max(best_zero, current_zero)
        
        return best_one > best_zero