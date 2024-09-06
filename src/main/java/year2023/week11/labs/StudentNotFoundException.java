package year2023.week11.labs;

import java.util.NoSuchElementException;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}