package week11.lectures.secondlivedemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import year2023.week11.lectures.secondlivedemo.EntityNotFoundException;
import year2023.week11.lectures.secondlivedemo.SongsSystem;

import static org.junit.jupiter.api.Assertions.*;

class SongsSystemTest {

    private static SongsSystem system;

    @BeforeEach
    void initilize(){
        system = new SongsSystem();
    }

    @Test
    void whenSongId500IsPassed_thenThrowMyCustomException(){
        assertThrows(EntityNotFoundException.class, () -> {
            system.getSongById(500);
        });
    }

    @Test
    void whenSongIdIs30_thenAssertItsName(){
        assertEquals("QUE PRETENDES",  system.getSongById(30).name());
    }
    @Test
    void whenSongIdIs30_thenAssertItIsTrue(){
        assertTrue("QUE PRETENDES".equals(system.getSongById(30).name()));
    }

    @Test
    void whenSongIdIs30_thenAssertAll(){
        assertAll(
                () -> assertEquals("QUE PRETENDES",  system.getSongById(30).name()),
                () -> assertTrue("QUE PRETENDES".equals(system.getSongById(30).name()))
        );
    }
}