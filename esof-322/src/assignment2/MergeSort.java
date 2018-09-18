package assignment2;


public class MergeSort implements SortBehavior {

    public MergeSort() {}
    
    @Override
    public int[] sort(int[] data) {
        if(data.length == 1) {
            return data;
        }
        
        int middle = data.length / 2;
        
        int[] left = new int[data.length / 2];
        int[] right = new int[data.length / 2 + (data.length % 2 == 0 ? 0 : 1)];
        
        System.arraycopy(data, 0, left, 0, left.length);
        System.arraycopy(data, left.length, right, 0, right.length);
        
        left = sort(left);
        right = sort(right);
        
        int x = 0;
        int y = 0;
        int counter = 0;
        
        int[] sorted = new int[data.length];
        
        while(x < left.length && y < right.length) {
            if(left[x] < right[y]) {
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
