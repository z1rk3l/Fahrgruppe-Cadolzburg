package def;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	//Testedit
	private ServerSocket serversocket;
	
	public Server() throws IOException
	{
		serversocket=new ServerSocket(500);
		handleClients();
	}
	public void handleClients() throws IOException
	{
		while(true)
		{
			System.out.println("Waiting for connection..");
			Socket client=serversocket.accept();
			System.out.println("Got a connection");
			new ClientHandle(client).start();
		}
	}
	

}
