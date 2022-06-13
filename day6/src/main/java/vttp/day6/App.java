package vttp.day6;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Box boxOfStrings = new Box();
        boxOfStrings.setContent("This is a string");

        Box boxOfInts = new Box();
        boxOfInts.setContent(3);

        // No type checking for box, because the 
        // content member is object
        boxOfInts.setContent(boxOfStrings);
        boxOfStrings.setContent("false");

        // Assigning Integer type to BoxG
        BoxG<Integer> bInt = new BoxG<Integer>();

        // Assigning String type to BoxG
        BoxG<String> bStr = new BoxG<String>();

        // Assigning List of String type to BoxG
        BoxG<List<String>> bList = new BoxG<List<String>>();

        // Assigning List of Float type to BoxG
        BoxG<BoxG<Float>> bFloat = new BoxG<BoxG<Float>>();

        // This is incorrect
        // bInt.setContent("Contenabct");
    }
}
