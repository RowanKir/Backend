package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Genre;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class GenreFactoryTest {

    @Test
    void getGenre() {
        Genre genre1 = GenreFactory.getGenre("1", "Action");

        assertNotNull(genre1);
        System.out.println(genre1.toString());
    }
}