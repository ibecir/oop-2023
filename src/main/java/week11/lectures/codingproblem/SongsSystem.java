package week11.lectures.codingproblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class SongsSystem {
    List<Song> songs;

    public SongsSystem(String filename) {
        try {
            songs = readSongs(filename);
        } catch (IOException e) {
            songs = new ArrayList<>();
            System.out.println("Unable to read songs");
        }
    }

    public static void main(String[] args) throws IOException {
        SongsSystem system = new SongsSystem("songs.csv");

        for (Song song : system.songs) {
            System.out.println(String.valueOf(song.id()) + song.trackName());
        }

        Optional<Song> s = system.getSongById(31);

        Song highestPopularitySong = system.getHighestPopularitySong();
        System.out.println(highestPopularitySong);

        Song longestSong = system.getLongestSong();
        System.out.println(longestSong);
    }

    public static List<Song> readSongs(String filename) throws IOException {
        List<Song> songs = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<String> lines = bufferedReader.lines().collect(Collectors.toList());
        for (String line : lines) {
            String[] songParts = line.split(",");
            Song s = new Song(
                    songParts[0] != "" ? Integer.parseInt(songParts[0]) : 000,
                    songParts[1],
                    songParts[2],
                    songParts[3],
                    songParts[4] != "" ? Integer.parseInt(songParts[4]) : 000,
                    songParts[5] != "" ? Integer.parseInt(songParts[5]) : 000
            );
            songs.add(s);
        }


        bufferedReader.close();
        return songs;
    }

    public Optional<Song> getSongById(int id) {
        for (Song s : songs) {
            if (s.id() == id) return Optional.of(s);
        }
        return Optional.ofNullable(null);
    }

    public Song getSongByIdNonOptional(int id) {
        for (Song s : songs) {
            if (s.id() == id) return s;
        }
        throw new EmptySongsListException("Song could not be found");
    }

    public Song getHighestPopularitySong() {
        if (songs.size() == 0) throw new EmptySongsListException("List of songs is empty");

        Song highestPopularitySong = songs.get(0);
        for (Song song : songs) {
            if (song.popularity() > highestPopularitySong.popularity()) highestPopularitySong = song;
        }
        return highestPopularitySong;
    }

    public Song getLongestSong() {
        if (songs.size() == 0) throw new RuntimeException("List of songs is empty");

        Song longestSong = songs.get(0);
        for (Song song : songs) {
            if (song.length() > longestSong.popularity()) longestSong = song;
        }
        return longestSong;
    }
}

record Song(int id, String trackName, String artistName, String gender, double length, double popularity) {
}
