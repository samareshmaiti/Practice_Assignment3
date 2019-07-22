package com.stackroute.pe3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;

public class FileFinder {
    public String getFileName(String fileLocation) throws  FileNotFoundException,NullPointerException {
        String resultString="";
        try {
            File file = new File(fileLocation);
            String[] files = file.list(new FilenameFilter() {


                public boolean accept(File dir, String name) {
                    if (name.toLowerCase().endsWith(".txt")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            for (String f : files)
                resultString = f;
        }
        catch(NullPointerException e)
        {
            return "NullPointerException";
        }

        return resultString;
    }
}
