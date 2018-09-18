package assignment2;


public class Mathematica extends ATool {

    public Mathematica() {
        sorter = new InsertionSort();
    }
    
    @Override
    protected int[] mathSort(int[] data) {
        return sorter.sort(data);
    }

    @Override
    protected void setSortStrategy() {
        
    }
    
}
