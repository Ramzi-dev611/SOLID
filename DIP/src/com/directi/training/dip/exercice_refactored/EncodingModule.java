package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    Reader reader= null;
    Writer writer = null;

    public EncodingModule(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }


    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void encode() throws IOException {
        String str = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        writer.write(encodedString);
    }
}
