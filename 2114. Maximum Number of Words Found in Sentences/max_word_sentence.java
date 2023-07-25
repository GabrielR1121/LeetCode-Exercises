public class max_word_sentence {
/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 27, 2022
     * Exersise #2114
     * Exercise Name: Average Salary Excluding the Minimum and Maximum Salary
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, String
*/
    public static void main(String [] arg) {
        //Sample array
        String arr[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        //Prints the result to the console
        System.out.println(mostWordsFound(arr));

    }
    /**
     * Finds the sentence with the max amount of words 
     * @param sentences An array filled with sentences.
     * @return An integer with the max amount of words in the sentence.
     */
        public static int mostWordsFound(String[] sentences) {
            //spilts the sentence into words
            int max = sentences[0].split(" ").length;
            
            //Traverses the words and finds the max word
            for(int i =1; i <= sentences.length-1; i++)
                if(max <= sentences[i].split(" ").length)
                    max = sentences[i].split(" ").length;
            
            //Returns the max length
            return max;
        }
}