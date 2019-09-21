package ac.za.cput.Services;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Services.Impl.MovieServiceImpl;

import java.util.HashMap;

public class MovieService implements MovieServiceImpl {

    private HashMap<String, Movie> movieSerDB;
    private static MovieService movieService = null;


    private MovieService()
    {
        this.movieSerDB = new HashMap<>();
    }

    public static MovieService getMovieService()
    {
        if(movieService == null)
        {
            movieService = new MovieService();
        }
        return movieService;
    }

    @Override
    public void removeAll() {
        movieSerDB.clear();
    }

    @Override
    public HashMap<String, Movie> getAll() {
        return movieSerDB;
    }

    @Override
    public Movie create(Movie movie) {
        return this.movieService.create(movie);
    }

    @Override
    public Movie read(String s) {
        return this.movieService.read(s);
    }

    @Override
    public Movie update(Movie movie) {
        return this.movieService.update(movie);
    }

    @Override
    public void delete(String s) {
        this.movieService.delete(s);
    }
}
