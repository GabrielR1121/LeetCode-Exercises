public class reverse_string {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #344
     * Exercise Name: Reverse String
     * Difficulty: Easy
     * Time Complexity: O(logn)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Two Pointer, String
*/
    public static void main(String [] args) {
        //Sample String
        String sentence = "hello";
        reverseString(sentence.toCharArray());
    }
    /**
     * Reverse a string in place. 
     * @param s A string containg the words to reverse.
     */
    public static void reverseString(char[] s) {
        //Traverses to half the string and reverses in optimal time
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            //stores the variable in a temp 
            char temp = s[i];

            //swaps the variable
            s[i] = s[j];

            //stores the temp variable
            s[j] = temp;
        } 
        
    }
}