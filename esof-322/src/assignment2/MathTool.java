package assignment2;


public abstract class MathTool {
    protected SortBehavior sortBehavior;
    
    protected int[] mathSort(int[] data) {
        return sortBehavior.sort(data);
    }
    
    protected void setSortStrategy(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }
}
