package org.example.subscriberinfo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A simple server that listens on port 5000, accepts one connection,
 * reads a Protobuf Subscriber message, and prints it to the console.
 */
public class ProtobufServer {
  public static final int PORT = 5002;

  public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(PORT)) {
      System.out.println("Server listening on port " + PORT + "...");

      // Accept a single client connection (for demonstration)
      try (Socket clientSocket = serverSocket.accept()) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress());

        // Read protobuf bytes from the client
        InputStream in = clientSocket.getInputStream();

        // Parse bytes as a Subscriber message
        SubscriberProto.Subscriber subscriber = SubscriberProto.Subscriber.parseFrom(in);

        System.out.println("Received Subscriber:");
        System.out.println("  ID:     " + subscriber.getSubscriberId());
        System.out.println("  Name:   " + subscriber.getName());
        System.out.println("  Status: " + subscriber.getStatus());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
