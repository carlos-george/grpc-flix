package br.com.til.grpcflix.models.movie;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: movie-service.proto")
public final class MoviieServiceGrpc {

  private MoviieServiceGrpc() {}

  public static final String SERVICE_NAME = "MoviieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.til.grpcflix.models.movie.MovieSearchRequest,
      br.com.til.grpcflix.models.movie.MovieSearchResponse> getGetMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMovies",
      requestType = br.com.til.grpcflix.models.movie.MovieSearchRequest.class,
      responseType = br.com.til.grpcflix.models.movie.MovieSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.til.grpcflix.models.movie.MovieSearchRequest,
      br.com.til.grpcflix.models.movie.MovieSearchResponse> getGetMoviesMethod() {
    io.grpc.MethodDescriptor<br.com.til.grpcflix.models.movie.MovieSearchRequest, br.com.til.grpcflix.models.movie.MovieSearchResponse> getGetMoviesMethod;
    if ((getGetMoviesMethod = MoviieServiceGrpc.getGetMoviesMethod) == null) {
      synchronized (MoviieServiceGrpc.class) {
        if ((getGetMoviesMethod = MoviieServiceGrpc.getGetMoviesMethod) == null) {
          MoviieServiceGrpc.getGetMoviesMethod = getGetMoviesMethod = 
              io.grpc.MethodDescriptor.<br.com.til.grpcflix.models.movie.MovieSearchRequest, br.com.til.grpcflix.models.movie.MovieSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "MoviieService", "getMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.til.grpcflix.models.movie.MovieSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.til.grpcflix.models.movie.MovieSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MoviieServiceMethodDescriptorSupplier("getMovies"))
                  .build();
          }
        }
     }
     return getGetMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MoviieServiceStub newStub(io.grpc.Channel channel) {
    return new MoviieServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MoviieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MoviieServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MoviieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MoviieServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MoviieServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMovies(br.com.til.grpcflix.models.movie.MovieSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.til.grpcflix.models.movie.MovieSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMoviesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMoviesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.til.grpcflix.models.movie.MovieSearchRequest,
                br.com.til.grpcflix.models.movie.MovieSearchResponse>(
                  this, METHODID_GET_MOVIES)))
          .build();
    }
  }

  /**
   */
  public static final class MoviieServiceStub extends io.grpc.stub.AbstractStub<MoviieServiceStub> {
    private MoviieServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MoviieServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoviieServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MoviieServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMovies(br.com.til.grpcflix.models.movie.MovieSearchRequest request,
        io.grpc.stub.StreamObserver<br.com.til.grpcflix.models.movie.MovieSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MoviieServiceBlockingStub extends io.grpc.stub.AbstractStub<MoviieServiceBlockingStub> {
    private MoviieServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MoviieServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoviieServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MoviieServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.til.grpcflix.models.movie.MovieSearchResponse getMovies(br.com.til.grpcflix.models.movie.MovieSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MoviieServiceFutureStub extends io.grpc.stub.AbstractStub<MoviieServiceFutureStub> {
    private MoviieServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MoviieServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MoviieServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MoviieServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.til.grpcflix.models.movie.MovieSearchResponse> getMovies(
        br.com.til.grpcflix.models.movie.MovieSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOVIES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MoviieServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MoviieServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOVIES:
          serviceImpl.getMovies((br.com.til.grpcflix.models.movie.MovieSearchRequest) request,
              (io.grpc.stub.StreamObserver<br.com.til.grpcflix.models.movie.MovieSearchResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MoviieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MoviieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.til.grpcflix.models.movie.MovieService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MoviieService");
    }
  }

  private static final class MoviieServiceFileDescriptorSupplier
      extends MoviieServiceBaseDescriptorSupplier {
    MoviieServiceFileDescriptorSupplier() {}
  }

  private static final class MoviieServiceMethodDescriptorSupplier
      extends MoviieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MoviieServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MoviieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MoviieServiceFileDescriptorSupplier())
              .addMethod(getGetMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
