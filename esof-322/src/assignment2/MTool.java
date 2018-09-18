package assignment2;


public class MTool extends ATool {
    
    public MTool() {
        sorter = new MergeSort();
    }

    @Override
    protected int[] mathSort(int[] data) {
        return sorter.sort(data);
    }

    @Override
    protected void setSortStrategy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
