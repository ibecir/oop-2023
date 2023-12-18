package week12.lectures.multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilesMultithreaded {
    private static final int NUM_OF_THREADS = 4;

    public static void main(String[] args) {
        searchFileMultithreaded("Bosnia and Herzegovina");
        searchFile("Bosnia and Herzegovina");
    }

    public static List<String> readFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            List<String> lines = reader.lines().collect(Collectors.toList());
            reader.close();
            return lines;
        } catch (Exception e) {
            System.out.println("Exception happened in the reading file");
        }
        return null;
    }

    public static void searchFileMultithreaded(String searchCriteria) {
        List<String> searchResult = new ArrayList<>();
        List<Thread> threadPool = new ArrayList<>();
        List<String> lines = readFile("covid-cases.csv");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_OF_THREADS; i++) {
            final int threadIndex = i;
            Thread thread = new Thread(() -> {
                for (int j = threadIndex; j < lines.size(); j += NUM_OF_THREADS) {
                    if (lines.get(j).contains(searchCriteria)) searchResult.add(lines.get(j));
                }
            });
            thread.start();
            threadPool.add(thread);
        }

        for (Thread thread : threadPool) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("MULTITHREADED - Elapsed Time: " + elapsedTime + " milliseconds");
    }

    public static void searchFile(String searchCriteria) {
        List<String> searchResult = new ArrayList<>();
        List<String> lines = readFile("covid-cases.csv");

        long startTime = System.currentTimeMillis();

        for (String line : lines) {
            if (line.contains(searchCriteria)) searchResult.add(line);
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("SINGLE-THREADED - Elapsed Time: " + elapsedTime + " milliseconds");
    }
}
