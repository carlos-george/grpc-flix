package br.com.til.aggregator.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.til.grpcflix.models.user.UserGenreUpdateRequest;
import br.com.til.grpcflix.models.user.UserResponse;
import br.com.til.grpcflix.models.user.UserSearchRequest;
import br.com.til.grpcflix.models.user.UserServiceGrpc;
import br.com.til.aggregator.dtos.RecommendedMovieDTO;
import br.com.til.aggregator.dtos.UserGenreDTO;
import br.com.til.grpcflix.common.Genre;
import br.com.til.grpcflix.models.movie.MovieSearchRequest;
import br.com.til.grpcflix.models.movie.MovieSearchResponse;
import br.com.til.grpcflix.models.movie.MoviieServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Service
public class RecommendedMovieService {

	@GrpcClient(value = "userService")
	private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;
	
	@GrpcClient(value = "movieService")
	private MoviieServiceGrpc.MoviieServiceBlockingStub movieServiceBlockingStub;
	
	public List<RecommendedMovieDTO> getUserMovieSuggestions(String loginId) {
		
		UserSearchRequest userSearchRequest = UserSearchRequest.newBuilder().setLoginId(loginId).build();
		
		UserResponse userResponse = this.userServiceBlockingStub.getUserGenrer(userSearchRequest);
		System.err.println("Bateu aqui 3");
		
		MovieSearchRequest movieRequest = MovieSearchRequest.newBuilder().setGenre(userResponse.getGenre()).build();
		
		MovieSearchResponse movies = this.movieServiceBlockingStub.getMovies(movieRequest);
		System.err.println("Bateu aqui 4");
		
		List<RecommendedMovieDTO> recommendedMovies = movies.getMovieList().stream()
			.map(movie -> 
				RecommendedMovieDTO.builder()
				.title(movie.getTitle())
				.year(movie.getYear())
				.rating(movie.getRating())
				.build()
			).collect(Collectors.toList());
		
		return recommendedMovies;
	}
	
	public void setUserGenre(UserGenreDTO userGenreDTO) {
		UserGenreUpdateRequest request = UserGenreUpdateRequest.newBuilder()
			.setLoginId(userGenreDTO.getLoginId())
			.setGenre(Genre.valueOf(userGenreDTO.getGenre().toUpperCase()))
			.build();
		
		UserResponse userResponse = this.userServiceBlockingStub.updateUserGenre(request);
		
		System.out.println("User was updated: " + userResponse.getLoginId() + " : " + userResponse.getUserName());
	}
	
}
