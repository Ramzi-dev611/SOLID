package com.directi.training.dip.exercice_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile implements Reader{

    BufferedReader reader;

    public ReaderFile(String filePath) throws IOException {
        reader = new BufferedReader(
                new FileReader(filePath)
        );
    }

    public String read() throws IOException{
        String output = "", aLine;
        try{
            while ((aLine = reader.readLine()) != null) {
                output.concat(aLine + '\n');
            }
        }
        finally{
            reader.close();
            return output.substring(0,output.length()-2);
        }
    }
}
