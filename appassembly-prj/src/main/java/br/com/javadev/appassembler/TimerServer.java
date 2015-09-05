package br.com.javadev.appassembler;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimerServer {

  public static void main(String[] args) {
    try {
	  start();
	} catch (IOException ioe) {
	  System.out.println("Error: " + ioe.getMessage());
	}
  }
  
  public static void start() throws IOException {
    ServerSocket listener = new ServerSocket(5000);
    
	try {
      while (true) {
        Socket socket = listener.accept();
        try {
          PrintWriter out =
            new PrintWriter(socket.getOutputStream(), true);
          out.println(new Date().toString());
        } finally {
          socket.close();
        }
      }
    }
    finally {
      listener.close();
    }
  }
}