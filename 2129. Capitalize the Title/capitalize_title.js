/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: March 26, 2022
     * Exersise #2129
     * Exercise Name: Capitalize the Title
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: JavaScript
     * Tags: String
     */

/**
 * Receives a string to return in its correctly capitalized format
 * @param {string} title A string with the sentence to capitalize correctly
 * @return {string} A string with a correctly capitalized structure
 */
var capitalizeTitle = function (title) {
    // Split the string by its whitespaces in order to verify each word in the
    // sentence.
    const arr = title.split(" ");

    // If the length of the world is less than or equal to 2 than turn the whole
    // word to lowercase
    // if not then capitalize the first letter of the word and minimize the rest.
    for (var i = 0; i < arr.length; i++)
        if (arr[i].length <= 2)
            arr[i] = arr[i].toLowerCase() + " ";
        else
            arr[i] = arr[i].charAt(0).toUpperCase() + arr[i].slice(1).toLowerCase() + " ";

    //Returns a string with the correct capitalization
    return arr.join("").trim();
};

//Sample String
var title = "capiTalIze tHe titLe";

//Prints the result to the console.
console.log(capitalizeTitle(title));