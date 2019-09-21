package ac.za.cput.Factory.Movie;

import ac.za.cput.Domain.Movie.Genre;

public class GenreFactory {

    public static Genre getGenre(String genreCode, String genreDescription)
    {
        return new Genre.Builder()
                .genreCode(genreCode)
                .genreDescription(genreDescription)
                .build();
    }
}
