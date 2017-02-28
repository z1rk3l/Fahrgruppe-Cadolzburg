package def;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	//Testedit
	private ServerSocket serversocket;
	private CreateLogs l;
	public Server() throws IOException
	{
		serversocket=new ServerSocket(500);
		l=CreateLogs.getInstance();
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
			l.log((((InetSocketAddress) client.getRemoteSocketAddress()).getAddress()).toString().replace("/",""));
		}
	}
	

}
