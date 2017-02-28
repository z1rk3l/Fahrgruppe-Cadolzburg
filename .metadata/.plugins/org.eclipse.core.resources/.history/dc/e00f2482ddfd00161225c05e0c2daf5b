package def;

import java.util.LinkedList;

public class Fahrten {
	
	private LinkedList<Fahrt> fahrten;
	private static Fahrten instance = null;
	
	protected Fahrten() 
	{
		fahrten=new LinkedList<Fahrt>();
		fahrten.add(new Fahrt("Tim Emmert","Deberndorf","Cadolzburg","Kein kommentar","16","2","2"));
		fahrten.add(new Fahrt("Tim Emmert","Cadolzburg","Deberndorf","Kein kommentar","7","12","2"));
	}
	public synchronized void add(Fahrt f)
	{
		fahrten.add(f);
	}
	public synchronized static Fahrten getInstance() 
	{
		if(instance == null) 
		{
	         instance = new Fahrten();
	    }
	    return instance;
	}
	public synchronized String count()
	{
		return String.valueOf(fahrten.size());
	}
	public synchronized String sendStrings()
	{
		String total="";
		for(int i=0;i<fahrten.size();i++)
		{
			total+=fahrten.get(i).getString()+";";
		}
		return total;
	}
	public synchronized void mitfahrer(String s)
	{
		for(int i=0;i<fahrten.size();i++)
		{
			System.out.println("Vergleiche "+s+" mit "+fahrten.get(i).toString());
			if((fahrten.get(i).name+fahrten.get(i).abfahrt+fahrten.get(i).ankunft).equals(s))
			{
				fahrten.get(i).plaetze=String.valueOf(Integer.parseInt(fahrten.get(i).plaetze)-1);
			}
		}
	}
	
}
