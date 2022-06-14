package vttp.day6;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

        // Create a thread pool
        ExecutorService thrPool = Executors.newFixedThreadPool(4);
        Random rand = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            String msg = "Thread-%d".formatted(i);
            int sec = rand.nextInt(1,5);
            System.out.printf("\tDispatching %s to pool\n", msg);

            ThrMain thr = new ThrMain(msg, sec);
            thrPool.submit(thr);
        }
        System.out.println("Main thread: Dispatched all thread");
    }
}
