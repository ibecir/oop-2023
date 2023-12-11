package week11.lectures.firstlivedemo;

public class SongNotFoundExcepttion extends RuntimeException{
    public SongNotFoundExcepttion(String message){
        super(message);
    }
}
