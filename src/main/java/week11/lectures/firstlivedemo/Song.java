package week11.lectures.firstlivedemo;

public record Song(
        int id,
        String name,
        String artistName,
        String genre,
        double length,
        double popularity
) {
}
