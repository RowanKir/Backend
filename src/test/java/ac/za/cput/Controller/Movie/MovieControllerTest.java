package ac.za.cput.Controller.Movie;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Movie.MovieFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MovieControllerTest {

    @Autowired
    private TestRestTemplate test;
    private String url = "http://localhost:8080/videostore/movie";
    @Test
    void createMovie() {
        Movie movie1 = MovieFactory.buildMovie("Avengers");
        ResponseEntity result = test.withBasicAuth("admin", "admin")
                .postForEntity(url + "/create/", movie1, String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    void getAll() {
        Movie movie1 = MovieFactory.buildMovie("Avengers");
        ResponseEntity result = test.withBasicAuth("Rowan", "123456")
                .postForEntity(url + "/getAll/", movie1, String.class);
        System.out.println(result.getBody());
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }
}