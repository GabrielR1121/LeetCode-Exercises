public class last_word {
 /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #58
     * Exercise Name: Length of Last Word
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: String
*/
    public static void main(String [] args) {
        //Sample String
        String sentence = "Hello World";

        //Prints the result to the console
        System.out.println(lengthOfLastWord(sentence));
    }
    /**
     * Given a string will return the length of its last word
     * @param s A string 
     * @return The length of the last word.
     */
    public static int lengthOfLastWord(String s) {
        //splits the sentence into words
        String arr[] = s.split(" ");

        //Returns the length of the last word.
        return arr[arr.length-1].length();
    }
}