import java.util.ArrayList;
import java.util.List;

public class fizz_buzz {
     /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 15, 2022
     * Date Optimized: July 12, 2023
     * Exersise #412
     * Exercise Name: Fizz Buzz
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Math, String, Simulation
     */
    public static void main(String [] args){
        //Sample Number
        int n = 100;
        //Prints to the console the resulting arraylist.
        System.out.println(fizzBuzz(n));
    }

    /**
     * Going from 1 to n returns an array filled with Fizz, Buzz, FizzBuzz or the number depending
     * on if the number is divisible by 5 AND 3 or just divisible by 3 or just divisible by 5 or neither
     * @param n A number that will serve as a limit and range from 0 to n
     * @return An array filled with either Fizz, Buzz, FizzBuzz Or n
     */
    public static List<String> fizzBuzz(int n) {
        //Creating an array list to store the results. 
       ArrayList<String> arr = new ArrayList<String>();

       //Loop that increases n by one with each iteration.
       for(int number =1; number <= n; number++){
            //Checks if number is divisible by 3 AND 5
           if(number %3 == 0 && number%5==0)
                //If true add FizzBuzz to arraylist
                arr.add("FizzBuzz");
            //Check if number is divisible by 3
            else if(number%3 ==0)
                //if true add Fizz to arraylist
                arr.add("Fizz");
            //Check if number id divisible by 5
            else if(number%5==0)
                //if true add buzz to arraylist
                arr.add("Buzz");
            //If none of the other conditions are true
            else 
                //Add the plain number to the arraylist
                arr.add(number+"");
       }
       //Returns the list filled with Fizz, Buzz, FizzBuzz or the number
        return arr;
    }
}