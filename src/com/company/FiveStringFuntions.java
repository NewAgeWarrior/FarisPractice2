package com.company;

public class FiveStringFuntions {

    public static void lengthOfString(String a){
        int c= a.length();
        System.out.println("Length of string by defining functions is:"+c);
    }

    public static void concatStringToString(String a, String b){
        String c = a.concat(b);
        System.out.println("Concating the string by defining function is:"+c);
    }

    public static void subStringToString(String a, String b){
        String d = a.concat(b);
        d.substring(1,6);
        System.out.println("Substring the string by defining function is:"+d);
    }

    public static void isStringEmpty(String a){
        boolean c= a.isEmpty();
        System.out.println("Is Empty using function:"+c);
    }

    public static void main(String[] args){

        //declaring a string
        String a= "Faris";
        String b= "Shaikh";

        //Checking string length function.
        int c= a.length();
        System.out.println("String lenght from string a is:"+c);

        //Using Function to describe the length
        lengthOfString(a);

        //Concating string a with string b

        String d= a.concat(b);
        System.out.println("String after contacting is:"+d);

        //Using Function to describe the concat the string
        concatStringToString(a,b);

        //Substring string d
        String e= d.substring(1,6);
        System.out.println("String after using substring is:"+e);

        //Using Function to describe the SubString the string
        subStringToString(a,b);

        //isEmpty string
        boolean f = e.isEmpty();
        System.out.println("Is string empty:"+f);

        //Using Function to describe the String is empty or not
        isStringEmpty(a);

        //Replace string
        String g = e.replace("S","e");
        System.out.println("Replacing S with e using replace function:"+g);

        //Using Function to describe the string is getting replace
        replaceString(a,e);
    }

    public static void replaceString(String a, String replaceElementName){
        String c= a.replace("a","w");
        System.out.println("AFter calling function we got this output:"+c);

    }

}
