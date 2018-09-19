package assignment2;


public class BubbleSort implements SortBehavior {
    
    public BubbleSort() {}

    @Override
    public int[] sort(int[] data) {
        System.out.println("Bubble Sort Called!");
        for(int i = 0; i < data.length - 1; i++) {
            boolean swap = false;
            for(int j = 1; j < data.length; j++) {
                if(data[j - 1] > data[j]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                    swap = true;
                }
            }
            
            /*
             * If no swaps made, assume sorted - return
             */
            if(!swap) {
                return data;
            }
        }
        return data;
    }
    
}
