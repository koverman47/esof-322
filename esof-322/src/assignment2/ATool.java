package assignment2;


public abstract class ATool {
    protected SortBehavior sorter;
    protected abstract int[] mathSort(int[] data); //check return types
    protected abstract void setSortStrategy();
}
