package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieFactoryTest {

    @Test
    void buildMovie() {
        Movie movie1 = MovieFactory.buildMovie("End game");

        assertNotNull(movie1);
        System.out.println(movie1.toString());
    }
}