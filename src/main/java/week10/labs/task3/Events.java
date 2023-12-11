package week10.labs.task3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Events {
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int NUM_RECORDS = 1000000;

    private static void generateEventsFile(String fileName, int numRecords) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Random random = new Random();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (int i = 0; i < numRecords; i++) {
                String timestamp = dateFormat.format(new Date(System.currentTimeMillis() - random.nextInt(1000000000)));
                String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
                int userId = random.nextInt(1000);

                // Write the record to the file
                writer.write(timestamp + " | Event Type: " + eventType + " | User ID: " + userId);
                writer.newLine();
            }
        }
        System.out.println("Events log file generation complete.");
    }

    private static void readEventsFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int iteration = 0;

            while ((line = reader.readLine()) != null && iteration < 5) {
                System.out.println(line);

                if (!reader.ready()) {
                    // reader.reset();
                    iteration++;
                }
            }
        }
        System.out.println("Events log file reading complete.");
    }

    public static void main(String[] args) {
        String fileName = "events.txt";

        try {
            generateEventsFile(fileName, NUM_RECORDS);
            readEventsFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
