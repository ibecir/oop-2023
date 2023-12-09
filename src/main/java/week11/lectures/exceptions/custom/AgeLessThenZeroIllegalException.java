package week11.lectures.exceptions.custom;

public class AgeLessThenZeroIllegalException extends IllegalArgumentException{
    public AgeLessThenZeroIllegalException(String message){
        super(message);
    }
    public AgeLessThenZeroIllegalException(Throwable cause){
        super(cause);
    }
    public AgeLessThenZeroIllegalException(String message, Throwable cause){
        super(message, cause);
    }
}
