package com.statefarm;

public class Application {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Carol", "Daniel"};
        System.out.println(toSentence(names));




    }

    public static String toSentence(String[] param)
    {
        String result = "";
        System.out.println(param.length);
        for(int i = 0; i < param.length; i++)
        {
            result+=param[i];
            if(i == param.length-2)
            {
                System.out.println(i);
                result+=" and ";
            }
            else if(i < param.length-1)
            {
                result+=", ";
            }
        }
        return result;
    }

}
