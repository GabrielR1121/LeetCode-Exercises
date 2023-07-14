public class capitalize_title {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 26, 2022
     * Exersise #2129
     * Exercise Name: Capitalize the Title
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: String
     */
    public static void main(String[] args) {
        // Sample String
        String title = "capiTalIze tHe titLe";
        // Prints the result to the console.
        System.out.println(capitalizeTitle(title));

    }

    public static String capitalizeTitle(String title) {
        // Split the string by its whitespaces in order to verify each word in the
        // sentence.
        String arr[] = title.split(" ");
        // Initialize the string builder where the new sentence wil be stored.
        StringBuilder sb = new StringBuilder();

        // Runs through the whole array
        // If the length of the world is less than or equal to 2 than turn the whole
        // word to lowercase
        // if not then capitalize the first letter of the word and minimize the rest.
        for (int i = 0; i <= arr.length - 1; i++)
            if (arr[i].length() <= 2)
                sb.append(arr[i].toLowerCase() + " ");
            else
                sb.append(Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1).toLowerCase() + " ");
        // Return the correctly capitalized sentence.
        return sb.toString().trim();
    }

}