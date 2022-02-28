package com.directi.training.dip.exercice_refactored;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        ReaderFile readerFile = new ReaderFile("./input.txt");
        WriterFile writerFile = new WriterFile("./output.txt");

        EncodingModule encodingModule = new EncodingModule(readerFile, writerFile);

        encodingModule.setReader(new ReaderNetwork("https", "localhost:4200", "index.html"));

        encodingModule.encode();
    }
}
