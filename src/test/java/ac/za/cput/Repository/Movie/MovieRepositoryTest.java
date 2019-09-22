package ac.za.cput.Repository.Movie;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Movie.MovieFactory;
import ac.za.cput.Repository.MovieRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MovieRepositoryTest {

    private MovieRepository movieRepository;
    Movie movie1 = MovieFactory.buildMovie("End Game", "1", "Action", 2019, 50.00);
    Movie movie2 = MovieFactory.buildMovie("Infinity war", "2", "Action", 2018, 40.00);

    @BeforeEach
    public  void setUp() throws Exception {
        this.movieRepository = MovieRepository.getMovieRepository();
    }

    @Test
    public void removeAll() {
        this.movieRepository.create(movie1);
        this.movieRepository.create(movie2);
        HashMap<String, Movie> temp = this.movieRepository.getAll();
        System.out.println("Values before removeAll: \n" + temp.values());
        this.movieRepository.removeAll();
        System.out.println("Values after removeAll: \n" +temp.values());
        assertEquals(0, temp.size());
    }

    @Test
    void getAll() {
        this.movieRepository.create(movie1);
        this.movieRepository.create(movie2);
        HashMap<String, Movie> temp = this.movieRepository.getAll();
        assertNotNull(temp);
        System.out.println("All values within temporary getAll() employee hashmap: \n" +temp.values() + "\n");

    }

    @Test
    void create() {
        assertEquals(movie1.getMovieTitle(), this.movieRepository.create(movie1).getMovieTitle());
        assertNotNull(this.movieRepository.getAll());
        System.out.println("Created movie: " +movie1.toString() + "\n");

    }

    @Test
    void read() {
        this.movieRepository.create(movie1);
        this.movieRepository.create(movie2);
        assertTrue(this.movieRepository.read(movie1.getMovieTitle()) instanceof Movie);
        assertEquals(movie1.hashCode(), this.movieRepository.read(movie1.getMovieId()).hashCode());
        System.out.println("Read this employee: \n" +this.movieRepository.read(movie1.getMovieTitle()).toString() + "\n");
    }

    @Test
    void update() {
        this.movieRepository.create(movie1);
        Movie newMovie = MovieFactory.buildMovie("End game", "1", "Action", 2019, 60.00);
        System.out.println("Updated: " +this.movieRepository.read(movie1.getMovieTitle()).toString());
        this.movieRepository.update(newMovie);
        System.out.println("To: " +this.movieRepository.read(newMovie.getMovieTitle()).toString() + "\n");
        assertEquals(movie1.getMovieTitle(), newMovie.getMovieTitle());
        assertEquals(60.00, this.movieRepository.read(newMovie.getMovieTitle()).getRentalPrice());
    }

    @Test
    void delete() {
        this.movieRepository.create(movie1);
        System.out.println("Create movie 1: " +movie1.toString());
        this.movieRepository.create(movie2);
        System.out.println("Create movie 2: " +movie2.toString());
        this.movieRepository.delete(movie2.getMovieTitle());
        System.out.println("Deleted employee2, all employees currently present in array: " +this.movieRepository.getAll());
        assertEquals(null, this.movieRepository.read(movie2.getMovieTitle()));

    }

    @AfterEach
    public void tearDown() throws Exception{
        this.movieRepository.removeAll();
    }
}