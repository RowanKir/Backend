package ac.za.cput.Controller.Movie;

import ac.za.cput.Domain.Member.Report;
import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Factory.Member.ReportFactory;
import ac.za.cput.Factory.Movie.MovieFactory;

import ac.za.cput.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("VideoRental/movie")
public class MovieController {


    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createMovie(@PathVariable String movie)
    {
        System.out.println("Entered Value: " + movie);
        Report report = ReportFactory.getReport(HttpStatus.OK.toString(), "Movie created");
        Movie savedMovie;
        if (movie == null || movie.trim().isEmpty() || movie.trim().equalsIgnoreCase("null")) {
            report.setReportId(HttpStatus.PRECONDITION_FAILED.toString());
            report.setReportDescription("Provide a movie");
        }else
        {
            savedMovie = movieService.read(movie);
            if(savedMovie != null)
            {
                report.setReportDescription("Movie already exist");
            }else
            {
                savedMovie = MovieFactory.buildMovie(movie);
                savedMovie = movieService.create(savedMovie);
            }
            report.setReport(savedMovie);
        }
        return ResponseEntity.ok(report);
    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll()
    {
        Report report = ReportFactory.getReport(HttpStatus.OK.toString(), "Successful");
        Set<Movie> movies = (Set<Movie>) movieService.getAll();
        report.setReport(movies);
        return ResponseEntity.ok(report);
    }

}
