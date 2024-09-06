package year2023.week11.lectures.exceptions.custom;

public class AgeLessThenZeroException extends Exception{
    public AgeLessThenZeroException(String message){
        super(message);
    }
    public AgeLessThenZeroException(Throwable cause){
        super(cause);
    }
    public AgeLessThenZeroException(String message, Throwable cause){
        super(message, cause);
    }
}
