public class merge_strings {
/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 7, 2023
 * Exersise #1768
 * Exercise Name: Merge Strings Alternately
 * Difficulty: Easy
 * Time Complexity: O(n), Based on the longest String.
 * Space Complexity: O(n), Based on the longest String.
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Java
 * Tags: Two Pointer, String
 */

    public static void main(String [] args) {
    //Example of Word1
    String word1 = "abc";

    //Example of Word2
    String word2 = "qrt";

    //Print new merged word.
    System.out.println(mergeAlternately(word1, word2));

    }
/**
 * Merges 2 strings together regardless of length of the 2 strings
 * @param word1 A String 
 * @param word2 A String 
 * @return The merged representation of both strings.
 */
    public static String mergeAlternately(String word1, String word2) {
        //Create a String Builder in order to store the new String
        StringBuilder sb = new StringBuilder(); 

        //Create an integer of index to keep track of where in the word we are transversing
        int index=0;

        //Regardless of word length keep travesring the loop until both words are merged
        while(index < word1.length() || index < word2.length()){

            //If word1 has not reached the end in length then keep adding to string builder
            if(index < word1.length())
                sb.append(word1.charAt(index));

            //If word2 has not reached the end in length then keep adding to string builder    
            if(index < word2.length())
                sb.append(word2.charAt(index));

            //Increase index by 1 for each loop 
            index++;
        }

        //Returns the merged word.
        return sb.toString();


    }
}