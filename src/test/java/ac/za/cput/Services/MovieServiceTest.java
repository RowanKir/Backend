package ac.za.cput.Services;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Movie.MovieFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    private MovieService movieService;
    Movie movie1 = MovieFactory.buildMovie("End Game");
    Movie movie2 = MovieFactory.buildMovie("Infinity war");

    @BeforeEach
    public void setUp() throws Exception {
        this.movieService = MovieService.getMovieService();
    }

    @Test
    void removeAll() {

        this.movieService.create(movie1);
        this.movieService.create(movie2);
        HashMap<String, Movie> temp = this.movieService.getAll();
        System.out.println("Values before removeAll: \n" + temp.values());
        this.movieService.removeAll();
        System.out.println("Values after removeAll: \n" +temp.values());
        assertEquals(0, temp.size());
    }

    @Test
    void getAll() {
        this.movieService.create(movie1);
        this.movieService.create(movie2);
        HashMap<String, Movie> temp = this.movieService.getAll();
        assertNotNull(temp);
        System.out.println("All values within temporary getAll() employee hashmap: \n" +temp.values() + "\n");

    }

    @Test
    void create() {
        assertEquals(movie1.getMovieTitle(), this.movieService.create(movie1).getMovieTitle());
        assertNotNull(this.movieService.getAll());
        System.out.println("Created movie: " +movie1.toString() + "\n");

    }

//    @Test
//    void read() {
//        this.movieService.create(movie1);
//        this.movieService.create(movie2);
//        assertTrue(this.movieService.read(movie1.getMovieTitle()) instanceof Movie);
//        assertEquals(movie1.hashCode(), this.movieService.read(movie1.getMovieId()).hashCode());
//        System.out.println("Read this employee: \n" +this.movieService.read(movie1.getMovieTitle()).toString() + "\n");
//
//    }
//
//    @Test
//    void update() {
//        this.movieService.create(movie1);
//        Movie newMovie = MovieFactory.buildMovie("End game");
//        System.out.println("Updated: " +this.movieService.read(movie1.getMovieTitle()).toString());
//        this.movieService.update(newMovie);
//        System.out.println("To: " +this.movieService.read(newMovie.getMovieTitle()).toString() + "\n");
//        assertEquals(movie1.getMovieTitle(), newMovie.getMovieTitle());
//        assertEquals(60.00, this.movieService.read(newMovie.getMovieTitle()).getRentalPrice());
//
//    }
//
//    @Test
//    void delete() {
//        this.movieService.create(movie1);
//        System.out.println("Create movie 1: " +movie1.toString());
//        this.movieService.create(movie2);
//        System.out.println("Create movie 2: " +movie2.toString());
//        this.movieService.delete(movie2.getMovieTitle());
//        System.out.println("Deleted employee2, all employees currently present in array: " +this.movieService.getAll());
//        assertEquals(null, this.movieService.read(movie2.getMovieTitle()));
//
//    }

    @AfterEach
    public void tearDown() throws Exception{
        this.movieService.removeAll();
    }
}