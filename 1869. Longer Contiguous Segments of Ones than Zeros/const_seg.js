/**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 23, 2023
     * Exersise #1869
     * Exercise Name: Longer Contigoud Segments of Ones Than Zeros 
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * Language Used: JavaScript
     * Tags: String
*/

/**
 * @param {string} s
 * @return {boolean}
 */
var checkZeroOnes = function(s) {
    s+=(1-s[s.length-1]);
    let max0=max1=0, start=0;
    for(let i=1; i<s.length; i++){
        if(s[i]!=s[i-1] && s[i]==1){
            max0=Math.max(max0, i-start); start=i;
        }
        if(s[i]!=s[i-1] && s[i]==0){
            max1=Math.max(max1, i-start); start=i;
        }
    }
    return max1>max0;
};