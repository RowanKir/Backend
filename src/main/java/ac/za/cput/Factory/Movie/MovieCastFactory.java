package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.MovieCast;

public class MovieCastFactory {

    public static MovieCast buildMovieCast (int movieId, int actorId)
    {
        return new MovieCast.Builder()
                .movieId(movieId)
                .actorId(actorId)
                .build();


    }
}
