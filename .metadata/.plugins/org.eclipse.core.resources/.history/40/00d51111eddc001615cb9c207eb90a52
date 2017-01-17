package def;


public class Fahrt {
	
	private String zeit,ort,plaetze,ziel,kommentar,fahrer;
	
	public Fahrt()
	{
		
	}
	public void set(String zeit,String ort,String kommentar,String fahrer,String plaetze,String ziel)
	{
		this.zeit=zeit;
		this.ort=ort;
		this.kommentar=kommentar;
		this.fahrer=fahrer;
	}
	public void set(String zeit,String ort,String kommentar,String fahrer)
	{
		this.zeit=zeit;
		this.ort=ort;
		this.kommentar=kommentar;
		this.fahrer=fahrer;
	}
	public Fahrt fahrtAusString(String s)
	{
		String[] value=new String[4];
		if(s==null)
			return null;
		value = s.split("[#]");
        if(value.length!=4)
        	return null;
        return new Fahrt(value[0],value[1],value[2],value[3]);
	}
	public Fahrt(String zeit,String ort,String kommentar,String fahrer,String plaetze,String ziel)
	{
		this.zeit=zeit;
		this.ort=ort;
		this.kommentar=kommentar;
		this.fahrer=fahrer;
	}
	public Fahrt(String zeit,String ort,String kommentar,String fahrer)
	{
		this.zeit=zeit;
		this.ort=ort;
		this.kommentar=kommentar;
		this.fahrer=fahrer;
	}
	public String getString()
	{
		return fahrer+"#"+ort+"#"+zeit+"#"+kommentar;
	}
}
