package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Genre;

import java.util.HashMap;

public interface GenreRepositoryImpl extends IRepository<Genre, String> {

    void removeAll();
    HashMap<String, Genre> getAll();
}
