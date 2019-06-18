package com.company.transformers;
import com.sun.org.apache.xpath.internal.operations.String;
import jdk.jshell.spi.Execution
import java.nio.file.Files;

public class FileReader implements StringTransformer

{

    @Override
    public string [] transform(String[] input) {

        var fileContents = new String() [input.length];

        for (int= i = 0; i<input.length; i++) {

            vsr = content = readFile (input [i]);
            fileContents [i] = content;

        }
    }
}
