package com.stackroute.pe3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;

public class FileFinder {
    public String getFileName(String fileLocation) throws FileNotFoundException {
        String resultString="";
                File file = new File(fileLocation);
                String[] files = file.list(new FilenameFilter() {


                    public boolean accept(File dir, String name) {
                        if(name.toLowerCase().endsWith(".txt")){
                            return true;
                        } else {
                            return false;
                        }
                    }
                });
                for(String f:files)
                    resultString=f;

        return resultString;
    }
}
