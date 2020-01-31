package com.greet.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GreetServer {


    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(5001)
                .addService(new GreetImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("shuting down");
            server.shutdown();
        }));

        System.out.println("server running");


        server.awaitTermination();
    }



}
