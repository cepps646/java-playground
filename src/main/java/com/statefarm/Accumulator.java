package com.statefarm;

public class Accumulator {


    public String toSentence(String[] input) {

        //if the empty case return the initial accumulator
        if (input.length == 0 || input[0] == "") {
            return "";
        }

        String resultString = input.toString();
        return resultString;
    }

}
