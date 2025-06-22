package ordermanager;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class OrderManagerServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new OrderManagerServiceImpl())
                .build()
                .start();

        System.out.println("OrderManagerServer rodando na porta " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown do servidor iniciado...");
            if (server != null) {
                server.shutdown();
            }
            System.out.println("Servidor parado.");
        }));

        server.awaitTermination();
    }
}
