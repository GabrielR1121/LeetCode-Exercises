public class common_div {
/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 8, 2023
 * Exersise #1071
 * Exercise Name: Greatest Common Divisor of Strings
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Java
 * Tags: Math, String
 */
    public static void main(String [] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfStrings(str1,str2));

    }

    /**
     * finds the greatest common divisor of both strings
     * @param str1 A string representing the first string to verify
     * @param str2 A string representing the second string to verify
     * @return Returns a substring representing the greatest common divisors 
     */
    public static String gcdOfStrings(String str1, String str2) {
        //Checks if the string is not symetrical. if its not then return an empty string 
        if(!(str1 + str2).equals(str2+str1))
            return "";

        //Finds the greatest common divisor of both strings by using their lengths. 
        int stop = gcd(str1.length(), str2.length());

        //Returns a substring from the start of the string up until the gcd.
            return str1.substring(0, stop);
        }


    /**
     * Recursive helper method to find the gcd of both strings
     * @param x The length of the first string
     * @param y The length of the second string
     * @return A number representing the gcd of both strings.
     */
    public static int gcd(int x, int y) {
        //If the reminder is 0 then return x;
        if(y == 0)
            return x;

        // Recursive return
        return gcd(y, x % y);

        }
    }