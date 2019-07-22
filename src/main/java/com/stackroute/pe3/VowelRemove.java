package com.stackroute.pe3;

public class VowelRemove {
    public String[] removeVowel(String[] countryNames) throws NullPointerException {

        int i;
        String[] resultString=new String[countryNames.length];

        //Replaces the vowels
        try {
            for (i = 0; i < countryNames.length; i++) {
                    resultString[i] = countryNames[i].replaceAll("[aeiou]", "");
                }
            }
            catch(NullPointerException e)
            {
                return new String[]{"NullPointerException"};
            }

        //returns the resulting changed values
        return resultString;
    }
}
