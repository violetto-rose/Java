// Develop a program on a datagram socket for client/server to display the messages on client side, typed at the server side.

package Datagram;

import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            try (DatagramSocket socket = new DatagramSocket(9875)) {
                byte[] buffer = new byte[1024];
                System.out.println("Client is running. Waiting for messages...");
                while (true) {
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    socket.receive(packet);
                    String message = new String(packet.getData(), 0, packet.getLength());
                    System.out.println("Message from server: " + message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}