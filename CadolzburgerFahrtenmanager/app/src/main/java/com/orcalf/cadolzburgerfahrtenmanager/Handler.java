package com.orcalf.cadolzburgerfahrtenmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Orcalf on 10.12.2016.
 */
public class Handler {

    private String content;
    private Socket connection;
    private PrintWriter zumServer;
    private BufferedReader vomServer;
    private static Handler instance=null;
    protected Handler() throws IOException
    {
        connect();
    }
    public static Handler getInstance() throws IOException
    {
        if(instance == null)
        {
            instance = new Handler();
        }
        return instance;
    }
    public void connect() throws IOException
    {

        connection= new Socket();
        connection.connect(new InetSocketAddress("192.168.178.153", 500), 1000);


        zumServer = new PrintWriter(connection.getOutputStream(), true);
        vomServer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        System.out.println("Verbunden!");

    }

    public String getContent() throws IOException
    {
        String count=vomServer.readLine();
        String message=vomServer.readLine();
        System.out.println(message);
        return message;
    }
    public void sendeFahrt(Fahrt f)
    {
        zumServer.println(f.getString());
    }
}
