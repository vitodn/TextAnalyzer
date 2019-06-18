package com.company.transformers;
import com.sun.org.apache.xpath.internal.operations.String;
import jdk.jshell.spi.Execution

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader implements StringTransformer

{

    @Override
    public string [] transform(String[] input) throws IOException
    {

        var fileContents = new String() [input.length];

        for (int= i = 0; i<input.length; i++) {
            try {

            var content = Files.readAllLines(Paths.get(input[i]));
            fileContents [i] = content;
        } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
                fileContents[i] = "";


            }
    }
}
