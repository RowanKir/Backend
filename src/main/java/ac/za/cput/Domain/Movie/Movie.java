package ac.za.cput.Domain.Movie;

public class Movie {

    int  yearRelease;
    String movieTitle, movieId, genres;
    double rentalPrice = 0.00;

    public Movie(Builder builder) {
        this.movieId = builder.movieId;
        this.yearRelease = builder.yearRelease;
        this.movieTitle = builder.movieTitle;
        this.genres = builder.genres;
        this.rentalPrice = builder.rentalPrice;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getGenres() {
        return genres;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                ", yearRelease=" + yearRelease +
                ", movieTitle='" + movieTitle + '\'' +
                ", movieId='" + movieId + '\'' +
                ", genres='" + genres + '\'' +
                ", rentalPrice=" + rentalPrice +
                '}';
    }

    public static class Builder
    {
        int  yearRelease;
        String movieTitle, movieId, genres;
        double rentalPrice = 0.00;


        public Builder movieId(String movieId)
        {
            this.movieId = movieId;
            return this;
        }

        public Builder yearRelease(int yearRelease)
        {
            this.yearRelease = yearRelease;
            return this;
        }

        public Builder movieTitle(String movieTitle)
        {
            this.movieTitle = movieTitle;
            return this;
        }

        public Builder genres(String genres)
        {
            this.genres = genres;
            return this;
        }

        public Builder rentalPrice(double rentalPrice)
        {
            this.rentalPrice = rentalPrice;
            return this;
        }

        public Builder copy(Movie movie){
            this.movieId = movie.movieId;
            this.movieTitle = movie.movieTitle;

            return this;
        }

        public Movie build()
        {
            return new Movie(this);
        }


    }
}
