package com.greet.client;

import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetClient {



    public void uni(ManagedChannel channel){
        GreetServiceGrpc.GreetServiceBlockingStub client=GreetServiceGrpc.newBlockingStub(channel);

        //GreetServiceGrpc.GreetServiceFutureStub aclient=GreetServiceGrpc.newFutureStub(channel);
        System.out.println("client running");

        Greeting greet= Greeting.newBuilder()
                .setFirstName("Rohan")
                .setLastName("Wayachal")
                .build();

        GreetRequest req= GreetRequest.newBuilder()
                .setGreeting(greet)
                .build();


        GreetResponse res=client.greet(req);
        System.out.println(res.getResult());

    }


    public void serverstream(ManagedChannel channel){
        GreetServiceGrpc.GreetServiceBlockingStub client=GreetServiceGrpc.newBlockingStub(channel);

        //GreetServiceGrpc.GreetServiceFutureStub aclient=GreetServiceGrpc.newFutureStub(channel);
        System.out.println("client running");

        Greeting greet= Greeting.newBuilder()
                .setFirstName("Rohan")
                .setLastName("Wayachal")
                .build();

        GreetManyRequest req= GreetManyRequest.newBuilder()
                .setGreeting(greet)
                .build();


        client.greetMany(req).forEachRemaining(res->{
            System.out.println(res.getResult());
        });

    }

    public void clientstream(ManagedChannel channel) {
       // GreetServiceGrpc.GreetServiceBlockingStub client=GreetServiceGrpc.newBlockingStub(channel);

        GreetServiceGrpc.GreetServiceStub aclient=GreetServiceGrpc.newStub( channel);
        System.out.println("client running");

        CountDownLatch latch=new CountDownLatch(1);

        StreamObserver req=aclient.greetLong(new StreamObserver<LongGreetResponse>() {
            @Override
            public void onNext(LongGreetResponse value) {
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();

            }
        });

        req.onNext(LongGreetRequest
                .newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Rohan").setLastName("Wayachal").build())
                .build()
        );
        req.onNext(LongGreetRequest
                .newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Sumeet").setLastName("Wayachal").build())
                .build()
        );

        req.onCompleted();
        try {
            latch.await(3L, TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println(e);
        }


    //aclient.greetlong()


    }


    public void bistream(ManagedChannel channel) {
        // GreetServiceGrpc.GreetServiceBlockingStub client=GreetServiceGrpc.newBlockingStub(channel);

        GreetServiceGrpc.GreetServiceStub aclient=GreetServiceGrpc.newStub( channel);
        System.out.println("client running");

        CountDownLatch latch=new CountDownLatch(1);

        StreamObserver req=aclient.greetEveryone(new StreamObserver<GreetEveryoneResponse>() {
            @Override
            public void onNext(GreetEveryoneResponse value) {
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                latch.countDown();

            }
        });


        Arrays.asList("Rohan","Wayachal").forEach(name->{

            req.onNext(LongGreetRequest
                    .newBuilder()
                    .setGreeting(Greeting.newBuilder().setFirstName(name).setLastName("Wayachal").build())
                    .build()
            );

        });


        req.onCompleted();
        try {
            latch.await(3L, TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println(e);
        }


        //aclient.greetlong()


    }





    public static void main(String[] args) {
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",5001)
                .usePlaintext()
                .build();
        GreetClient cl=new GreetClient();
        cl.bistream(channel);



        channel.shutdown();
    }
}
