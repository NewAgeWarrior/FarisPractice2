package com.company;

public class TestCasesString1 {

    public static void main(String[] args) {

        String s= "abcdef";

        String a = s.substring(0,1);
        String b = s.substring(1,2);
        String c = s.substring(2,3);
        String d = s.substring(3,4);
        String e = s.substring(4,5);
        String f = s.substring(5);

        String str1= a+c+e;
        String str2 = b+d+f;

        System.out.println(str1+"\n"+str2);

    }
}
