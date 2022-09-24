package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class hashMapProgram {

    public static void main(String[] args) {

        Map<Integer, String > map = new HashMap<Integer,String>();
        map.put(2,"Faris Shaikh");
        map.put(1,"Fazil Shaikh");
        map.put(3,"Ikrama Shaikh");

        //Print the elemets by using key only in traverse order
        printingHashMapUsingKey(map);

        //Printing Hash Map Elements By Using Comapre Key
        printingHashMapUsingKeyCompare(map);

        //Print the elements is Reverse Order using keys
        printingHashMapUsingKeyInReverseOrder(map);

        //Printing Hash Map Elements By Using Comapre Values
        printingHashMapUsingValuesCompare(map);

        //Print the elements is Reverse Order using Values
        printingHashMapUsingValuesInReverseOrder(map);





    }

    //Function for printing elements using key
     public static void printingHashMapUsingKey(Map<Integer, String> mappingHash) {

        for (Map.Entry<Integer, String> entry : mappingHash.entrySet())
            System.out.println(entry.getKey()+" "+entry.getValue());

    }

    //Function for printing element using ComparingByKeys
    public static void printingHashMapUsingKeyCompare(Map<Integer, String> mappingHash){

        System.out.println("\nPrinting Hash Map using compare key method:");
        mappingHash.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }

    //Function for printing elements using key but in reverse order
    public static void printingHashMapUsingKeyInReverseOrder(Map<Integer, String> mappingHash) {

       System.out.println("\nPrinting Hash Map in reverse order using keys:");
       mappingHash.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

    }


    //Function for printing element using ComparingByValues
    public static void printingHashMapUsingValuesCompare(Map<Integer, String> mappingHash){

        System.out.println("\nPrinting Hash Map using compare Values method:");
        mappingHash.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }

    //Function for printing elements using key but in reverse order
    public static void printingHashMapUsingValuesInReverseOrder(Map<Integer, String> mappingHash) {

        System.out.println("\nPrinting Hash Map in reverse order using Values:");
        mappingHash.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }


}
