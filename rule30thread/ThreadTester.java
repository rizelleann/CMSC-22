package rulethirty;

import java.util.Scanner;

public class ThreadTester {

    public static final int THREAD_COUNT = 10;

    public static void main(String[] args) throws Exception {
        System.out.println("Enter size: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
   
        long startTime = System.currentTimeMillis();
      
        // create 10 Rule30Thread as workers
        Rule30Threads[] worker = new Rule30Threads[THREAD_COUNT];
        // divide total range to equal chunks..
        int integersPerThread = x / THREAD_COUNT;
        // starting point for first thread
        int start = 1;
        // end point for range of ints
        int end = start + integersPerThread - 1;

        // initialize the tasks of our workers by assigning them to chunks of work
        for (int i = 0; i < THREAD_COUNT; i++) {
            if (i == THREAD_COUNT - 1) {
                // make sure last thread processes up until x
                end = x;
            }
            worker[i] = new Rule30Threads(end);
            // Determine the range of ints for the next thread.
            start = end + 1;
            end = start + integersPerThread - 1;
        }

        // we want to wait for the workers to die before displaying the final results!
        int i;
        for (i = 0; i < THREAD_COUNT; i++) {
            worker[i].start();
            while (worker[i].isAlive()) {
                try {
                    worker[i].join();
                } catch (InterruptedException e) {
                    System.err.println("thread interrupted: " + e.getMessage());
                }
            }
        }

        worker[i - 1].displayCells();
        System.out.println("time consumed in ms: " + (System.currentTimeMillis() - startTime));

    }
}
