package def;

import java.io.IOException;
import java.io.PrintWriter;


public class CreateLogs {
	
	private static CreateLogs instanceLog = null;
	private PrintWriter writer;
	protected CreateLogs() 
	{
		try{
		    writer = new PrintWriter("ServerLogs.txt", "UTF-8");
		    writer.println("-----Logging-----");
		    writer.close();
		} catch (IOException e) {
		}
	}
	public void log(String s)
	{
		writer.println(s);
	}
	public synchronized static CreateLogs getInstance() 
	{
		if(instanceLog == null) 
		{
	         instanceLog = new CreateLogs();
	    }
	    return instanceLog;
	}

	
}

