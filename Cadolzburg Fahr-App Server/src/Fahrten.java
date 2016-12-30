import java.util.LinkedList;

public class Fahrten {
	
	private LinkedList<Fahrt> fahrten;
	private static Fahrten instance = null;
	
	protected Fahrten() 
	{
		fahrten=new LinkedList<Fahrt>();
		fahrten.add(new Fahrt("Tim Emmert","Deberndorf","16.00","Kann zwei mitnehmen!"));
		fahrten.add(new Fahrt("test1","test2","test3","test4"));
	}
	public static Fahrten getInstance() 
	{
		if(instance == null) 
		{
	         instance = new Fahrten();
	    }
	    return instance;
	}
	public String count()
	{
		return String.valueOf(fahrten.size());
	}
	public String sendStrings()
	{
		String total="";
		for(int i=0;i<fahrten.size();i++)
		{
			total+=fahrten.get(i).getString()+";";
		}
		return total;
	}
	
}
