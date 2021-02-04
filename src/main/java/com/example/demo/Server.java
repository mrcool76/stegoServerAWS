package com.example.demo;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread {
    private boolean exit = false;
    private ServerSocket in;
    //private static List<nClient> chatClients = new ArrayList<nClient>();


       /* int port = 14001;
        Server chatServer = new Server();
        chatServer.setPort(port);
        chatServer.checkForExit.start();
       // chatServer.start();						//Thread checks each client for incoming message
        chatServer.go();*/


    Thread connection = new Thread() {
        public void run(Socket socket) {

        }
    };
}
