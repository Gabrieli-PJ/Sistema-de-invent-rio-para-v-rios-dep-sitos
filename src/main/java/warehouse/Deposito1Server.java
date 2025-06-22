package warehouse;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Deposito1Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50052;
        Server server = ServerBuilder.forPort(port)
                .addService(new WarehouseServiceImpl("Deposito1"))
                .build()
                .start();

        System.out.println("Servidor do depósito 1 rodando na porta " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Servidor do depósito 1 iniciado...");
            if (server != null) {
                server.shutdown();
            }
            System.out.println("Servidor do depósito 1 parado.");
        }));

        server.awaitTermination();
    }
}
