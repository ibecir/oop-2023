package year2023.week10.lectures.iterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Movie {
    private String name;
    private String director;
    private float rating;

    public Movie(String name, String director, float rating) {
        this.name = name;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}

class CustomMovieIterator implements Iterator<Movie> {
    private final List<Movie> list;
    private int currentIndex;

    public CustomMovieIterator(List<Movie> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < list.size()) {
            Movie currentMovie = list.get(currentIndex);
            if (isMovieEligible(currentMovie)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Movie next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);
    }

    private boolean isMovieEligible(Movie movie) {
        return movie.getRating() >= 8;
    }
}

class MainIterator {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Ljeto u zlatnoj dolini", "Becir", 10),
                new Movie("Kod amidze Idriza", "Becir", 10),
                new Movie("Zaba", "Becir", 7)
        );
        CustomMovieIterator movieIterator = new CustomMovieIterator(movies);
        int count = 0;
        while (movieIterator.hasNext()) {
            System.out.println(movieIterator.next());
            count++;
        }
    }
}