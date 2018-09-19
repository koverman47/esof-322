package assignment2;


public class InsertionSort implements SortBehavior {

    public InsertionSort() {}
    
    @Override
    public int[] sort(int[] data) {
        System.out.println("Insertion Sort Called!");
        for(int i = 1; i < data.length; i++) {
            int j = i;
            int temp = data[i];
            while(j > 0 && data[j - 1] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
        return data;
    }
    
}
