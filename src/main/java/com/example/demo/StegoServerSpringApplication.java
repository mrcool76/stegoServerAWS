package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
public class StegoServerSpringApplication {

	public static void main(String[] args) throws IOException {
		//System.out.println("DSADSADSA");
		SpringApplication.run(StegoServerSpringApplication.class, args);

		int cTosPortNumber = 1777;
		String str;

		ServerSocket servSocket = new ServerSocket(cTosPortNumber);
		System.out.println("Waiting for a connection on " + cTosPortNumber);
		while(true){
			Socket fromClientSocket = servSocket.accept();
			System.out.println("ACCEPTED Conn");
			clientThread newClient = new clientThread(fromClientSocket);
			newClient.start();
			System.out.println("thread succesffully started");
		}
	}

}
