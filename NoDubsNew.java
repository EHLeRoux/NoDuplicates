
// Author: Eduard Le Roux
package Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class NoDubsNew {
	
	/*
	 * This method takes in an array of Integers and replaces duplicates with a null value
	 */

    public static Integer[] removeDup(Integer[] array) {
        int count = 0;

        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    ++count;
                    if (count >= 2) {
                        array[j] = null;
                    }
                }
            }

            count = 0;
        }

        return array;
    }

    /*
     * This method takes in the array of the Integers where duplicates were changed to null values and 
     * stores the values into a new arraylist where the duplicates are removed
     */
    public static List<Integer> removeDup2(Integer[] array) {
        List<Integer> userNumbers = new ArrayList();
        int tempArraySize = array.length;

        for(int i = 0; i < tempArraySize; ++i) {
            if (array[i] != null) {
                userNumbers.add(array[i]);
            }
        }

        return userNumbers;
    }

    /*
     * Main method where both methods are called 
     */
    public static void main(String[] args) {
        Integer [] array = new Integer []{20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9, 0};
        System.out.println("---------------Orignal Array-------------");
        System.out.println(Arrays.toString(array));
        System.out.println("\n---------------Removing duplicates-------------");
        System.out.println(Arrays.toString(removeDup(array)));
        System.out.println("\n---------------new Array without duplicates-------------");
        System.out.println(removeDup2(array));
    }
}
