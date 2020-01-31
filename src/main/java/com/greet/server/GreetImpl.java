package com.greet.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {

        String name=request.getGreeting().getFirstName();
        String result="hello "+name;

        GreetResponse res= GreetResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }


    @Override
    public void greetMany(GreetManyRequest request, StreamObserver<GreetManyResponse> responseObserver) {


        String name=request.getGreeting().getFirstName();
        String result="hello "+name;

        GreetManyResponse res= GreetManyResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(res);

        result="Hi "+name;
        res= GreetManyResponse.newBuilder().setResult(result).build();
        responseObserver.onNext(res);

        responseObserver.onCompleted();


    }

    @Override
    public StreamObserver<LongGreetRequest> greetLong(StreamObserver<LongGreetResponse> responseObserver) {

        StreamObserver req=new StreamObserver<LongGreetRequest>() {

            String name="hello ";
            @Override
            public void onNext(LongGreetRequest value) {
                name+=value.getGreeting().getFirstName()+" ";
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                responseObserver.onNext(
                        LongGreetResponse.newBuilder().setResult(name).build()
                );

                responseObserver.onCompleted();

            }
        };

        return req;
    }

    @Override
    public StreamObserver<GreetEveryoneRequest> greetEveryone(StreamObserver<GreetEveryoneResponse> responseObserver) {

        StreamObserver<GreetEveryoneRequest> req = new StreamObserver<GreetEveryoneRequest>() {

            @Override
            public void onNext(GreetEveryoneRequest value) {
                String name = "hello ";

                name += value.getGreeting().getFirstName();

                GreetEveryoneResponse res= GreetEveryoneResponse.newBuilder()
                        .setResult(name)
                        .build();
                responseObserver.onNext(res);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

                responseObserver.onCompleted();



            }
        };
        return req;

    }

}
