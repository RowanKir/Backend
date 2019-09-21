package ac.za.cput.Domain.Movie;

public class MovieCast {

    int movieId, actorId;

    public MovieCast(Builder builder) {
        this.movieId = builder.movieId;
        this.actorId = builder.actorId;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getActorId() {
        return actorId;
    }

    public static class Builder
    {
        int movieId, actorId;

        public Builder movieId(int movieId)
        {
            this.movieId = movieId;
            return this;
        }

        public Builder actorId(int actorId)
        {
            this.actorId = actorId;
            return this;
        }

        public MovieCast build()
        {
            return new MovieCast(this);
        }
    }
}
