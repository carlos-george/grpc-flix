package br.com.til.aggregator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.til.aggregator.dtos.RecommendedMovieDTO;
import br.com.til.aggregator.dtos.UserGenreDTO;
import br.com.til.aggregator.services.RecommendedMovieService;

@RestController
@RequestMapping("/app")
public class AggregatorController {

	@Autowired
	private RecommendedMovieService recommendedMovieService;
	
	@GetMapping("/users/{loginId}")
	public List<RecommendedMovieDTO> getMovies(@PathVariable String loginId) {
		return recommendedMovieService.getUserMovieSuggestions(loginId);
	}
	
	@PutMapping("/users")
	public void setUserGenre(@RequestBody UserGenreDTO userGenre) {
		
		this.recommendedMovieService.setUserGenre(userGenre);
	}
}
