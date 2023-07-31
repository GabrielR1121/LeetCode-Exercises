public class reverse_vowels {
/**
    * Solved By: Gabriel E. Rodriguez Garcia
    * Date Completed: July 31, 2023
    * Exersise #345
    * Exercise Name: Reverse Vowels of a String
    * Difficulty: Easy
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    * Study Plan: LeetCode 75
    * Category: Array / String 
    * Language Used: Java
    * Tags: Two Pointer, String
 */
    public static void main(String[] args) {
        //Sample Data 
        String word = "leetcode";
        //Prints the result to the console
        System.out.println(reverseVowels(word));
    }
    /**
     * Reverses all vowels found in a string
     * @param s A String containing a vowels to reverse
     * @return A string with the vowels reversed.
     */
    public static String reverseVowels(String s) {
        //Staring index
       int start = 0;
       //Ending index
       int end = s.length()-1;
       //Array filled with each character in the word
       char letters[] = s.toCharArray();

       //Traverse the array from the start and the end at the same time
       while(start<end) {
            //If the letter isnt a vowel move to the next letter
           if(!isVowel( letters[start]) )
                start++;
            
            //If the letter is not a vowel move to the next letter
            if(!isVowel( letters[end]) )
                end--;

            
                //If both current letters are vowels then swap them
            if( isVowel(letters[start]) && isVowel(letters[end]) ) {
                //Store the start variable in a temporary variable
                char temp = letters[start];

                //Replace the start with the end vowel
                letters[start] = letters[end];

                //Replace the end with the temporary vowel
                letters[end] = temp;

                //Move to the next letter 
                start++; 
                //Move to the next letter
                end--;
            }

       }

       
       //Returns the joined string of the letters array
       return String.valueOf(letters);
    }
    /**
     * Checks if a letter is a vowel or not
     * @param x a character to be checked
     * @return Boolean value if the letter is a vowel or not.
     */
    public static boolean isVowel(char x) {
        return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U');
    }

}