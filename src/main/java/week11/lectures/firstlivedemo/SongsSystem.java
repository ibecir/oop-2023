package week11.lectures.firstlivedemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SongsSystem {
    private List<Song> songs;

    public SongsSystem(String fileName) {
        try {
            songs = loadSongsFromFile(fileName);
        } catch (IOException e) {
            System.out.println("Unable to read a file");
        }
    }

    public static List<Song> loadSongsFromFile(String fileName) throws IOException {
        List<Song> songs = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for (String line : lines) {
            String[] parsedLine = line.split(",");
            Song temp = new Song(parsedLine[0] == "" ? 0 : Integer.parseInt(parsedLine[0]), parsedLine[1], parsedLine[2], parsedLine[3], parsedLine[4] == "" ? 1 : Double.parseDouble(parsedLine[4]), parsedLine[5] == "" ? 2 : Double.parseDouble(parsedLine[5]));
            songs.add(temp);
        }
        bufferedReader.close();
        return songs;
    }

    public Optional<Song> getSongById(int id) {
        for (Song song : this.songs) {
            if (song.id() == id)
                return Optional.of(song);
        }
        throw new SongNotFoundExcepttion("Song could not be found");
    }

    public Song getLongestSong() {
        Song longestSong = songs.get(0);
        for (Song song : this.songs) {
            if (song.length() > longestSong.length())
                longestSong = song;
        }
        return longestSong;
    }
}
