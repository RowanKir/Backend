package ac.za.cput.Domain.Movie;

import ac.za.cput.Factory.Movie.MovieFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Movie movie1 = MovieFactory.buildMovie("End Game");
    Movie movie2 = MovieFactory.buildMovie("Infinity war");

    @Test
    void getYearRelease() {
        assertNotNull(movie1.yearRelease);
        assertNotEquals(movie1.getYearRelease(), movie2.getYearRelease());
        assertEquals(movie1.getYearRelease(), 2019);
        System.out.println("Movie 1's year release is: " +movie1.getYearRelease() + "\nMovie 2's year release is: " +movie2.getYearRelease() + "");
    }

    @Test
    void getMovieTitle() {
        assertNotNull(movie1.movieTitle);
        assertNotEquals(movie1.getMovieTitle(), movie2.getMovieTitle());
        assertEquals(movie1.getMovieTitle(), "End Game");
        assertTrue(movie1.getMovieTitle() instanceof String);
        System.out.println("The title of movie 1 is: " +movie1.getMovieTitle());
    }

    @Test
    void getMovieId() {
        assertNotNull(movie1.movieId);
        assertNotEquals(movie1.getMovieId(), movie2.getMovieId());
        assertEquals(movie1.getMovieId(), "1");
        assertTrue(movie1.getMovieId() instanceof String);
        System.out.println("Movie 1 has an ID of: " +movie1.getMovieId());
    }

    @Test
    void getGenres() {
        assertNotNull(movie1.genres);
        assertNotEquals(movie1.getGenres(), movie1.getMovieTitle());
        assertEquals(movie1.getGenres(), "Action");
        assertTrue(movie1.getGenres() instanceof String);
        System.out.println("Movie 1's Genre is: " +movie1.getGenres());
    }

    @Test
    void getRentalPrice() {
        assertNotNull(movie1.rentalPrice);
        assertNotEquals(movie1.getRentalPrice(), movie2.getRentalPrice());
        System.out.println("Movie 1's rental price is: " +movie1.getRentalPrice());
    }

    @Test
    void testToString() {
        assertNotNull(movie1.toString());
        assertTrue(movie1.toString() instanceof String);
        System.out.println(movie1.toString());
    }
}