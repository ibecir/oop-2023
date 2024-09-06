package year2023.week10.lectures.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FilesIo {

    public static void main(String[] args) {

    }

    public static void createFile() {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createFileNio() {
        try {
            Path path = Paths.get("example.docx");
            Files.createFile(path);
            System.out.println("File created: " + path.getFileName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example.csv"));
            bw.write("Hello, this is a sample text.");
            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("example.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile() {
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}