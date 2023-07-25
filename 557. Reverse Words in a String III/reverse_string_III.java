public class reverse_string_III {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #557
     * Exercise Name: Reverse String III
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Two Pointer, String
*/
public static void main(String[] args) {
    //Sample string
    String sentence = "Let's take LeetCode contest";

    //Prints the results to the console
    System.out.println(reverseWords(sentence));
    
}
/**
 * Reverses a sentence word for word 
 * @param s A sentence to be reversed
 * @return The reversed sentence
 */
    public static String reverseWords(String s) {
        //Creates a string builder to store the full reversed sentence
        StringBuilder full = new StringBuilder();

        //Splits the sentence by words
        String words [] = s.split(" ");

        //Traverses the words and filds each one individually
        for(int i =0; i < words.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            full.append(sb.reverse().toString());
        }
        
        return full.toString().trim();
    }
}