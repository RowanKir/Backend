package ac.za.cput.Services;

import ac.za.cput.Domain.Movie.Genre;
import ac.za.cput.Services.Impl.GenreServiceImpl;

import java.util.HashMap;

public class GenreService implements GenreServiceImpl {

    private HashMap<String, Genre> genreSerDB;
    private static GenreService genreService = null;

    private GenreService()
    {
        this.genreSerDB = new HashMap<>();
    }

    public static GenreService getGenreService()
    {
        if(genreService == null)
        {
            genreService = new GenreService();
        }
        return genreService;
    }

    @Override
    public void removeAll() {
        genreSerDB.clear();
    }

    @Override
    public HashMap<String, Genre> getAll() {
        return genreSerDB;
    }

    @Override
    public Genre create(Genre genre) {
        return this.genreService.create(genre);
    }

    @Override
    public Genre read(String s) {
        return this.genreService.read(s);
    }

    @Override
    public Genre update(Genre genre) {
        return this.genreService.update(genre);
    }

    @Override
    public void delete(String s) {
        this.genreService.delete(s);
    }
}
