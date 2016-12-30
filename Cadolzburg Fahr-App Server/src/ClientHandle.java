import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandle extends Thread{
	
	private PrintWriter zumClient;
    private BufferedReader vomClient;
    private Fahrten fahrten;
    
	public ClientHandle(Socket connection) throws IOException
	{
		zumClient = new PrintWriter(connection.getOutputStream(), true);
        vomClient = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        fahrten=Fahrten.getInstance();
	}
	
	public void run()
	{
		zumClient.println(fahrten.count());
		String s=fahrten.sendStrings();
		zumClient.println(s);
		System.out.println("Sende "+s);
	}
}
