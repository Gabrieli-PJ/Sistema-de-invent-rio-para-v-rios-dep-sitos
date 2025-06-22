package warehouse;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Deposito2Server {
    public static void main(String[] args) throws IOException, InterruptedException {
    	int port = 50053;
        Server server = ServerBuilder.forPort(port)
                .addService(new WarehouseServiceImpl("Deposito2"))
                .build()
                .start();

        System.out.println("Servidor do depósito 2 rodando na porta " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Servidor do depósito 2 iniciado...");
            if (server != null) {
                server.shutdown();
            }
            System.out.println("Servidor do depósito 2 parado.");
        }));

        server.awaitTermination();
    }
}
