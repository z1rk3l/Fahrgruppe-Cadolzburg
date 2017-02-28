package com.orcalf.cadolzburgerfahrtenmanager;

/**
 * Created by Orcalf on 13.01.2017.
 */

public class Fahrt {

    private String name,abfahrt,ankunft,kommentar,stunde,minute,plaetze;

    public Fahrt()
    {

    }
    public void set(String name,String abfahrt,String ankunft,String kommentar,String stunde,String minute,String plaetze)
    {
        this.name = name;
        this.abfahrt = abfahrt;
        this.ankunft = ankunft;
        this.kommentar = kommentar;
        this.stunde = stunde;
        this.minute = minute;
        this.plaetze = plaetze;
    }
    public Fahrt fahrtAusString(String s)
    {
        String[] value = new String[7];
        value = s.split("[#]");
        for (int i=0;i<7;i++)
        {
            System.out.println(value[i]);
        }
        return new Fahrt(value[0],value[1],value[2],value[3],value[4],value[5],value[6]);
    }
    public Fahrt(String name,String abfahrt,String ankunft,String kommentar,String stunde,String minute,String plaetze)
    {
        this.name = name;
        this.abfahrt = abfahrt;
        this.ankunft = ankunft;
        this.kommentar = kommentar;
        this.stunde = stunde;
        this.minute = minute;
        this.plaetze = plaetze;
    }
    public String getString()
    {
        return name+"#"+abfahrt+"#"+ankunft+"#"+kommentar+"#"+stunde+"#"+minute+"#"+plaetze;
    }
}
