package assignment2;


public abstract class ATool {
    protected SortBehavior sortBehavior;
    
    protected int[] mathSort(int[] data) {
        return sortBehavior.sort(data);
    }
    
    protected void setSortStrategy(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }
}
