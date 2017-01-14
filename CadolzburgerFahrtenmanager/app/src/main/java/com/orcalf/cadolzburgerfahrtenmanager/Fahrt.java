package com.orcalf.cadolzburgerfahrtenmanager;

/**
 * Created by Orcalf on 13.01.2017.
 */

public class Fahrt {

    private String zeit,ort,kommentar,fahrer;
    public Fahrt()
    {

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
        value = s.split("[#]");
        return new Fahrt(value[0],value[1],value[2],value[3]);
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
