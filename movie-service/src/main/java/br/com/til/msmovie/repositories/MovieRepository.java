package br.com.til.msmovie.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.til.msmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	List<Movie> getMovieByGenreOrderByYearDesc(String genre);

}
