// Develop a program on a datagram socket for client/server to display the messages on client side, typed at the server side.

package Datagram;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            try (DatagramSocket socket = new DatagramSocket(9876)) {
                byte[] buffer = new byte[1024];
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Server is running. Type a message:");
                while (true) {
                    String message = reader.readLine();
                    buffer = message.getBytes();
                    socket.send(new DatagramPacket(buffer, buffer.length, InetAddress.getByName("localhost"), 9875));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
