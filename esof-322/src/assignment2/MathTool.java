package assignment2;

/*
 * MathTool is abstract so that it can't be instantiated
 */
public abstract class MathTool {
    protected SortBehavior sortBehavior;
    
    protected int[] mathSort(int[] data) {
        return sortBehavior.sort(data);
    }
    
    protected void setSortStrategy(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }
}
