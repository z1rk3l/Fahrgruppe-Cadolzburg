package com.orcalf.cadolzburgerfahrtenmanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Orcalf on 10.12.2016.
 */
public class Handler {

    private String content;
    private Socket connection;
    private PrintWriter zumServer;
    private BufferedReader vomServer;

    public Handler() throws IOException
    {
        connect();
    }

    public void connect() throws IOException
    {
        try {
            connection=new Socket("192.168.178.153",500);
            zumServer = new PrintWriter(connection.getOutputStream(), true);
            vomServer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            System.out.println("Verbunden!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR_____");
        }

    }

    public String getContent() throws IOException
    {
        String count=vomServer.readLine();
        String message=vomServer.readLine();
        System.out.println(message);
        return message;
    }
}
