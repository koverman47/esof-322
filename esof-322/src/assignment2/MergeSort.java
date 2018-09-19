package assignment2;


public class MergeSort implements SortBehavior {

    public MergeSort() {}
    
    @Override
    public int[] sort(int[] data) {
        System.out.println("Merge Sort Called!");
        if(data.length == 1) { // Recursion base case
            return data;
        }
        
        /*
         * Divide / partition
         */
        int middle = data.length / 2;
        
        int[] left = new int[middle];
        int[] right = new int[middle + (data.length % 2 == 0 ? 0 : 1)];
        
        System.arraycopy(data, 0, left, 0, left.length); // Create 'left' partition
        System.arraycopy(data, left.length, right, 0, right.length); // Create 'right' partition
        
        /*
         * Recursively sort two partitions
         */
        left = sort(left);
        right = sort(right);
        
        
        /*
         * Conquer / merge
         */
        int x = 0;
        int y = 0;
        int counter = 0; // loop invariant := counter = x + y
        
        int[] sorted = new int[data.length];
        
        while(x < left.length && y < right.length) {
            if(left[x] < right[y]) { // Sort ascending order
                sorted[counter++] = left[x++];
            }
            else {
                sorted[counter++] = right[y++];
            }
        }
        
        while(x < left.length) {
            sorted[counter++] = left[x++];
        }
        
        while(y < right.length) {
            sorted[counter++] = right[y++];
        }
     
        return sorted;
    }
    
}
