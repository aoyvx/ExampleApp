package com.example.exampleapp.echo;

import java.net.URL;
import java.net.URLConnection;

public class EchoConnection extends URLConnection {


    protected EchoConnection(URL url) {
        super(url);
        super.connected = true;
    }

    @Override
    public void connect() {

    }

    @Override
    public String getContent() {
        return "hello:"+getURL().getPath();
    }

}
