package com.company;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        var paths = new String [] {

                "\\Users\\mk\\Desktop\\f1.txt",
                "\\Users\\mk\\Desktop\\f2.txt",
        };

        var fileReader = new FileReader();
        var result = fileReader.transform(paths);

        }
}
