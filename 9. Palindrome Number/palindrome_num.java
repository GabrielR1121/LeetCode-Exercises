public class palindrome_num {
    public static void main(String[] args) {

    }

    /**
     * Checks if a number is a palindrome
     * 
     * @param x A number
     * @return True or Flase depending on if the number is a palindrome or not
     */
    public boolean isPalindrome(int x) {

        // Stores the original number and converts it to a string.
        // We do this because String Builder has the method called reverse. Which
        // reverses the string within the string builder.
        StringBuilder sb = new StringBuilder(x + "");

        // Checks if the string and the reverse of the string are the same.
        if (Integer.toString(x).equals(sb.reverse().toString()))
            return true;
        return false;
    }
}