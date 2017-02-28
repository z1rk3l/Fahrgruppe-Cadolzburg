package def;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


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
	public synchronized void log(String s)
	{
		try {
		    Files.write(Paths.get("ServerLogs.txt"), (s+"\n").getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		}
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

