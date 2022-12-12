package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    //MovieRepository movieRepository = new MovieRepository();
    //GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie registerMovie(Movie movie){

       // movieRepository.add(movie);
       return movieRepository.add(movie);
    }

    @Override
    public List<Movie> getMovieList() {
        return movieRepository.list();
    }

    @Override
    public Movie getMovieById(long id) {

        return movieRepository.getById(id);
    }

}
