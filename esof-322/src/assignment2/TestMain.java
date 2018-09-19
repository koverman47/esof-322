/*
 * Just checking that the sorting methods were implemented correctly
*/

package assignment2;

import java.util.Arrays;


public class TestMain {

    public static void main(String[] args) {
        SortBehavior sorter = new MergeSort();
        
        int[] data = {0, 4, 8, 3, 2, 5, 6, 9, 7, 1};
        
        System.out.println(Arrays.toString(sorter.sort(data)));
    }
}
