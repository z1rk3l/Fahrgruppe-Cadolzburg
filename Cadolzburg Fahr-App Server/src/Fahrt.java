
public class Fahrt {
	
	private String zeit,ort,kommentar,fahrer;
	
	public void set(String zeit,String ort,String kommentar,String fahrer)
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
