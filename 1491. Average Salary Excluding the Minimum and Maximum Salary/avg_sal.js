 /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #1491
     * Exercise Name: Average Salary Excluding the Minimum and Maximum Salary
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: Array, Sorting
*/

/**
 * Removes the max and min from the array and get the average
 * @param {number[]} salary The array with all the salaries
 * @return {number} The average without the max and min
 */
var average = function(salary) {

    //Creates a function to sum all the elements in the array
    let sum = salary.reduce(function(a, b){
      return a + b;
});
    //Substracts the max and min from the sum variable and calculates the function
 return (sum- Math.max(...salary) - Math.min(...salary)) / (salary.length-2);
};

//Sample array 
var arr = [4000,3000,1000,2000];

//Prints the result to the console
console.log(average(arr));