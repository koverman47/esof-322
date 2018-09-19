package assignment2;

import java.util.Arrays;
import java.util.Scanner;


public class Client {
    
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // Don't need to try-catch
        MathTool tool;
        
        /*
         * Prompt user to select a Software Tool
         */
        System.out.println("Which Educational Math Software would you like to use?");
        System.out.println("Enter 1 for Mathematica.\nEnter 2 for MTool.\nEnter 3 for MyMath.");
        
        int softwareChoice = Integer.parseInt(console.nextLine()); // Get user option
        
        if(softwareChoice == 1) {
            tool = new Mathematica();
        }
        else if(softwareChoice == 2) {
            tool = new MTool();
        }
        else if(softwareChoice == 3) {
            tool = new MyMath();
        }
        else {
            tool = new Mathematica(); // default tool
        }
        
        int[] data = {0, 4, 8, 3, 2, 5, 6, 9, 7, 1}; // Data to be sorted
        
        System.out.println(Arrays.toString(tool.mathSort(data))); // Print sorted array

        /*
         * Prompt user to change the sorting method
         */
        System.out.println("Which sorting strategy would you like to use?");
        System.out.println("Enter 1 for Merge Sort.\nEnter 2 for Insertion Sort.\nEnter 3 for Bubble Sort.");
        
        int sortChoice = Integer.parseInt(console.nextLine()); // Get user option
        
        if(sortChoice == 1) {
            tool.setSortStrategy(new MergeSort());
        }
        else if(sortChoice == 2) {
            tool.setSortStrategy(new InsertionSort());
        }
        else if(sortChoice == 3) {
            tool.setSortStrategy(new BubbleSort());
        }
        
        /*
         * Recreated the data array because Java passes arrays by reference
         */
        int[] data2 = {0, 4, 8, 3, 2, 5, 6, 9, 7, 1};
        
        System.out.println(Arrays.toString(tool.mathSort(data2))); // Print sorted array
        
        console.close();
    }
}
