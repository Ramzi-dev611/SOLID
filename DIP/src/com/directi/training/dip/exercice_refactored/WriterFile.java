package com.directi.training.dip.exercice_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile implements Writer{

    BufferedWriter writer;

    public WriterFile(String filePath)throws IOException{
        writer = new BufferedWriter(
                new FileWriter(filePath)
        );
    }

    public void write(String input) throws IOException {
        try{
            writer.append(input);
        }
        finally {
            writer.close();
        }
    }

}
