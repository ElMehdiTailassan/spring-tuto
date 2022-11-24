package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    //MovieService movieService = new MovieService();
    @Autowired
    MovieServiceInterface movieServiceInterface;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole(){
        System.out.println( "c quoi le nom du film !" );
        Scanner scanner = new Scanner(System.in);
        String nom_film= scanner.nextLine();
        System.out.println( "c quoi le genre de ce film !" );
        String genre_film= scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(nom_film);
        movie.setGenre(genre_film);
        movieServiceInterface.registerMovie(movie);

    }

}
