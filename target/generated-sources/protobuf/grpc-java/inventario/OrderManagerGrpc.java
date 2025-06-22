package inventario;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: inventario.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderManagerGrpc {

  private OrderManagerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "inventario.OrderManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<inventario.Inventario.PedidoRequest,
      inventario.Inventario.PedidoResponse> getFazerPedidoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fazerPedido",
      requestType = inventario.Inventario.PedidoRequest.class,
      responseType = inventario.Inventario.PedidoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventario.Inventario.PedidoRequest,
      inventario.Inventario.PedidoResponse> getFazerPedidoMethod() {
    io.grpc.MethodDescriptor<inventario.Inventario.PedidoRequest, inventario.Inventario.PedidoResponse> getFazerPedidoMethod;
    if ((getFazerPedidoMethod = OrderManagerGrpc.getFazerPedidoMethod) == null) {
      synchronized (OrderManagerGrpc.class) {
        if ((getFazerPedidoMethod = OrderManagerGrpc.getFazerPedidoMethod) == null) {
          OrderManagerGrpc.getFazerPedidoMethod = getFazerPedidoMethod =
              io.grpc.MethodDescriptor.<inventario.Inventario.PedidoRequest, inventario.Inventario.PedidoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fazerPedido"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.PedidoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.PedidoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderManagerMethodDescriptorSupplier("fazerPedido"))
              .build();
        }
      }
    }
    return getFazerPedidoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest,
      inventario.Inventario.AtualizacaoResponse> getAdicionarEstoqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adicionarEstoque",
      requestType = inventario.Inventario.AtualizacaoRequest.class,
      responseType = inventario.Inventario.AtualizacaoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest,
      inventario.Inventario.AtualizacaoResponse> getAdicionarEstoqueMethod() {
    io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest, inventario.Inventario.AtualizacaoResponse> getAdicionarEstoqueMethod;
    if ((getAdicionarEstoqueMethod = OrderManagerGrpc.getAdicionarEstoqueMethod) == null) {
      synchronized (OrderManagerGrpc.class) {
        if ((getAdicionarEstoqueMethod = OrderManagerGrpc.getAdicionarEstoqueMethod) == null) {
          OrderManagerGrpc.getAdicionarEstoqueMethod = getAdicionarEstoqueMethod =
              io.grpc.MethodDescriptor.<inventario.Inventario.AtualizacaoRequest, inventario.Inventario.AtualizacaoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "adicionarEstoque"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.AtualizacaoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.AtualizacaoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderManagerMethodDescriptorSupplier("adicionarEstoque"))
              .build();
        }
      }
    }
    return getAdicionarEstoqueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest,
      inventario.Inventario.AtualizacaoResponse> getRemoverEstoqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removerEstoque",
      requestType = inventario.Inventario.AtualizacaoRequest.class,
      responseType = inventario.Inventario.AtualizacaoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest,
      inventario.Inventario.AtualizacaoResponse> getRemoverEstoqueMethod() {
    io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest, inventario.Inventario.AtualizacaoResponse> getRemoverEstoqueMethod;
    if ((getRemoverEstoqueMethod = OrderManagerGrpc.getRemoverEstoqueMethod) == null) {
      synchronized (OrderManagerGrpc.class) {
        if ((getRemoverEstoqueMethod = OrderManagerGrpc.getRemoverEstoqueMethod) == null) {
          OrderManagerGrpc.getRemoverEstoqueMethod = getRemoverEstoqueMethod =
              io.grpc.MethodDescriptor.<inventario.Inventario.AtualizacaoRequest, inventario.Inventario.AtualizacaoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removerEstoque"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.AtualizacaoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.AtualizacaoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderManagerMethodDescriptorSupplier("removerEstoque"))
              .build();
        }
      }
    }
    return getRemoverEstoqueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderManagerStub>() {
        @java.lang.Override
        public OrderManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderManagerStub(channel, callOptions);
        }
      };
    return OrderManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderManagerBlockingStub>() {
        @java.lang.Override
        public OrderManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderManagerBlockingStub(channel, callOptions);
        }
      };
    return OrderManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderManagerFutureStub>() {
        @java.lang.Override
        public OrderManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderManagerFutureStub(channel, callOptions);
        }
      };
    return OrderManagerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void fazerPedido(inventario.Inventario.PedidoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.PedidoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFazerPedidoMethod(), responseObserver);
    }

    /**
     */
    default void adicionarEstoque(inventario.Inventario.AtualizacaoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAdicionarEstoqueMethod(), responseObserver);
    }

    /**
     */
    default void removerEstoque(inventario.Inventario.AtualizacaoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoverEstoqueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrderManager.
   */
  public static abstract class OrderManagerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrderManagerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrderManager.
   */
  public static final class OrderManagerStub
      extends io.grpc.stub.AbstractAsyncStub<OrderManagerStub> {
    private OrderManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderManagerStub(channel, callOptions);
    }

    /**
     */
    public void fazerPedido(inventario.Inventario.PedidoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.PedidoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFazerPedidoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adicionarEstoque(inventario.Inventario.AtualizacaoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAdicionarEstoqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removerEstoque(inventario.Inventario.AtualizacaoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoverEstoqueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrderManager.
   */
  public static final class OrderManagerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrderManagerBlockingStub> {
    private OrderManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public inventario.Inventario.PedidoResponse fazerPedido(inventario.Inventario.PedidoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFazerPedidoMethod(), getCallOptions(), request);
    }

    /**
     */
    public inventario.Inventario.AtualizacaoResponse adicionarEstoque(inventario.Inventario.AtualizacaoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAdicionarEstoqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public inventario.Inventario.AtualizacaoResponse removerEstoque(inventario.Inventario.AtualizacaoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoverEstoqueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrderManager.
   */
  public static final class OrderManagerFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrderManagerFutureStub> {
    private OrderManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventario.Inventario.PedidoResponse> fazerPedido(
        inventario.Inventario.PedidoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFazerPedidoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventario.Inventario.AtualizacaoResponse> adicionarEstoque(
        inventario.Inventario.AtualizacaoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAdicionarEstoqueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventario.Inventario.AtualizacaoResponse> removerEstoque(
        inventario.Inventario.AtualizacaoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoverEstoqueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FAZER_PEDIDO = 0;
  private static final int METHODID_ADICIONAR_ESTOQUE = 1;
  private static final int METHODID_REMOVER_ESTOQUE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FAZER_PEDIDO:
          serviceImpl.fazerPedido((inventario.Inventario.PedidoRequest) request,
              (io.grpc.stub.StreamObserver<inventario.Inventario.PedidoResponse>) responseObserver);
          break;
        case METHODID_ADICIONAR_ESTOQUE:
          serviceImpl.adicionarEstoque((inventario.Inventario.AtualizacaoRequest) request,
              (io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse>) responseObserver);
          break;
        case METHODID_REMOVER_ESTOQUE:
          serviceImpl.removerEstoque((inventario.Inventario.AtualizacaoRequest) request,
              (io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFazerPedidoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              inventario.Inventario.PedidoRequest,
              inventario.Inventario.PedidoResponse>(
                service, METHODID_FAZER_PEDIDO)))
        .addMethod(
          getAdicionarEstoqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              inventario.Inventario.AtualizacaoRequest,
              inventario.Inventario.AtualizacaoResponse>(
                service, METHODID_ADICIONAR_ESTOQUE)))
        .addMethod(
          getRemoverEstoqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              inventario.Inventario.AtualizacaoRequest,
              inventario.Inventario.AtualizacaoResponse>(
                service, METHODID_REMOVER_ESTOQUE)))
        .build();
  }

  private static abstract class OrderManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return inventario.Inventario.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderManager");
    }
  }

  private static final class OrderManagerFileDescriptorSupplier
      extends OrderManagerBaseDescriptorSupplier {
    OrderManagerFileDescriptorSupplier() {}
  }

  private static final class OrderManagerMethodDescriptorSupplier
      extends OrderManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrderManagerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrderManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderManagerFileDescriptorSupplier())
              .addMethod(getFazerPedidoMethod())
              .addMethod(getAdicionarEstoqueMethod())
              .addMethod(getRemoverEstoqueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
