package def;

import java.io.IOException;

public class Main {
	private Server server;
	
	public static void main(String[]args)
	{
		new Main();
	}
	public Main()
	{
		new Fahrten();
		try {
			new Fahrentimeout().start();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			server=new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
