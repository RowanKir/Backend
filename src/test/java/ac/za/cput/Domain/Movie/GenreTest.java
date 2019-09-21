package ac.za.cput.Domain.Movie;

import ac.za.cput.Factory.Movie.GenreFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenreTest {

    Genre genre1 = GenreFactory.getGenre("1", "Action");
    Genre genre2 = GenreFactory.getGenre("2", "Thriller");

    @Test
    void getGenreCode() {
        assertNotNull(genre1.genreCode);
        assertNotEquals(genre1.getGenreCode(), genre2.getGenreCode());
        assertEquals(genre1.getGenreCode(), 1);
        System.out.println("Genre 1's code is: " +genre1.getGenreCode() + "\nMovie 2's year release is: " +genre2.getGenreCode() + "");
    }

    @Test
    void getGenreDescription() {
        assertNotNull(genre1.genreDescription);
        assertNotEquals(genre1.getGenreDescription(), genre2.getGenreDescription());
        assertEquals(genre1.getGenreDescription(), "Action");
        System.out.println("Genre 1's description: " +genre1.getGenreDescription());
    }

    @Test
    void testToString() {
        assertNotNull(genre1.toString());
        assertTrue(genre1.toString() instanceof String);
        System.out.println(genre1.toString());
    }
}