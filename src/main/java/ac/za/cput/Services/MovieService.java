package ac.za.cput.Services;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Services.Impl.MovieServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
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
        this.movieSerDB.put(movie.getMovieId(), movie);
        return movie;
    }

    @Override
    public Movie read(String s) {
        for(Movie movie: movieSerDB.values())
        {
            if(movie.getMovieId().equals(s))
            {
                return movie;
            }
        }
        return null;
    }


    @Override
    public Movie update(Movie movie) {
        Movie deleteMovie = read(movie.getMovieId());
        if(deleteMovie != null)
        {
            this.movieSerDB.remove(deleteMovie.getMovieId());
            return create(movie);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        movieSerDB.remove(s);
    }
}
