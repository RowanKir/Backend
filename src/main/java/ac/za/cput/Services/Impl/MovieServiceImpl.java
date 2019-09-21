package ac.za.cput.Services.Impl;

import ac.za.cput.Domain.Movie.Movie;

import java.util.HashMap;

public interface MovieServiceImpl extends IService<Movie, String> {

    void removeAll();
    HashMap<String, Movie> getAll();
}
