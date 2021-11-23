package com.directi.training.dip.exercice_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    public void encode(Reader reader, Writer writer)throws IOException {
        String str = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        writer.write(encodedString);
    }
}
