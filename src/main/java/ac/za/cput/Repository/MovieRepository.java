package ac.za.cput.Repository;

import ac.za.cput.Domain.Movie.Movie;
import ac.za.cput.Repository.Impl.MovieRepositoryImpl;

import java.util.HashMap;

public class MovieRepository implements MovieRepositoryImpl {

    private HashMap<String, Movie> movieRepDB;
    private static MovieRepository movieRepository = null;

    private MovieRepository()
    {
        this.movieRepDB = new HashMap<>();
    }

    public static MovieRepository getMovieRepository()
    {
        if(movieRepository == null)
        {
            movieRepository = new MovieRepository();
        }
        return movieRepository;
    }

    @Override
    public void removeAll() {
        movieRepDB.clear();
    }

    @Override
    public HashMap<String, Movie> getAll() {
        return movieRepDB;
    }

    @Override
    public Movie create(Movie movie) {
        this.movieRepDB.put(movie.getMovieTitle(), movie);
        return movie;
    }

    @Override
    public Movie read(String s) {
        for(Movie movie: movieRepDB.values())
        {
            if(movie.getMovieTitle().equals(s))
            {
                return movie;
            }
        }
        return null;
    }

    @Override
    public Movie update(Movie movie) {
        Movie deleteMovie = read(movie.getMovieTitle());
        if(deleteMovie != null)
        {
            this.movieRepDB.remove(deleteMovie.getMovieTitle());
            return create(movie);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        movieRepDB.remove(s);
    }
}
