package com.medical.clinic.bookingService;

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
 * <pre>
 *srevice greeter could call for me bank or medical clinic
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: booking.proto")
public final class BookingGrpc {

  private BookingGrpc() {}

  public static final String SERVICE_NAME = "booking.Booking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.medical.clinic.bookingService.FreeDateRequest2,
      com.medical.clinic.bookingService.FreeDateReply2> getAskFreeDatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "askFreeDates",
      requestType = com.medical.clinic.bookingService.FreeDateRequest2.class,
      responseType = com.medical.clinic.bookingService.FreeDateReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medical.clinic.bookingService.FreeDateRequest2,
      com.medical.clinic.bookingService.FreeDateReply2> getAskFreeDatesMethod() {
    io.grpc.MethodDescriptor<com.medical.clinic.bookingService.FreeDateRequest2, com.medical.clinic.bookingService.FreeDateReply2> getAskFreeDatesMethod;
    if ((getAskFreeDatesMethod = BookingGrpc.getAskFreeDatesMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getAskFreeDatesMethod = BookingGrpc.getAskFreeDatesMethod) == null) {
          BookingGrpc.getAskFreeDatesMethod = getAskFreeDatesMethod = 
              io.grpc.MethodDescriptor.<com.medical.clinic.bookingService.FreeDateRequest2, com.medical.clinic.bookingService.FreeDateReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking.Booking", "askFreeDates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medical.clinic.bookingService.FreeDateRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medical.clinic.bookingService.FreeDateReply2.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("askFreeDates"))
                  .build();
          }
        }
     }
     return getAskFreeDatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.medical.clinic.bookingService.FreeDateRequest2,
      com.medical.clinic.bookingService.FreeDateReply2> getAskFreeDatesAgainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "askFreeDatesAgain",
      requestType = com.medical.clinic.bookingService.FreeDateRequest2.class,
      responseType = com.medical.clinic.bookingService.FreeDateReply2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.medical.clinic.bookingService.FreeDateRequest2,
      com.medical.clinic.bookingService.FreeDateReply2> getAskFreeDatesAgainMethod() {
    io.grpc.MethodDescriptor<com.medical.clinic.bookingService.FreeDateRequest2, com.medical.clinic.bookingService.FreeDateReply2> getAskFreeDatesAgainMethod;
    if ((getAskFreeDatesAgainMethod = BookingGrpc.getAskFreeDatesAgainMethod) == null) {
      synchronized (BookingGrpc.class) {
        if ((getAskFreeDatesAgainMethod = BookingGrpc.getAskFreeDatesAgainMethod) == null) {
          BookingGrpc.getAskFreeDatesAgainMethod = getAskFreeDatesAgainMethod = 
              io.grpc.MethodDescriptor.<com.medical.clinic.bookingService.FreeDateRequest2, com.medical.clinic.bookingService.FreeDateReply2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking.Booking", "askFreeDatesAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medical.clinic.bookingService.FreeDateRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.medical.clinic.bookingService.FreeDateReply2.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingMethodDescriptorSupplier("askFreeDatesAgain"))
                  .build();
          }
        }
     }
     return getAskFreeDatesAgainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingStub newStub(io.grpc.Channel channel) {
    return new BookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingFutureStub(channel);
  }

  /**
   * <pre>
   *srevice greeter could call for me bank or medical clinic
   * </pre>
   */
  public static abstract class BookingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *say hello unary type
     * </pre>
     */
    public void askFreeDates(com.medical.clinic.bookingService.FreeDateRequest2 request,
        io.grpc.stub.StreamObserver<com.medical.clinic.bookingService.FreeDateReply2> responseObserver) {
      asyncUnimplementedUnaryCall(getAskFreeDatesMethod(), responseObserver);
    }

    /**
     * <pre>
     *say one more time Hello
     * </pre>
     */
    public void askFreeDatesAgain(com.medical.clinic.bookingService.FreeDateRequest2 request,
        io.grpc.stub.StreamObserver<com.medical.clinic.bookingService.FreeDateReply2> responseObserver) {
      asyncUnimplementedUnaryCall(getAskFreeDatesAgainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAskFreeDatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.medical.clinic.bookingService.FreeDateRequest2,
                com.medical.clinic.bookingService.FreeDateReply2>(
                  this, METHODID_ASK_FREE_DATES)))
          .addMethod(
            getAskFreeDatesAgainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.medical.clinic.bookingService.FreeDateRequest2,
                com.medical.clinic.bookingService.FreeDateReply2>(
                  this, METHODID_ASK_FREE_DATES_AGAIN)))
          .build();
    }
  }

  /**
   * <pre>
   *srevice greeter could call for me bank or medical clinic
   * </pre>
   */
  public static final class BookingStub extends io.grpc.stub.AbstractStub<BookingStub> {
    private BookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingStub(channel, callOptions);
    }

    /**
     * <pre>
     *say hello unary type
     * </pre>
     */
    public void askFreeDates(com.medical.clinic.bookingService.FreeDateRequest2 request,
        io.grpc.stub.StreamObserver<com.medical.clinic.bookingService.FreeDateReply2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAskFreeDatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *say one more time Hello
     * </pre>
     */
    public void askFreeDatesAgain(com.medical.clinic.bookingService.FreeDateRequest2 request,
        io.grpc.stub.StreamObserver<com.medical.clinic.bookingService.FreeDateReply2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAskFreeDatesAgainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *srevice greeter could call for me bank or medical clinic
   * </pre>
   */
  public static final class BookingBlockingStub extends io.grpc.stub.AbstractStub<BookingBlockingStub> {
    private BookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *say hello unary type
     * </pre>
     */
    public com.medical.clinic.bookingService.FreeDateReply2 askFreeDates(com.medical.clinic.bookingService.FreeDateRequest2 request) {
      return blockingUnaryCall(
          getChannel(), getAskFreeDatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *say one more time Hello
     * </pre>
     */
    public com.medical.clinic.bookingService.FreeDateReply2 askFreeDatesAgain(com.medical.clinic.bookingService.FreeDateRequest2 request) {
      return blockingUnaryCall(
          getChannel(), getAskFreeDatesAgainMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *srevice greeter could call for me bank or medical clinic
   * </pre>
   */
  public static final class BookingFutureStub extends io.grpc.stub.AbstractStub<BookingFutureStub> {
    private BookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *say hello unary type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medical.clinic.bookingService.FreeDateReply2> askFreeDates(
        com.medical.clinic.bookingService.FreeDateRequest2 request) {
      return futureUnaryCall(
          getChannel().newCall(getAskFreeDatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *say one more time Hello
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.medical.clinic.bookingService.FreeDateReply2> askFreeDatesAgain(
        com.medical.clinic.bookingService.FreeDateRequest2 request) {
      return futureUnaryCall(
          getChannel().newCall(getAskFreeDatesAgainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASK_FREE_DATES = 0;
  private static final int METHODID_ASK_FREE_DATES_AGAIN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASK_FREE_DATES:
          serviceImpl.askFreeDates((com.medical.clinic.bookingService.FreeDateRequest2) request,
              (io.grpc.stub.StreamObserver<com.medical.clinic.bookingService.FreeDateReply2>) responseObserver);
          break;
        case METHODID_ASK_FREE_DATES_AGAIN:
          serviceImpl.askFreeDatesAgain((com.medical.clinic.bookingService.FreeDateRequest2) request,
              (io.grpc.stub.StreamObserver<com.medical.clinic.bookingService.FreeDateReply2>) responseObserver);
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

  private static abstract class BookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.medical.clinic.bookingService.bookingProtoService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Booking");
    }
  }

  private static final class BookingFileDescriptorSupplier
      extends BookingBaseDescriptorSupplier {
    BookingFileDescriptorSupplier() {}
  }

  private static final class BookingMethodDescriptorSupplier
      extends BookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingFileDescriptorSupplier())
              .addMethod(getAskFreeDatesMethod())
              .addMethod(getAskFreeDatesAgainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
