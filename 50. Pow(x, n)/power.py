"""
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 25, 2023
     * Exersise #50
     * Exercise Name: Pow(x,n)
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Python
     * Tags: Array, Sorting
"""


"""
* Raises n to the power of x
     * @param x The base value
     * @param n The exponent
     * @return The raised power of n to x
"""
def myPow(self, x: float, n: int) -> float:

        if n < 0: n, x = -n, 1/x

        stack, ans = deque(), 1
        
        while n:
            n, bit = divmod(n,2)
            stack.append(bit)    

        while stack:
            bit = stack.pop()
            ans*= ans
            if bit: ans*=x

        return ans