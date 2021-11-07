package com.medical.clinic.bookingService;
//Marek

import com.medical.clinic.bookingService.*;
import com.medical.clinic.bookingService.FreeDateReply2;
import com.medical.clinic.bookingService.FreeDateRequest2;
import com.medical.clinic.bookingService.BookingGrpc.BookingImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class BookingServer extends BookingImplBase {
	public static void main(String[] args) {
		int port = 50051;// same port what is in client
		
		BookingServer worldWorldServer = new BookingServer();
		
		try {
			Server server = ServerBuilder.forPort(port)
					.addService(worldWorldServer)
					.build().start();	
			server.awaitTermination();
		} catch(Exception e){
			System.out.println(e);
			
		}//end catch
	}//end main method
	
	@Override
	public void askFreeDates(FreeDateRequest2 request, StreamObserver<FreeDateReply2> responseObserver) {
		System.out.println("you called the server");
		
		FreeDateReply2 reply = FreeDateReply2.newBuilder()
				.setMessage("What can I do for You?"+ request.getName()).build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
	@Override
	public void askFreeDatesAgain(FreeDateRequest2 request2, StreamObserver<FreeDateReply2> responseObserver2) {
		System.out.println("you called the server again");
		
		FreeDateReply2 replyTwo2 = FreeDateReply2.newBuilder()
				.setMessage("Hello again"+ request2.getName()).build();
		
		responseObserver2.onNext(replyTwo2);
		responseObserver2.onCompleted();
	}

}
