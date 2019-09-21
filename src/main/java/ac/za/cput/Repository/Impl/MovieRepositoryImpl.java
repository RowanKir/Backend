package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Movie;

import java.util.HashMap;

public interface MovieRepositoryImpl extends IRepository<Movie, String> {

    void removeAll();
    HashMap<String, Movie> getAll();
}
