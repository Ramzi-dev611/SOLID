package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReaderNetwork implements Reader{
    private URL url;

    public ReaderNetwork(String protocol, String host, String file)throws Exception {
        url = new URL(protocol, host, file);
    }

    public String read() throws IOException{
        StringBuilder str = new StringBuilder();
        InputStreamReader reader =null;
        try{
            InputStream in = url.openStream();
            reader = new InputStreamReader(in);
            int c = reader.read();
            while (c != -1){
                str.append((char)c);
                c = reader.read();
            }
        } finally {
            reader.close();
            return str.toString();
        }
    }
}
