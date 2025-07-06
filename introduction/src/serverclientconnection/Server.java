package serverclientconnection;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6656);
		System.out.println("Server is waiting doe a client");
		
		Socket s = ss.accept();
		System.out.println("Client connected!");
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String message = dis.readUTF();
		
		System.out.println("Message from client: "+message);
		
		
		dis.close();
		s.close();
		ss.close();
	}

}
