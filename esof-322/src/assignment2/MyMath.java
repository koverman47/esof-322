package assignment2;


public class MyMath extends ATool {
    
    public MyMath() {
        sorter = new BubbleSort();
    }

    @Override
    protected int[] mathSort(int[] data) {
        return sorter.sort(data);
    }

    @Override
    protected void setSortStrategy() {
        
    }
    
}
