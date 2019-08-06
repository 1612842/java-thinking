package com.cong.api.grpc;

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
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: gRPC.proto")
public final class gRPCServiceGrpc {

  private gRPCServiceGrpc() {}

  public static final String SERVICE_NAME = "com.cong.api.grpc.gRPCService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cong.api.grpc.SigninRequest,
      com.cong.api.grpc.SigninResponse> getAuthenticateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "authenticateUser",
      requestType = com.cong.api.grpc.SigninRequest.class,
      responseType = com.cong.api.grpc.SigninResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cong.api.grpc.SigninRequest,
      com.cong.api.grpc.SigninResponse> getAuthenticateUserMethod() {
    io.grpc.MethodDescriptor<com.cong.api.grpc.SigninRequest, com.cong.api.grpc.SigninResponse> getAuthenticateUserMethod;
    if ((getAuthenticateUserMethod = gRPCServiceGrpc.getAuthenticateUserMethod) == null) {
      synchronized (gRPCServiceGrpc.class) {
        if ((getAuthenticateUserMethod = gRPCServiceGrpc.getAuthenticateUserMethod) == null) {
          gRPCServiceGrpc.getAuthenticateUserMethod = getAuthenticateUserMethod = 
              io.grpc.MethodDescriptor.<com.cong.api.grpc.SigninRequest, com.cong.api.grpc.SigninResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cong.api.grpc.gRPCService", "authenticateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.SigninRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.SigninResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gRPCServiceMethodDescriptorSupplier("authenticateUser"))
                  .build();
          }
        }
     }
     return getAuthenticateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cong.api.grpc.SignupRequest,
      com.cong.api.grpc.SignupResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerUser",
      requestType = com.cong.api.grpc.SignupRequest.class,
      responseType = com.cong.api.grpc.SignupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cong.api.grpc.SignupRequest,
      com.cong.api.grpc.SignupResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<com.cong.api.grpc.SignupRequest, com.cong.api.grpc.SignupResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = gRPCServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (gRPCServiceGrpc.class) {
        if ((getRegisterUserMethod = gRPCServiceGrpc.getRegisterUserMethod) == null) {
          gRPCServiceGrpc.getRegisterUserMethod = getRegisterUserMethod = 
              io.grpc.MethodDescriptor.<com.cong.api.grpc.SignupRequest, com.cong.api.grpc.SignupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cong.api.grpc.gRPCService", "registerUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.SignupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.SignupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gRPCServiceMethodDescriptorSupplier("registerUser"))
                  .build();
          }
        }
     }
     return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cong.api.grpc.ChoiceRequest,
      com.cong.api.grpc.ChoiceResponse> getPlayGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "playGame",
      requestType = com.cong.api.grpc.ChoiceRequest.class,
      responseType = com.cong.api.grpc.ChoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cong.api.grpc.ChoiceRequest,
      com.cong.api.grpc.ChoiceResponse> getPlayGameMethod() {
    io.grpc.MethodDescriptor<com.cong.api.grpc.ChoiceRequest, com.cong.api.grpc.ChoiceResponse> getPlayGameMethod;
    if ((getPlayGameMethod = gRPCServiceGrpc.getPlayGameMethod) == null) {
      synchronized (gRPCServiceGrpc.class) {
        if ((getPlayGameMethod = gRPCServiceGrpc.getPlayGameMethod) == null) {
          gRPCServiceGrpc.getPlayGameMethod = getPlayGameMethod = 
              io.grpc.MethodDescriptor.<com.cong.api.grpc.ChoiceRequest, com.cong.api.grpc.ChoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cong.api.grpc.gRPCService", "playGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.ChoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.ChoiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gRPCServiceMethodDescriptorSupplier("playGame"))
                  .build();
          }
        }
     }
     return getPlayGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cong.api.grpc.MyMessage,
      com.cong.api.grpc.HistoryResponse> getGetHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHistory",
      requestType = com.cong.api.grpc.MyMessage.class,
      responseType = com.cong.api.grpc.HistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cong.api.grpc.MyMessage,
      com.cong.api.grpc.HistoryResponse> getGetHistoryMethod() {
    io.grpc.MethodDescriptor<com.cong.api.grpc.MyMessage, com.cong.api.grpc.HistoryResponse> getGetHistoryMethod;
    if ((getGetHistoryMethod = gRPCServiceGrpc.getGetHistoryMethod) == null) {
      synchronized (gRPCServiceGrpc.class) {
        if ((getGetHistoryMethod = gRPCServiceGrpc.getGetHistoryMethod) == null) {
          gRPCServiceGrpc.getGetHistoryMethod = getGetHistoryMethod = 
              io.grpc.MethodDescriptor.<com.cong.api.grpc.MyMessage, com.cong.api.grpc.HistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cong.api.grpc.gRPCService", "getHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.MyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.HistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gRPCServiceMethodDescriptorSupplier("getHistory"))
                  .build();
          }
        }
     }
     return getGetHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cong.api.grpc.MyMessage,
      com.cong.api.grpc.RankingResponse> getGetRankingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRanking",
      requestType = com.cong.api.grpc.MyMessage.class,
      responseType = com.cong.api.grpc.RankingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cong.api.grpc.MyMessage,
      com.cong.api.grpc.RankingResponse> getGetRankingMethod() {
    io.grpc.MethodDescriptor<com.cong.api.grpc.MyMessage, com.cong.api.grpc.RankingResponse> getGetRankingMethod;
    if ((getGetRankingMethod = gRPCServiceGrpc.getGetRankingMethod) == null) {
      synchronized (gRPCServiceGrpc.class) {
        if ((getGetRankingMethod = gRPCServiceGrpc.getGetRankingMethod) == null) {
          gRPCServiceGrpc.getGetRankingMethod = getGetRankingMethod = 
              io.grpc.MethodDescriptor.<com.cong.api.grpc.MyMessage, com.cong.api.grpc.RankingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cong.api.grpc.gRPCService", "getRanking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.MyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cong.api.grpc.RankingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new gRPCServiceMethodDescriptorSupplier("getRanking"))
                  .build();
          }
        }
     }
     return getGetRankingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gRPCServiceStub newStub(io.grpc.Channel channel) {
    return new gRPCServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gRPCServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gRPCServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gRPCServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gRPCServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class gRPCServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void authenticateUser(com.cong.api.grpc.SigninRequest request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.SigninResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateUserMethod(), responseObserver);
    }

    /**
     */
    public void registerUser(com.cong.api.grpc.SignupRequest request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.SignupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    public void playGame(com.cong.api.grpc.ChoiceRequest request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.ChoiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayGameMethod(), responseObserver);
    }

    /**
     */
    public void getHistory(com.cong.api.grpc.MyMessage request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.HistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHistoryMethod(), responseObserver);
    }

    /**
     */
    public void getRanking(com.cong.api.grpc.MyMessage request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.RankingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRankingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuthenticateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cong.api.grpc.SigninRequest,
                com.cong.api.grpc.SigninResponse>(
                  this, METHODID_AUTHENTICATE_USER)))
          .addMethod(
            getRegisterUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cong.api.grpc.SignupRequest,
                com.cong.api.grpc.SignupResponse>(
                  this, METHODID_REGISTER_USER)))
          .addMethod(
            getPlayGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cong.api.grpc.ChoiceRequest,
                com.cong.api.grpc.ChoiceResponse>(
                  this, METHODID_PLAY_GAME)))
          .addMethod(
            getGetHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cong.api.grpc.MyMessage,
                com.cong.api.grpc.HistoryResponse>(
                  this, METHODID_GET_HISTORY)))
          .addMethod(
            getGetRankingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cong.api.grpc.MyMessage,
                com.cong.api.grpc.RankingResponse>(
                  this, METHODID_GET_RANKING)))
          .build();
    }
  }

  /**
   */
  public static final class gRPCServiceStub extends io.grpc.stub.AbstractStub<gRPCServiceStub> {
    private gRPCServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCServiceStub(channel, callOptions);
    }

    /**
     */
    public void authenticateUser(com.cong.api.grpc.SigninRequest request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.SigninResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerUser(com.cong.api.grpc.SignupRequest request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.SignupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void playGame(com.cong.api.grpc.ChoiceRequest request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.ChoiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHistory(com.cong.api.grpc.MyMessage request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.HistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRanking(com.cong.api.grpc.MyMessage request,
        io.grpc.stub.StreamObserver<com.cong.api.grpc.RankingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRankingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class gRPCServiceBlockingStub extends io.grpc.stub.AbstractStub<gRPCServiceBlockingStub> {
    private gRPCServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cong.api.grpc.SigninResponse authenticateUser(com.cong.api.grpc.SigninRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cong.api.grpc.SignupResponse registerUser(com.cong.api.grpc.SignupRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cong.api.grpc.ChoiceResponse playGame(com.cong.api.grpc.ChoiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getPlayGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cong.api.grpc.HistoryResponse getHistory(com.cong.api.grpc.MyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cong.api.grpc.RankingResponse getRanking(com.cong.api.grpc.MyMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetRankingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gRPCServiceFutureStub extends io.grpc.stub.AbstractStub<gRPCServiceFutureStub> {
    private gRPCServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gRPCServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cong.api.grpc.SigninResponse> authenticateUser(
        com.cong.api.grpc.SigninRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuthenticateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cong.api.grpc.SignupResponse> registerUser(
        com.cong.api.grpc.SignupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cong.api.grpc.ChoiceResponse> playGame(
        com.cong.api.grpc.ChoiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cong.api.grpc.HistoryResponse> getHistory(
        com.cong.api.grpc.MyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cong.api.grpc.RankingResponse> getRanking(
        com.cong.api.grpc.MyMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRankingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE_USER = 0;
  private static final int METHODID_REGISTER_USER = 1;
  private static final int METHODID_PLAY_GAME = 2;
  private static final int METHODID_GET_HISTORY = 3;
  private static final int METHODID_GET_RANKING = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gRPCServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gRPCServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE_USER:
          serviceImpl.authenticateUser((com.cong.api.grpc.SigninRequest) request,
              (io.grpc.stub.StreamObserver<com.cong.api.grpc.SigninResponse>) responseObserver);
          break;
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((com.cong.api.grpc.SignupRequest) request,
              (io.grpc.stub.StreamObserver<com.cong.api.grpc.SignupResponse>) responseObserver);
          break;
        case METHODID_PLAY_GAME:
          serviceImpl.playGame((com.cong.api.grpc.ChoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.cong.api.grpc.ChoiceResponse>) responseObserver);
          break;
        case METHODID_GET_HISTORY:
          serviceImpl.getHistory((com.cong.api.grpc.MyMessage) request,
              (io.grpc.stub.StreamObserver<com.cong.api.grpc.HistoryResponse>) responseObserver);
          break;
        case METHODID_GET_RANKING:
          serviceImpl.getRanking((com.cong.api.grpc.MyMessage) request,
              (io.grpc.stub.StreamObserver<com.cong.api.grpc.RankingResponse>) responseObserver);
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

  private static abstract class gRPCServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gRPCServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cong.api.grpc.GRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gRPCService");
    }
  }

  private static final class gRPCServiceFileDescriptorSupplier
      extends gRPCServiceBaseDescriptorSupplier {
    gRPCServiceFileDescriptorSupplier() {}
  }

  private static final class gRPCServiceMethodDescriptorSupplier
      extends gRPCServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gRPCServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (gRPCServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gRPCServiceFileDescriptorSupplier())
              .addMethod(getAuthenticateUserMethod())
              .addMethod(getRegisterUserMethod())
              .addMethod(getPlayGameMethod())
              .addMethod(getGetHistoryMethod())
              .addMethod(getGetRankingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
