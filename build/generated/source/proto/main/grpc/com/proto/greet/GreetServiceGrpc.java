package com.proto.greet;

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
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: dummy/hello.proto")
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.proto.greet.GreetRequest.class,
      responseType = com.proto.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetManyRequest,
      com.proto.greet.GreetManyResponse> getGreetManyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetMany",
      requestType = com.proto.greet.GreetManyRequest.class,
      responseType = com.proto.greet.GreetManyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetManyRequest,
      com.proto.greet.GreetManyResponse> getGreetManyMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetManyRequest, com.proto.greet.GreetManyResponse> getGreetManyMethod;
    if ((getGreetManyMethod = GreetServiceGrpc.getGreetManyMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyMethod = GreetServiceGrpc.getGreetManyMethod) == null) {
          GreetServiceGrpc.getGreetManyMethod = getGreetManyMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetManyRequest, com.proto.greet.GreetManyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetMany"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetManyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetManyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetMany"))
              .build();
        }
      }
    }
    return getGreetManyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest,
      com.proto.greet.LongGreetResponse> getGreetLongMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetLong",
      requestType = com.proto.greet.LongGreetRequest.class,
      responseType = com.proto.greet.LongGreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest,
      com.proto.greet.LongGreetResponse> getGreetLongMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest, com.proto.greet.LongGreetResponse> getGreetLongMethod;
    if ((getGreetLongMethod = GreetServiceGrpc.getGreetLongMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetLongMethod = GreetServiceGrpc.getGreetLongMethod) == null) {
          GreetServiceGrpc.getGreetLongMethod = getGreetLongMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.LongGreetRequest, com.proto.greet.LongGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.LongGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.LongGreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetLong"))
              .build();
        }
      }
    }
    return getGreetLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetEveryoneRequest,
      com.proto.greet.GreetEveryoneResponse> getGreetEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetEveryone",
      requestType = com.proto.greet.GreetEveryoneRequest.class,
      responseType = com.proto.greet.GreetEveryoneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetEveryoneRequest,
      com.proto.greet.GreetEveryoneResponse> getGreetEveryoneMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetEveryoneRequest, com.proto.greet.GreetEveryoneResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
          GreetServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetEveryoneRequest, com.proto.greet.GreetEveryoneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetEveryoneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetEveryoneResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetEveryone"))
              .build();
        }
      }
    }
    return getGreetEveryoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     */
    public void greetMany(com.proto.greet.GreetManyRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetManyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetManyMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.LongGreetRequest> greetLong(
        io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetLongMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryoneResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGreetEveryoneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.greet.GreetRequest,
                com.proto.greet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetManyRequest,
                com.proto.greet.GreetManyResponse>(
                  this, METHODID_GREET_MANY)))
          .addMethod(
            getGreetLongMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.greet.LongGreetRequest,
                com.proto.greet.LongGreetResponse>(
                  this, METHODID_GREET_LONG)))
          .addMethod(
            getGreetEveryoneMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetEveryoneRequest,
                com.proto.greet.GreetEveryoneResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void greetMany(com.proto.greet.GreetManyRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetManyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGreetManyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.LongGreetRequest> greetLong(
        io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGreetLongMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryoneRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryoneResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.proto.greet.GreetResponse greet(com.proto.greet.GreetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.greet.GreetManyResponse> greetMany(
        com.proto.greet.GreetManyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGreetManyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greet.GreetResponse> greet(
        com.proto.greet.GreetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY = 1;
  private static final int METHODID_GREET_LONG = 2;
  private static final int METHODID_GREET_EVERYONE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY:
          serviceImpl.greetMany((com.proto.greet.GreetManyRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetManyResponse>) responseObserver);
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
        case METHODID_GREET_LONG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetLong(
              (io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse>) responseObserver);
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetEveryoneResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.greet.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyMethod())
              .addMethod(getGreetLongMethod())
              .addMethod(getGreetEveryoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
