package com.stackroute.pe3;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public String getFileContent(String fileName) throws IOException,FileNotFoundException {
        String str="";
        try {

            FileReader fr = new FileReader(fileName);
            int i;
            while ((i = fr.read()) != -1) {
                str = Character.toString((char) i);
            }
            fr.close();
        }
        catch(FileNotFoundException e)
        {
            return "FileNotFoundException";
        }

        return str;
    }

}
