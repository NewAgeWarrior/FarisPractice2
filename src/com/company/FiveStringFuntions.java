package com.company;

public class FiveStringFuntions {

    public static void main(String[] args){

        //declaring a string
        String a= "Faris";
        String b= "Shaikh";

        //Checking string length function.
        int c= a.length();
        System.out.println("String lenght from string a is:"+c);

        //Concating string a with string b

        String d= a.concat(b);
        System.out.println("String after contacting is:"+d);

        //Substring string d
        String e= d.substring(1,6);
        System.out.println("String after using substring is:"+e);

        //isEmpty string
        boolean f = e.isEmpty();
        System.out.println("Is string empty:"+f);

        //Replace string
        String g = e.replace("S","e");
        System.out.println("Replacing S with e using replace function:"+g);

    }
}
