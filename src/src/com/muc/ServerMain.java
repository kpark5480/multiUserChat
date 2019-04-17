package com.muc;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStream;
public class ServerMain {
    public static void main(String[] args){
        int port = 8818;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                System.out.println("About to accept client connection...");
                Socket clientSocket = serverSocket.accept();
                System.out.println
                OutputStream outputStream=clientSocket.getOutputStream();
                outputStream.write("Hello World \n".getBytes());
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        }
    }
