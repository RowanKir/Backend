package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Movie;

public class MovieFactory {

    public static Movie buildMovie(String movieTitle)
    {
        return new Movie.Builder()
                .movieTitle(movieTitle)

                .build();
    }
}
