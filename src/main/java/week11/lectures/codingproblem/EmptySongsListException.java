package week11.lectures.codingproblem;

import java.util.NoSuchElementException;

public class EmptySongsListException extends NoSuchElementException {
    public EmptySongsListException() {

    }

    public EmptySongsListException(String message) {
        super(message);
    }

    public EmptySongsListException(Throwable cause) {
        super(cause);
    }
}
