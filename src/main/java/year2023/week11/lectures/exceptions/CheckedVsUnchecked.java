package year2023.week11.lectures.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        printLength(null);
    }

    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFileThrowable(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
    }

    public static void printLength(String myString){
        System.out.println(myString.length());
    }
}


