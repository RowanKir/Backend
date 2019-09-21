package ac.za.cput.Repository;


import ac.za.cput.Domain.Movie.Genre;
import ac.za.cput.Repository.Impl.GenreRepositoryImpl;

import java.util.HashMap;

public class GenreRepository implements GenreRepositoryImpl {

    private HashMap<String, Genre> genreRepDB;
    private static GenreRepository genreRepository = null;

    private GenreRepository()
    {
        this.genreRepDB = new HashMap<>();
    }

    public static GenreRepository getGenreRepository()
    {
        if(genreRepository == null)
        {
            genreRepository = new GenreRepository();
        }
        return genreRepository;
    }


    @Override
    public void removeAll() {
        genreRepDB.clear();
    }

    @Override
    public HashMap<String, Genre> getAll() {
        return genreRepDB;
    }

    @Override
    public Genre create(Genre genre) {
        this.genreRepDB.put(genre.getGenreCode(), genre);
        return genre;
    }

    @Override
    public Genre read(String s) {
        for(Genre genre: genreRepDB.values())
        {
            if(genre.getGenreCode().equals(s))
            {
                return genre;
            }
        }
        return null;
    }

    @Override
    public Genre update(Genre genre) {
        Genre deleteGenre = read(genre.getGenreCode());
        if(deleteGenre != null)
        {
            this.genreRepDB.remove(deleteGenre.getGenreCode());
            return create(genre);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        genreRepDB.remove(s);

    }
}
