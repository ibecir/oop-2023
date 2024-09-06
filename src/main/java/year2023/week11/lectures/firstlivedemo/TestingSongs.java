package year2023.week11.lectures.firstlivedemo;

public class TestingSongs {
    public static void main(String[] args) {
        SongsSystem system = new SongsSystem("songs.csv");
        Song s = system.getLongestSong();
        System.out.println(s);
    }
}
