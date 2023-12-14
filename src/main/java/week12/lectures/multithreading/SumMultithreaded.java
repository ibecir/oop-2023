package week12.lectures.multithreading;

import java.util.Random;

/*
Creating a multithreaded application in Java can demonstrate performance improvements
when dealing with concurrent tasks. One classic example is a simple program that
calculates the sum of elements in an array. Here's a basic outline of a Java program
that calculates the sum using a single thread and then with multiple threads:

In this example, the calculateSumMultiThreaded method divides the array into segments,
assigns each segment to a separate thread, and calculates partial sums concurrently.
The final sum is then obtained by combining these partial sums. The performance improvement
is more noticeable for larger arrays and more computationally intensive tasks. Keep in
mind that not all problems benefit from multithreading, and managing threads introduces
additional complexity and potential issues, such as race conditions and synchronization
problems.
* */
public class SumMultithreaded {

    private static final int ARRAY_SIZE = 100_000_000;
    private static final int NUM_THREADS = 4;

    private static int[] array = new int[ARRAY_SIZE];

    public static void main(String[] args) {
        // Initialize array with random values
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(100);
        }

        // Single-threaded sum calculation
        long startTime = System.currentTimeMillis();
        int singleThreadedSum = calculateSumSingleThreaded();
        long endTime = System.currentTimeMillis();
        System.out.println("Single-threaded sum: " + singleThreadedSum);
        System.out.println("Single-threaded time: " + (endTime - startTime) + " ms");

        // Multithreaded sum calculation
        startTime = System.currentTimeMillis();
        int multiThreadedSum = calculateSumMultiThreaded();
        endTime = System.currentTimeMillis();
        System.out.println("Multithreaded sum: " + multiThreadedSum);
        System.out.println("Multithreaded time: " + (endTime - startTime) + " ms");

    }

    private static int calculateSumSingleThreaded() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private static int calculateSumMultiThreaded() {
        int[] partialSums = new int[NUM_THREADS];
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int partialSum = 0;
                for (int j = threadIndex; j < ARRAY_SIZE; j += NUM_THREADS) {
                    partialSum += array[j];
                }
                partialSums[threadIndex] = partialSum;
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Combine partial sums
        int sum = 0;
        for (int partialSum : partialSums) {
            sum += partialSum;
        }
        return sum;
    }
}
