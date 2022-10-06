package com.company;

public class TestCasesString2 {

    public static void main(String[] args) {

        String s= "abcdeab";
        String s1= "abfsbfhfsd";

        String a = s.substring(0,1);
        int a1 = 1;
        String a2 = String.valueOf(a1);
        System.out.println(a2);

        String b = s.substring(1,2);
        int b1 = 2;
        String b2 = String.valueOf(b1);
        System.out.println(b2);

        String c = s.substring(2,3);
        int c1 = 3;
        String c2 = String.valueOf(c1);
        System.out.println(c2);

        String d = s.substring(3,4);
        int d1 = 4;
        String d2= String.valueOf(d1);
        System.out.println(d2);

        String e = s.substring(4,5);
        int e1 = 5;
        String e2 = String.valueOf(e1);
        System.out.println(e2);

        String aa = s.substring(5,6);
        int aa1 = a1;
        String aa2 = String.valueOf(aa1);
        System.out.println(aa1);

        String bb = s.substring(7);
        int bb1 = b1;
        String bb2 = String.valueOf(bb1);


        int o = (a1+b1+c1+d1+e1+aa1+bb1);


        System.out.println(o);

    }
}
