package ac.za.cput.Repository.Movie;

import ac.za.cput.Domain.Movie.Genre;
import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Movie.GenreFactory;
import ac.za.cput.Repository.GenreRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class GenreRepositoryTest {

    private GenreRepository genreRepository;
    Genre genre1 = GenreFactory.getGenre("1", "Action");
    Genre genre2 = GenreFactory.getGenre("2", "Horror");

    @BeforeEach
    void setUp() throws Exception {
        this.genreRepository = GenreRepository.getGenreRepository();
    }

    @Test
    void removeAll() {
        this.genreRepository.create(genre1);
        this.genreRepository.create(genre2);
        HashMap<String, Genre> temp = this.genreRepository.getAll();
        System.out.println("Values before removeAll: \n" + temp.values());
        this.genreRepository.removeAll();
        System.out.println("Values after removeAll: \n" +temp.values());
        assertEquals(0, temp.size());
    }

    @Test
    void getAll() {
        this.genreRepository.create(genre1);
        this.genreRepository.create(genre2);
        HashMap<String, Genre> temp = this.genreRepository.getAll();
        assertNotNull(temp);
        System.out.println("All values within temporary getAll() employee hashmap: \n" +temp.values() + "\n");
    }

    @Test
    void create() {
        assertEquals(genre1.getGenreCode(), this.genreRepository.create(genre1).getGenreCode());
        assertNotNull(this.genreRepository.getAll());
        System.out.println("Created Genre: " +genre1.toString() + "\n");
    }

    @Test
    void read() {
        this.genreRepository.create(genre1);
        this.genreRepository.create(genre2);
        assertTrue(this.genreRepository.read(genre1.getGenreCode()) instanceof Genre);
        assertEquals(genre1.hashCode(), this.genreRepository.read(genre1.getGenreCode()).hashCode());
        System.out.println("Read this Genre: \n" +this.genreRepository.read(genre1.getGenreCode()).toString() + "\n");

    }

    @Test
    void update() {
        this.genreRepository.create(genre1);
        Genre newGenre = GenreFactory.getGenre("1", "Comedy");
        System.out.println("Updated: " +this.genreRepository.read(genre1.getGenreCode()).toString());
        this.genreRepository.update(newGenre);
        System.out.println("To: " +this.genreRepository.read(newGenre.getGenreCode()).toString() + "\n");
        assertEquals(genre1.getGenreCode(), newGenre.getGenreCode());
    }

    @Test
    void delete() {
        this.genreRepository.create(genre1);
        System.out.println("Create Genre 1: " +genre1.toString());
        this.genreRepository.create(genre2);
        System.out.println("Create genre 2: " +genre2.toString());
        this.genreRepository.delete(genre2.getGenreCode());
        System.out.println("Deleted employee2, all employees currently present in array: " +this.genreRepository.getAll());
        assertEquals(null, this.genreRepository.read(genre1.getGenreCode()));
    }

    @AfterEach
    void tearDown() throws Exception {
        this.genreRepository.removeAll();
    }

}