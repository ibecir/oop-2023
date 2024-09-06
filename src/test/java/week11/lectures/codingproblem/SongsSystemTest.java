package week11.lectures.codingproblem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import year2023.week11.lectures.codingproblem.EmptySongsListException;
import year2023.week11.lectures.codingproblem.SongsSystem;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SongsSystemTest {
    static SongsSystem system;

    @BeforeEach
    void init() {
        system = new SongsSystem("songs.csv");
    }

    @Tag("wrong")
    @Test
    void ifSongsNotPresent_sizeShouldBeZero(){
        SongsSystem systemWrong = new SongsSystem("becir.csv");
        assertEquals(0, systemWrong.songs.size());
    }

    @Test
    void ifSongsPresent_sizeShouldBeFifty() {
        assertEquals(50, system.songs.size());
    }

    @Test
    void songWithId100_shouldNotBePresent() {
        assertTrue(system.getSongById(100).equals(Optional.ofNullable(null)));
    }

    @Test
    void songWithId100_shouldBeNull() {
        assertNull(system.getSongById(100).orElse(null));
    }

    @Test
    void songWithId1_shouldBePresent() {
        assertFalse(!system.getSongById(1).isPresent());
    }

    @Test
    void mostPopularSong_shouldNotBeNull() {
        Song song = system.getHighestPopularitySong();
        assertNotNull(song);
    }

    @Test
    void longestSong_shouldBeNamedSucker() {
        Song song = system.getLongestSong();
        assertNotEquals("Sucker", song.trackName());
    }

    @Test
    void songWithIdHundred_shouldThrowException() {
        assertThrows(EmptySongsListException.class, () -> {
            system.getSongByIdNonOptional(100);
        });
    }
}