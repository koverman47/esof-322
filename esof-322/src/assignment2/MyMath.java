package assignment2;

/*
 * MyMath receives two methods implemented in super class:
 *  - mathSort()
 *  - setSortBehavior
 */
public class MyMath extends MathTool {
    
    public MyMath() {
        sortBehavior = new BubbleSort(); // field inherited from super class
    }

}
