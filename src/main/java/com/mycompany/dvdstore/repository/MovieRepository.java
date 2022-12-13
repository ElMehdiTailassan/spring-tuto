package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository implements MovieRepositoryInterface{


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Movie add(Movie movie) {
        return null;
    }

    @Override
    public List<Movie> list() {
        return jdbcTemplate.query("SELECT ID,TITLE,GENRE",(rs,rowNum)-> new Movie(rs.getLong("ID"),
                rs.getString("TITLE"),rs.getString("GENRE")));
    }

    @Override
    public Movie getById(long id) {
        return null;
    }
}
