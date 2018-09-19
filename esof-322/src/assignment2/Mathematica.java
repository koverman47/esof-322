package assignment2;

/*
 * Mathematica receives two methods implemented in super class:
 *  - mathSort()
 *  - setSortBehavior
 */
public class Mathematica extends MathTool {

    public Mathematica() {
        sortBehavior = new InsertionSort(); // field inherited by super class
    }
 
}
