package br.com.til.aggregator.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecommendedMovieDTO {

	private String title;
	private int year;
	private double rating;
	
	
}
