package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

     Movie add(Movie movie);
     List<Movie> list();
     public Movie getById(long id);

}
