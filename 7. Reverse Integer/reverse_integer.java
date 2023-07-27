public class reverse_integer {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: Abril 4, 2022
     * Exersise #7
     * Exercise Name: Reverse Integer
     * Difficulty: Medium
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Math
*/
    public static void main(String[] args) {
        //Sample Number
        int num = 123;

        //Prints the results to the console
        System.out.println(reverse(num));
    }
    /**
     * Reverses an integer unless the integer is bigger than what an integer can hold
     * @param x An integer
     * @return Either the reversed integer or 0
     */
    public static int reverse(int x) {
        //Creates a flag to determine if the number is negative or not and remove the negative
        boolean flag = false;
        if(x<0){
            x *= -1;
            flag = true;
        }
        
        //Reverses the given number
        StringBuilder sb = new StringBuilder(x+"").reverse();
        
        //Trys to return the reversed number of the string. Adds the negative if flag was true
        //The code returns 0 if the reversed version of the number was either too big or small to be stored in an Int.
        try{
        if(flag)
            return -1 * Integer.parseInt(sb.toString());
        else
            return Integer.parseInt(sb.toString());
        }catch(Exception e){
            return 0;
        }
        
        
            
        
    }

}