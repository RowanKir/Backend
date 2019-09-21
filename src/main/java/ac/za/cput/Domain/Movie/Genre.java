package ac.za.cput.Domain.Movie;

public class Genre {

    String genreDescription, genreCode;

    public Genre(Builder builder) {
        this.genreCode = builder.genreCode;
        this.genreDescription = builder.genreDescription;
    }

    public String getGenreCode() {
        return genreCode;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public static class Builder
    {
        String genreCode;
        String genreDescription;

        public Builder genreCode(String genreCode)
        {
            this.genreCode = genreCode;
            return this;
        }

        public Builder genreDescription(String genreDescription)
        {
            this.genreDescription = genreDescription;
            return this;
        }

        public Genre build()
        {
            return new Genre(this);
        }
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreCode=" + genreCode +
                ", genreDescription='" + genreDescription + '\'' +
                '}';
    }
}
