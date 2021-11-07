package com.medical.clinic.bookingService;
//marek

import java.util.concurrent.TimeUnit;

import com.medical.clinic.bookingService.BookingGrpc;
import com.medical.clinic.bookingService.FreeDateReply2;
import com.medical.clinic.bookingService.FreeDateRequest2;
import com.medical.clinic.bookingService.BookingGrpc.BookingBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class BookingClient  {
	public static void main(String[] args) throws Exception {
	
	String host ="localhost";
	int port = 50051;
	
	ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

	//update stub which has 
	
	BookingBlockingStub stub = BookingGrpc.newBlockingStub(channel);
	
	// this line should be befoe try to make sure is working for another try
	
	FreeDateRequest2 request = FreeDateRequest2.newBuilder().setName(" We Have Free Times next Week").build();// it is set name because we have in proto file name		
	try {
		//HelloRequest request = HelloRequest.newBuilder().setName(" World").build();// it is set name because we have in proto file name		
		FreeDateReply2 reply = stub.askFreeDates(request);
		System.out.println(reply.getMessage());
		
	} catch(StatusRuntimeException e) {
		e.printStackTrace();
	} 
	
	
	//test again client application for another try - this return say hello again
	try {
			
		FreeDateReply2 replyAgain = stub.askFreeDatesAgain(request);
		System.out.println(replyAgain.getMessage());
		
	} catch(StatusRuntimeException e) {
		e.printStackTrace();
		
	} 
	
	
	//final check
	finally {
		channel.shutdown().awaitTermination(60, TimeUnit.SECONDS);
		
	}

	
}
			
	
	

}

