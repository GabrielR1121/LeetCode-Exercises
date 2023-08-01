public class reverse_string{
/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 31, 2023
 * Exersise #151
 * Exercise Name: Reverse Words in a String
 * Difficulty: Medium
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Java
 * Tags: Two Pointer, String
 */

 public static void main(String[] args) {
    //Sample Data
     String s = "The sky is blue";
    //Prints the result to the console
    System.out.println(reverseWords(s));
 }

 /**
  * Reverses a sentence
  * @param s A string with the sentence to be reversed
  * @return The reversed sentence
  */
 public static String reverseWords(String s) {
    //Creates an instance of stringbuilder
    StringBuilder sb = new StringBuilder();

    //Splits the word by the whitespace no matter how big it is
    String words[] = s.split("\\s+");

    //Reverses the word
    for(int i =words.length-1; i>= 0; i--)
            sb.append(words[i] + " ");

    //Removed trailing and leading whitespaces and prints the reversed sentence
    return sb.toString().trim();  
  }
}