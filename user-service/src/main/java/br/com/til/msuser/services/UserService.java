package br.com.til.msuser.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.til.grpcflix.common.Genre;
import br.com.til.grpcflix.models.user.UserGenreUpdateRequest;
import br.com.til.grpcflix.models.user.UserResponse;
import br.com.til.grpcflix.models.user.UserSearchRequest;
import br.com.til.grpcflix.models.user.UserServiceGrpc.UserServiceImplBase;
import br.com.til.msuser.repositories.UserRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class UserService extends UserServiceImplBase {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void getUserGenrer(UserSearchRequest request, StreamObserver<UserResponse> responseObserver) {
		UserResponse.Builder userBuilder = UserResponse.newBuilder();
		
		this.userRepository.findById(request.getLoginId())
			.ifPresent(user -> {
				userBuilder.setUserName(user.getName())
				.setLoginId(user.getLogin())
				.setGenre(Genre.valueOf(user.getGenre().toUpperCase()));
			});
		
		responseObserver.onNext(userBuilder.build());
		responseObserver.onCompleted();
	}

	@Override
	@Transactional
	public void updateUserGenre(UserGenreUpdateRequest request, StreamObserver<UserResponse> responseObserver) {
		
		UserResponse.Builder userBuilder = UserResponse.newBuilder();
		
		System.out.println("Login: " + request.getLoginId());
		
		this.userRepository.findById(request.getLoginId())
			.ifPresent(user -> {
				user.setGenre(request.getGenre().toString());
				userBuilder.setUserName(user.getName())
				.setLoginId(user.getLogin())
				.setGenre(Genre.valueOf(user.getGenre().toUpperCase()));
			});
		
		responseObserver.onNext(userBuilder.build());
		
		System.out.println("Update Complete: " + request.getLoginId());
		
		responseObserver.onCompleted();
	}

}
