package br.com.til.msmovie.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.til.grpcflix.models.movie.MovieDTO;
import br.com.til.grpcflix.models.movie.MovieSearchRequest;
import br.com.til.grpcflix.models.movie.MovieSearchResponse;
import br.com.til.grpcflix.models.movie.MoviieServiceGrpc.MoviieServiceImplBase;
import br.com.til.msmovie.repositories.MovieRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MovieService extends MoviieServiceImplBase {

	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public void getMovies(MovieSearchRequest request, StreamObserver<MovieSearchResponse> responseObserver) {
		
		List<MovieDTO> movies = this.movieRepository.getMovieByGenreOrderByYearDesc(request.getGenre().toString())
			.stream()
			.map(movie -> 
				MovieDTO.newBuilder()
				.setTitle(movie.getTitle())
				.setYear(movie.getYear())
				.setRating(movie.getRating())
				.build()
			)
			.collect(Collectors.toList());
		
		MovieSearchResponse movieResponse = MovieSearchResponse.newBuilder().addAllMovie(movies).build();
		
		responseObserver.onNext(movieResponse);
		responseObserver.onCompleted();
	}

	
}
