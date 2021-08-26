package com.statefarm;

import java.util.HashMap;

public class saved {

    public static HashMap<String, Long> letterCount(String strParam) {

        HashMap<String, Long> characterCountMap;
        String strParamLower = strParam.toLowerCase();
        characterCountMap = count(strParamLower,strParamLower);
        showMap(characterCountMap);

        return characterCountMap;

    }

    public static void showMap(HashMap<String, Long> getMap)
    {
        for(String getData : getMap.keySet())
        {
            System.out.println("Key: "+getData);
            System.out.println("Value: "+getMap.get(getData));
        }
    }

    public static HashMap<String, Long> createMap(String param, int[] countArray)
    {
        HashMap<String, Long> mapCreation = new HashMap<String, Long>();
        for(int i = 0; i < param.length(); i++)
        {
            if(mapCreation.containsKey(param.charAt(i)) == false)
            {
                mapCreation.put(Character.toString(param.charAt(i)), (long) countArray[i]);
            }
        }
        return mapCreation;
    }

    public static HashMap<String, Long> count(String stringParam, String baseString)
    {
        HashMap<String, Long> mapCreation = new HashMap<String, Long>();
        int[] countArray = new int[stringParam.length()];
        int returnCount = 0;
        for(int i = 0; i < stringParam.length(); i++)
        {
            for(int j = 0; j < stringParam.length(); j++)
            {
                //System.out.println("Searching for: "+stringParam.charAt(i)+ " against "+ baseString.charAt(j));
                if(stringParam.charAt(i) == (baseString.charAt(j)))
                {
                    countArray[i]++;
                }
            }
        }
        for(int i = 0; i < countArray.length; i++)
        {
            //System.out.println(countArray[i]);
        }
        mapCreation = createMap(stringParam,countArray);
        return mapCreation;





}
