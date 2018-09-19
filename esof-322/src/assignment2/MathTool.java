package assignment2;

/*
 * MathTool is abstract so that it can't be instantiated
 */
public abstract class MathTool {
    protected SortBehavior sortBehavior;
    
    protected int[] mathSort(int[] data) {
        System.out.println("mathSort() called!");
        return sortBehavior.sort(data);
    }
    
    protected void setSortStrategy(SortBehavior sortBehavior) {
        System.out.println("setSortStrategy() called!");
        this.sortBehavior = sortBehavior;
    }
}
