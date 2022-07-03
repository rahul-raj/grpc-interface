package com.grpc.demo;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 *unary request
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: hello.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "grpcdemo.HelloService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.demo.HelloRequest,
      com.grpc.demo.HelloResponse> METHOD_HELLO =
      io.grpc.MethodDescriptor.<com.grpc.demo.HelloRequest, com.grpc.demo.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "grpcdemo.HelloService", "hello"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.demo.HelloRequest,
      com.grpc.demo.HelloResponse> METHOD_HELLO_SERVER_STREAMING =
      io.grpc.MethodDescriptor.<com.grpc.demo.HelloRequest, com.grpc.demo.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcdemo.HelloService", "helloServerStreaming"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.demo.SumRequest,
      com.grpc.demo.SumResponse> METHOD_HELLO_CLIENT_STREAMING =
      io.grpc.MethodDescriptor.<com.grpc.demo.SumRequest, com.grpc.demo.SumResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcdemo.HelloService", "helloClientStreaming"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.SumRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.SumResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grpc.demo.DuplexRequest,
      com.grpc.demo.DuplexResponse> METHOD_HELLO_DUPLEX =
      io.grpc.MethodDescriptor.<com.grpc.demo.DuplexRequest, com.grpc.demo.DuplexResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "grpcdemo.HelloService", "helloDuplex"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.DuplexRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.grpc.demo.DuplexResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   * <pre>
   *unary request
   * </pre>
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(com.grpc.demo.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HELLO, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void helloServerStreaming(com.grpc.demo.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HELLO_SERVER_STREAMING, responseObserver);
    }

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.SumRequest> helloClientStreaming(
        io.grpc.stub.StreamObserver<com.grpc.demo.SumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HELLO_CLIENT_STREAMING, responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.DuplexRequest> helloDuplex(
        io.grpc.stub.StreamObserver<com.grpc.demo.DuplexResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HELLO_DUPLEX, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.demo.HelloRequest,
                com.grpc.demo.HelloResponse>(
                  this, METHODID_HELLO)))
          .addMethod(
            METHOD_HELLO_SERVER_STREAMING,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.grpc.demo.HelloRequest,
                com.grpc.demo.HelloResponse>(
                  this, METHODID_HELLO_SERVER_STREAMING)))
          .addMethod(
            METHOD_HELLO_CLIENT_STREAMING,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.grpc.demo.SumRequest,
                com.grpc.demo.SumResponse>(
                  this, METHODID_HELLO_CLIENT_STREAMING)))
          .addMethod(
            METHOD_HELLO_DUPLEX,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.grpc.demo.DuplexRequest,
                com.grpc.demo.DuplexResponse>(
                  this, METHODID_HELLO_DUPLEX)))
          .build();
    }
  }

  /**
   * <pre>
   *unary request
   * </pre>
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.grpc.demo.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HELLO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void helloServerStreaming(com.grpc.demo.HelloRequest request,
        io.grpc.stub.StreamObserver<com.grpc.demo.HelloResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_HELLO_SERVER_STREAMING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.SumRequest> helloClientStreaming(
        io.grpc.stub.StreamObserver<com.grpc.demo.SumResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_HELLO_CLIENT_STREAMING, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.grpc.demo.DuplexRequest> helloDuplex(
        io.grpc.stub.StreamObserver<com.grpc.demo.DuplexResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_HELLO_DUPLEX, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *unary request
   * </pre>
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.demo.HelloResponse hello(com.grpc.demo.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HELLO, getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<com.grpc.demo.HelloResponse> helloServerStreaming(
        com.grpc.demo.HelloRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_HELLO_SERVER_STREAMING, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *unary request
   * </pre>
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.demo.HelloResponse> hello(
        com.grpc.demo.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_HELLO_SERVER_STREAMING = 1;
  private static final int METHODID_HELLO_CLIENT_STREAMING = 2;
  private static final int METHODID_HELLO_DUPLEX = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.grpc.demo.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO_SERVER_STREAMING:
          serviceImpl.helloServerStreaming((com.grpc.demo.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.demo.HelloResponse>) responseObserver);
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
        case METHODID_HELLO_CLIENT_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloClientStreaming(
              (io.grpc.stub.StreamObserver<com.grpc.demo.SumResponse>) responseObserver);
        case METHODID_HELLO_DUPLEX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloDuplex(
              (io.grpc.stub.StreamObserver<com.grpc.demo.DuplexResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class HelloServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.demo.Hello.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceDescriptorSupplier())
              .addMethod(METHOD_HELLO)
              .addMethod(METHOD_HELLO_SERVER_STREAMING)
              .addMethod(METHOD_HELLO_CLIENT_STREAMING)
              .addMethod(METHOD_HELLO_DUPLEX)
              .build();
        }
      }
    }
    return result;
  }
}
