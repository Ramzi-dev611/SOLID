package com.directi.training.dip.exercice_refactored;

import java.io.IOException;

public class WriterDatabase implements Writer{

    private DataBase database;

    public WriterDatabase(){
        database = new DataBase();
    }
    public void write(String input) throws IOException{
        database.write(input);
    }
}
