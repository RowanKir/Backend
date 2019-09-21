package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Movie;

public class MovieFactory {

    public static Movie buildMovie(String movieTitle, String movieId, String genres,
                                   int yearRelease,
                                   double rentalPrice)
    {
        return new Movie.Builder()
                .movieTitle(movieTitle)
                .movieId(movieId)
                .genres(genres)
                .yearRelease(yearRelease)
                .rentalPrice(rentalPrice)
                .build();
    }
}
