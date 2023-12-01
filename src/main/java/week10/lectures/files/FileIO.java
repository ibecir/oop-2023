package week10.lectures.files;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class FileIO {
    public static void simpleWrite(String text) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("output.txt")
        );
        bufferedWriter.write("Our first line \n");
        bufferedWriter.close();
    }
    public static void arrayFileWrite(String[] data) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("output.txt")
        );

        for (String row : data)
            bufferedWriter.write("\n" + row);

        bufferedWriter.close();
    }
    public static void simpleRead() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("output.txt")
        );
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
    public static void readWholeFileList() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("output.txt")
        );
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());

        for (String line : lines)
            System.out.println(line);

        bufferedReader.close();
    }
    public static void readWholeFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("output.txt")
        );
        String tempLine;
        while ((tempLine = bufferedReader.readLine()) != null){
            System.out.println(tempLine);
        }

        bufferedReader.close();
    }
    public static void main(String[] args) throws IOException {
        String[] names = {"Becir", "Adnan", "Amila"};
        arrayFileWrite(names);
        readWholeFile();
        readWholeFileList();
    }
}
