package inventario;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: inventario.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WarehouseGrpc {

  private WarehouseGrpc() {}

  public static final java.lang.String SERVICE_NAME = "inventario.Warehouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<inventario.Inventario.EstoqueRequest,
      inventario.Inventario.EstoqueResponse> getVerificarEstoqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verificarEstoque",
      requestType = inventario.Inventario.EstoqueRequest.class,
      responseType = inventario.Inventario.EstoqueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventario.Inventario.EstoqueRequest,
      inventario.Inventario.EstoqueResponse> getVerificarEstoqueMethod() {
    io.grpc.MethodDescriptor<inventario.Inventario.EstoqueRequest, inventario.Inventario.EstoqueResponse> getVerificarEstoqueMethod;
    if ((getVerificarEstoqueMethod = WarehouseGrpc.getVerificarEstoqueMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getVerificarEstoqueMethod = WarehouseGrpc.getVerificarEstoqueMethod) == null) {
          WarehouseGrpc.getVerificarEstoqueMethod = getVerificarEstoqueMethod =
              io.grpc.MethodDescriptor.<inventario.Inventario.EstoqueRequest, inventario.Inventario.EstoqueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verificarEstoque"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.EstoqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.EstoqueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("verificarEstoque"))
              .build();
        }
      }
    }
    return getVerificarEstoqueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest,
      inventario.Inventario.AtualizacaoResponse> getAtualizarEstoqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "atualizarEstoque",
      requestType = inventario.Inventario.AtualizacaoRequest.class,
      responseType = inventario.Inventario.AtualizacaoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest,
      inventario.Inventario.AtualizacaoResponse> getAtualizarEstoqueMethod() {
    io.grpc.MethodDescriptor<inventario.Inventario.AtualizacaoRequest, inventario.Inventario.AtualizacaoResponse> getAtualizarEstoqueMethod;
    if ((getAtualizarEstoqueMethod = WarehouseGrpc.getAtualizarEstoqueMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getAtualizarEstoqueMethod = WarehouseGrpc.getAtualizarEstoqueMethod) == null) {
          WarehouseGrpc.getAtualizarEstoqueMethod = getAtualizarEstoqueMethod =
              io.grpc.MethodDescriptor.<inventario.Inventario.AtualizacaoRequest, inventario.Inventario.AtualizacaoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "atualizarEstoque"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.AtualizacaoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.AtualizacaoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("atualizarEstoque"))
              .build();
        }
      }
    }
    return getAtualizarEstoqueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<inventario.Inventario.CargaRequest,
      inventario.Inventario.CargaResponse> getConsultarCargaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consultarCarga",
      requestType = inventario.Inventario.CargaRequest.class,
      responseType = inventario.Inventario.CargaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<inventario.Inventario.CargaRequest,
      inventario.Inventario.CargaResponse> getConsultarCargaMethod() {
    io.grpc.MethodDescriptor<inventario.Inventario.CargaRequest, inventario.Inventario.CargaResponse> getConsultarCargaMethod;
    if ((getConsultarCargaMethod = WarehouseGrpc.getConsultarCargaMethod) == null) {
      synchronized (WarehouseGrpc.class) {
        if ((getConsultarCargaMethod = WarehouseGrpc.getConsultarCargaMethod) == null) {
          WarehouseGrpc.getConsultarCargaMethod = getConsultarCargaMethod =
              io.grpc.MethodDescriptor.<inventario.Inventario.CargaRequest, inventario.Inventario.CargaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "consultarCarga"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.CargaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  inventario.Inventario.CargaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WarehouseMethodDescriptorSupplier("consultarCarga"))
              .build();
        }
      }
    }
    return getConsultarCargaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WarehouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseStub>() {
        @java.lang.Override
        public WarehouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseStub(channel, callOptions);
        }
      };
    return WarehouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WarehouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseBlockingStub>() {
        @java.lang.Override
        public WarehouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseBlockingStub(channel, callOptions);
        }
      };
    return WarehouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WarehouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WarehouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WarehouseFutureStub>() {
        @java.lang.Override
        public WarehouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WarehouseFutureStub(channel, callOptions);
        }
      };
    return WarehouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void verificarEstoque(inventario.Inventario.EstoqueRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.EstoqueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerificarEstoqueMethod(), responseObserver);
    }

    /**
     */
    default void atualizarEstoque(inventario.Inventario.AtualizacaoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAtualizarEstoqueMethod(), responseObserver);
    }

    /**
     */
    default void consultarCarga(inventario.Inventario.CargaRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.CargaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultarCargaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Warehouse.
   */
  public static abstract class WarehouseImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WarehouseGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Warehouse.
   */
  public static final class WarehouseStub
      extends io.grpc.stub.AbstractAsyncStub<WarehouseStub> {
    private WarehouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseStub(channel, callOptions);
    }

    /**
     */
    public void verificarEstoque(inventario.Inventario.EstoqueRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.EstoqueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerificarEstoqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void atualizarEstoque(inventario.Inventario.AtualizacaoRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAtualizarEstoqueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void consultarCarga(inventario.Inventario.CargaRequest request,
        io.grpc.stub.StreamObserver<inventario.Inventario.CargaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultarCargaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Warehouse.
   */
  public static final class WarehouseBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WarehouseBlockingStub> {
    private WarehouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public inventario.Inventario.EstoqueResponse verificarEstoque(inventario.Inventario.EstoqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerificarEstoqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public inventario.Inventario.AtualizacaoResponse atualizarEstoque(inventario.Inventario.AtualizacaoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAtualizarEstoqueMethod(), getCallOptions(), request);
    }

    /**
     */
    public inventario.Inventario.CargaResponse consultarCarga(inventario.Inventario.CargaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultarCargaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Warehouse.
   */
  public static final class WarehouseFutureStub
      extends io.grpc.stub.AbstractFutureStub<WarehouseFutureStub> {
    private WarehouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WarehouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventario.Inventario.EstoqueResponse> verificarEstoque(
        inventario.Inventario.EstoqueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerificarEstoqueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventario.Inventario.AtualizacaoResponse> atualizarEstoque(
        inventario.Inventario.AtualizacaoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAtualizarEstoqueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<inventario.Inventario.CargaResponse> consultarCarga(
        inventario.Inventario.CargaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultarCargaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VERIFICAR_ESTOQUE = 0;
  private static final int METHODID_ATUALIZAR_ESTOQUE = 1;
  private static final int METHODID_CONSULTAR_CARGA = 2;

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
        case METHODID_VERIFICAR_ESTOQUE:
          serviceImpl.verificarEstoque((inventario.Inventario.EstoqueRequest) request,
              (io.grpc.stub.StreamObserver<inventario.Inventario.EstoqueResponse>) responseObserver);
          break;
        case METHODID_ATUALIZAR_ESTOQUE:
          serviceImpl.atualizarEstoque((inventario.Inventario.AtualizacaoRequest) request,
              (io.grpc.stub.StreamObserver<inventario.Inventario.AtualizacaoResponse>) responseObserver);
          break;
        case METHODID_CONSULTAR_CARGA:
          serviceImpl.consultarCarga((inventario.Inventario.CargaRequest) request,
              (io.grpc.stub.StreamObserver<inventario.Inventario.CargaResponse>) responseObserver);
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
          getVerificarEstoqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              inventario.Inventario.EstoqueRequest,
              inventario.Inventario.EstoqueResponse>(
                service, METHODID_VERIFICAR_ESTOQUE)))
        .addMethod(
          getAtualizarEstoqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              inventario.Inventario.AtualizacaoRequest,
              inventario.Inventario.AtualizacaoResponse>(
                service, METHODID_ATUALIZAR_ESTOQUE)))
        .addMethod(
          getConsultarCargaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              inventario.Inventario.CargaRequest,
              inventario.Inventario.CargaResponse>(
                service, METHODID_CONSULTAR_CARGA)))
        .build();
  }

  private static abstract class WarehouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WarehouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return inventario.Inventario.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Warehouse");
    }
  }

  private static final class WarehouseFileDescriptorSupplier
      extends WarehouseBaseDescriptorSupplier {
    WarehouseFileDescriptorSupplier() {}
  }

  private static final class WarehouseMethodDescriptorSupplier
      extends WarehouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WarehouseMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WarehouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WarehouseFileDescriptorSupplier())
              .addMethod(getVerificarEstoqueMethod())
              .addMethod(getAtualizarEstoqueMethod())
              .addMethod(getConsultarCargaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
