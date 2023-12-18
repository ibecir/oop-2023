package week11.lectures.firstlivedemo;

import java.util.Optional;

public class TestingSongs {
    public static void main(String[] args) {
        SongsSystem system = new SongsSystem("songs.csv");
        Song s = system.getLongestSong();
        System.out.println(s);
    }
}
