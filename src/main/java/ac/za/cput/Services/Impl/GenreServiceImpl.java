package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Genre;

import java.util.HashMap;

public interface GenreServiceImpl extends IService<Genre, String> {

    void removeAll();
    HashMap<String, Genre> getAll();
}
