public class prefix_word {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: April 5, 2022
     * Date Optimized: July 15, 2023
     * Exersise #2000
     * Exercise Name: Reverse Prefix of Word
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: String, Two-Pointer
     */
    public static void main(String [] args) {
        //Sample String
        String word = "abcdefd";
        //Sample Char
        char chr = 'd';

        //Prints the result to the console
        System.out.println(reversePrefix(word,chr));



    }
    /**
     * reverses a givin string up until a given index 
     * @param word a string with a word
     * @param ch a character that is to be found in the string
     * @return a reversed prefix
     */
    public static String reversePrefix(String word, char ch) {
        //Finds the index of the given character
        int index = word.indexOf(ch);

        //Stores the prefix of the word in the string builder
        StringBuilder sb = new StringBuilder(word.substring(0,index+1));


        //Reverses the prefix and concatenates it back into the word
        return sb.reverse().toString() + word.substring(index+1);
       
    }
}