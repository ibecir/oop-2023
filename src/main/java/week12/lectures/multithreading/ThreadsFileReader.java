package week12.lectures.multithreading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThreadsFileReader extends Thread {
    private List<String> result;
    private String fileName;

    public ThreadsFileReader(String fileName) {
        this.fileName = fileName;
        this.result = new ArrayList<>();
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(this.fileName));
            List<String> lines = reader.lines().collect(Collectors.toList());
            for(String line : lines){
                if(line.contains("Bermuda"))
                    result.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("IN THREAD Elapsed Time: " + elapsedTime + " milliseconds");
    }

    public List<String> getResult() {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime) + " ms");

        return this.result;


    }
}
