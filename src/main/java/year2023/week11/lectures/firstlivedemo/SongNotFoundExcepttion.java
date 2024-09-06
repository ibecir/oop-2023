package year2023.week11.lectures.firstlivedemo;

public class SongNotFoundExcepttion extends RuntimeException{
    public SongNotFoundExcepttion(String message){
        super(message);
    }
}
