public class detect_capital {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 26, 2022
     * Exersise #520
     * Exercise Name: Detect Capital
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: String
     */
    public static void main(String[] args) {
        // Sample String
        String word = "USA";
        // Prints the result to the console.
        System.out.println(detectCapitalUse(word));
    }

    /**
     * Checks if the capital usage of the word is correct or not
     * 
     * @param word Receives the string to be checked
     * @return True or False depending on wether the word is correctly using capital
     *         letters.
     */
    public static boolean detectCapitalUse(String word) {

        // Create an array of characters in order to use isUppercase and isLowerCase()
        char arr[] = word.toCharArray();

        // initialize the counter variables
        int countUpper = 0;
        int countLower = 0;

        // Runs through the character array and counts the amount of uppercase and
        // lowercase within the word.
        for (int i = 0; i <= arr.length - 1; i++)
            if (Character.isUpperCase(arr[i]))
                countUpper++;
            else
                countLower++;
        // Valid answer:
        // * The first character is Upper case and there is only 1 uppercase letter and
        // the rest lowercase
        // * The upper counter is the same length of the word
        // * The lower counter is the same as the word
        if ((Character.isUpperCase(arr[0]) && countUpper == 1 && countLower == arr.length - 1)
                || countUpper == arr.length || countLower == arr.length)
            return true;
        else
            return false;

    }

}