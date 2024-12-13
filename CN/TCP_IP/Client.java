// Using TCP/IP sockets, write a client-server program to make the client send the file name and to make the server send back the contents of the requested file if present.

package TCP_IP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        String ipAddress = "localhost";
        int portNumber = 9000;
        Socket socket = new Socket(ipAddress, portNumber);
        System.out.println("Enter the name of the file ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(fileName);
        BufferedReader bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String string = "";
        while ((string = bReader.readLine()) != null) {
            System.out.println(string);
        }
        scanner.close();
        socket.close();
    }
}
