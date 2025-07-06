package serverclientconnection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 6656);
		System.out.println("Connected to server");
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello Server");
		dout.flush();
		System.out.println("Message sent to the server");
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		String response = din.readUTF();
		System.out.println("Response from the server"+response);
		dout.close();
		s.close();
	}

}
