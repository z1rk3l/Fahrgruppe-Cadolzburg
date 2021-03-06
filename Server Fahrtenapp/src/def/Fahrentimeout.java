package def;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Fahrentimeout extends Thread{

    private Fahrten fahrten;
    
	public Fahrentimeout() throws IOException
	{
        fahrten=Fahrten.getInstance();
	}
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<Integer.parseInt(fahrten.count());i++)
			{
				java.util.Date d = new java.util.Date();
				if(d.getHours()>=Integer.parseInt(fahrten.getList().get(i).stunde)&&d.getMinutes()>Integer.parseInt(fahrten.getList().get(i).minute))
				{
					fahrten.getList().remove(i);
				}
			}
		}
	}
}
