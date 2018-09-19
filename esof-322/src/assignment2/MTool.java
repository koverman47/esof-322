package assignment2;

/*
 * MTool receives two methods implemented in super class:
 *  - mathSort()
 *  - setSortBehavior
 */
public class MTool extends MathTool {
    
    public MTool() {
        sortBehavior = new MergeSort(); // field inherited by super class
    }

}
