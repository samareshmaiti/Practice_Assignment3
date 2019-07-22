package com.stackroute.pe3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWords {
   public Map<String,Integer> countEachWords(String fileName) throws FileNotFoundException
    {
        Map<String,Integer> map=new HashMap<String,Integer>();
        Scanner file=new Scanner(new File(fileName));
        int count=0;
        //try {
            while (file.hasNext()) {
                String word = file.next();

                if (map.containsKey(word)) {
                    count = map.get(word);
                    map.put(word, count);
                } else {
                    map.put(word, 1);
                }
            }
            file.close();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry);
            }
       // }
        //catch(FileNotFoundException e)
       // {
            //return "FileNotFoundException";
       // }

        return map;
    }

}
