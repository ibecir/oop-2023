package week11.lectures.secondlivedemo;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SongsSystem {
    private List<Song> songs;

    public SongsSystem() {
        songs = readSongs("songs.csv");
    }

    private static List<Song> readSongs(String fileName) {
        List<Song> readSongs = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(fileName)
            );
            readSongs = new ArrayList<>();
            List<String> stringSongs = bufferedReader.lines().collect(Collectors.toList());
            for (String line : stringSongs) {
                String[] tempLine = line.split(",");
                Song tempSong = new Song(
                        tempLine[0] != "" ? Integer.parseInt(tempLine[0]) : 0,
                        tempLine[1],
                        tempLine[2],
                        tempLine[3],
                        tempLine[4] == "" ? 1 : Double.parseDouble(tempLine[4]),
                        tempLine[5] != "" ? Double.parseDouble(tempLine[5]) : 2
                );
                readSongs.add(tempSong);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readSongs;
    }

    public Song getSongById(int id){
        for(Song song : this.songs){
            if(song.id() == id)
                return song;
        }
        throw new EntityNotFoundException("Song was not found with that id", new RuntimeException("Edhem is guilty"));
    }
}

class Tester {
    public static void main(String[] args) {
        SongsSystem system = new SongsSystem();
        System.out.println(system.getSongById(500));
    }
}
