package com.statefarm;

public class CommandlineArguments {



    public static void main(String[] args) {



args = new String[2];
        args[0] = "Jon Snow";
    args[1] = "";
        if (args[0] == "" && args[1] == "") {
            System.out.println("please specify a name and email");
        } else if (args[1] == "") {
            System.out.println("please specify an email for " + args[0]);
        } else {

            System.out.println(args[0]+" <"+args[1]+">");
        }








    }

}
