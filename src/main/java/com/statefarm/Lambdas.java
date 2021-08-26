package com.statefarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambdas {


    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("My Report.csv", "The Best Deck.pdf", "Thanks for all the fishes.doc"));


        for (String item : words) {
            System.out.println(item.replaceAll(" ", "-"));
            item.replaceAll(" ", "-");


        }

        //words.forEach(word -> System.out.println(word));

    }
}