import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server {
	
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
			new ClientHandle(client).start();
		}
	}
	

}
