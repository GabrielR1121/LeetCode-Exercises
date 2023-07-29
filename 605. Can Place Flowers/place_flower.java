public class place_flower {
/**
 * Solved By: Gabriel E. Rodriguez Garcia
 * Date Completed: July 29, 2023
 * Exersise #605
 * Exercise Name: Can Place Flower
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Study Plan: LeetCode 75
 * Category: Array / String 
 * Language Used: Java
 * Tags: Array, Greedy
 */
    public static void main(String[] args) {
        //Sample data 
        int flowerbed[] = {1,0,0,0,1};
        int n = 1;

        //Prints the result to the console
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    /**
     * Places flowers in nonadjacent locations
     * @param flowerbed An Integer array with 0's and 1's
     * @param n The amount of flowers available to plants
     * @return Boolean value if the amount of flowers can be planted in the flowerbed
     */
     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
                //Creates a new array to add more values to the array
                int[] newDirt = new int[flowerbed.length + 2];
                //Copies the old array into the new array but added 0's at the start and finsih of the new arary
                System.arraycopy(flowerbed, 0, newDirt, 1, flowerbed.length);

                //Traverses the array
            for(int i =1; i < newDirt.length-1; i++) {
                    //If 000 is found
                    if(newDirt[i-1] == 0 &&  newDirt[i] == 0 && newDirt[i+1] ==0){
                        //Turn the middle 0 into a 1
                        newDirt[i] = 1;
                        //Subtract the amount of flowers needed to plant
                        n--;
                    } 
                
                //If all flowers were planted
                if(n == 0)
                    //Return true;
                    return true;

                

            }
            //Check if all flowers were planted or not
            return n<=0;
        
        
    }
}