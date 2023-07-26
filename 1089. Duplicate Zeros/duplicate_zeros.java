public class duplicate_zeros {
    /**
     * Solved By: Gabriel E. Rodriguez Garcia
     * Date Completed: July 25, 2023
     * Exersise #1089
     * Exercise Name: Duplicate Zeros
     * Difficulty: Easy
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Language Used: Java
     * Tags: Array, Two Pointer
*/
    public static void main(String[] args) {
        //Sample Array 
        int arr[] = {1,0,2,3,0,4,5,0};
       

        duplicateZeros(arr);

    }
    /**
     * Duplicates all zeros in the array
     * @param arr An array filled with integers
     */
    public static void duplicateZeros(int[] arr) {
        //Counts the amount of zeros
        int zeros = 0;
    
        //traverses the array to locate all the zeros
        for (int a : arr)
          if (a == 0)
            ++zeros;
    
        //Doubles all zeros found within the array
        for (int i = arr.length - 1, j = arr.length + zeros - 1; i < j; --i, --j) {
          if (j < arr.length)
            arr[j] = arr[i];
          if (arr[i] == 0)
            if (--j < arr.length)
              arr[j] = arr[i];
        }
      }
}