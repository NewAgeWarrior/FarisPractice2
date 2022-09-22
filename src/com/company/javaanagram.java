package com.company;
import java.util.Arrays;
class javaanagram
{
    public static void main (String[]args)
    {
        String x = "Faris";  //input 1
        String y = "Arisf"; //input 2

        x = x.replace (" ","");  // removing spaces
        y = y.replace (" ", "");

        x = x.toLowerCase();  // converting to a specific Case(uppercase/lowercase)
        y = y.toLowerCase();

        char a [] = x.toCharArray(); // putting input in Arrays
        char b [] = y.toCharArray();


        Arrays.sort(a); // putting Arrays in alphabetic order
        Arrays.sort(b);

        Boolean result=Arrays.equals(a,b); //comparing two Arrays

        if(result==true){

            System.out.println("Strings are Anagram");   //condition
        }
        else{
            System.out.println("Strings are not Anagram");
        }

    }
}